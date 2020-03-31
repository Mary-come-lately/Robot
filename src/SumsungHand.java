public class SumsungHand implements IHand {
    private int price;

    public SumsungHand(int price) {this.price = price;}

    public SumsungHand(){}

    public void setPrice(int price) {this.price = price;}

    @Override
    public void upHand() {
        System.out.println("Hans up");
    }

    @Override
    public int getPrice() {return price;}
}
