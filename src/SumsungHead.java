public class SumsungHead implements IHead{
    private int price;

    public SumsungHead(int price) {this.price = price;}

    public SumsungHead(){}

    public void setPrice(int price) {this.price = price;}

    @Override
    public void speek() {
        System.out.println("Hello world");
    }

    @Override
    public int getPrice() {return price;}

}
