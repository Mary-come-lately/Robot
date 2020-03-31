public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {}

    public void setPrice(int price) { this.price = price;}

    @Override
    public void upHand() {
        System.out.println("I have only left hand");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
