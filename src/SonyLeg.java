public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {}

    public void setPrice(int price) {this.price = price;}

    @Override
    public void step() {
        System.out.println("Step to the right");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
