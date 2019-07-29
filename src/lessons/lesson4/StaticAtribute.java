package lessons.lesson4;

public class StaticAtribute {
    static int i = 0;
    static
    {
        MethodOne();
        System.out.println("First static block");
    }

    public static void main(String[] args) {
        MethodOne();
        System.out.println("main method");
    }
    public static void MethodOne(){
        System.out.println(j);
    }
    static
    {
        System.out.println("second static block");
    }
    static int j = 22;
}
