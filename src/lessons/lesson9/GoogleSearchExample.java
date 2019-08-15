package lessons.lesson9;

import kong.unirest.Unirest;

import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleSearchExample {
    static String search(String request){
        HttpResponse<String> response = (HttpResponse<String>) Unirest.get("http://www.google.com/search").queryString("q","cars")
                .asString();

        Unirest.get("http://httpbin.org/{method}")
                .routeParam("type","search")
                .queryString("q",request)
                .asJson();

        return response.body();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search line:");
        String line = sc.nextLine();

        String result = search(line);
        System.out.println(result);
}
}