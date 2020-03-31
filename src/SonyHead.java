public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {}

    public void setPrice(int price) { this.price = price;}

    @Override
    public void speek() {
        System.out.println("Hello");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
