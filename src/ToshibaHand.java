public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {this.price = price;}
    public ToshibaHand(){}

    public void setPrice(int price) {this.price = price;}

    @Override
    public int getPrice() {return price;}

    @Override
    public void upHand() {
        System.out.println("I have only right hand");
    }
}
