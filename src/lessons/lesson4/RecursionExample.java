package lessons.lesson4;

public class RecursionExample {
    public static void main(String[] args) {
        String str = printNumbets(3);
        System.out.println(str);

        System.out.println();

        System.out.println(printNumbets(8));
    }

    static String printNumbets(int n) {
        if (n <= 0)
            return "";
        String str = printNumbets(n - 1) + " " + n;
        return str;
    }
}
