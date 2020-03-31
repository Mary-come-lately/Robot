public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {this.price = price;}
    public ToshibaHead(){}

    public void setPrice(int price) {this.price = price;}

    @Override
    public int getPrice() {return price;}

    @Override
    public void speek() {
        System.out.println("My name is Toshiba");
    }

}
