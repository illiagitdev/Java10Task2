package lessons.lesson2;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean test1 = 10 < 100;
        System.out.println("10 < 100 : " + test1);
        System.out.println("10 > 100 : " +( 10 > 100)) ;

        System.out.println();

        System.out.println("10 <= 100 : " + ( 10 <= 100));
        System.out.println("10 >= 100 : " + ( 10 >= 100));

        System.out.println();

        System.out.println("10 != 100 : " + ( 10 != 100));

        System.out.println("10 >= 10 : " + ( 10 >= 10));
        System.out.println("10 <= 10 : " + ( 10 <= 10));

        System.out.println();

        System.out.println("10 > 10 : " + ( 10 > 10));
        System.out.println("!(10 > 10) : " + !( 10 > 10));

        System.out.println();
        boolean value = false;
        System.out.println("value " + value);
        System.out.println("!value " + !value);
    }
}
