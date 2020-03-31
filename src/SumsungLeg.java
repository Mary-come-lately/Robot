public class SumsungLeg implements ILeg {
    private  int price;

    public SumsungLeg(int price) {this.price = price;}
    public SumsungLeg(){}

    public void setPrice(int price) {this.price = price;}

    @Override
    public void step() {
        System.out.println("I can't walk");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
