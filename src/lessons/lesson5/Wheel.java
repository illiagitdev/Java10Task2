package lessons.lesson5;

public class Wheel {
    private String madeIn = "China";
    private int price = 100;
    private Hole hole = null;

    public Wheel(String madeIn){
        this.madeIn = madeIn;
        if(madeIn == "China"){
            hole = new Hole();
        }
    }
    public String getMadeIn() {
        return madeIn;
    }

    public int getPrice() {
        return price;
    }

    // типу void - бо нічого не повертає
    public void setPrice(int price){
        this.price = price;
    }

    public static class Hole{
        public float size;
    }
}
