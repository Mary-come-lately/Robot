public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {this.price = price;}
    public ToshibaLeg(){}

    @Override
    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    @Override
    public void step() {
        System.out.println("Step to the left");
    }

}
