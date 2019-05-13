package lessons.lesson2;

public class LogicalOperators2 {
    public static void main(String[] args) {

        boolean t = true, f = false;

        boolean x = t && f;

        System.out.println("t && t = " + (t && t));
        System.out.println("t && f = " + (t && f));
        System.out.println("f && t = " + (f && t));
        System.out.println("f && f = " + (f && f));

        System.out.println();

        System.out.println("t || t = " + (t || t));
        System.out.println("t || f = " + (t || f));
        System.out.println("f || t = " + (f || t));
        System.out.println("f || f = " + (f || f));

        // x [1000:2000]
        System.out.println();
        int y = 1940;
        x = y >= 1000 && y <= 2000;
        System.out.println("x [1000:2000] = " + x);
        System.out.println("x ![1000:2000] = " + !x);

        x = y < 1000 || y > 2000;
        System.out.println("x ![1000:2000] = " + x);

        // not allowed
        //x in [1000:2000] or [4000:5000]
        x = (y >= 1000 && y <= 2000) || (y >= 4000 && y <= 5000);

        // allowed
        //x in <1000 or [2000:4000] or >5000
        boolean left, center, right;
        left = y < 1000;
        center = y > 2000 && y < 4000;
        right = y > 5000;

        boolean isIn = left || center || right;

        System.out.println("isIn = " + isIn + ", value = " + y);
    }
}
