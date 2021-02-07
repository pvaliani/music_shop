public class MusicShop {

    private String name;
    private double till;
    private int stock;

//    a shop will have a name, a total till and a total stock quantity

    public MusicShop(String name, double till, int stock){
        this.name = name;
        this.till =  till;
        this.stock =  stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }
}
