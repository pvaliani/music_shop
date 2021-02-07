public abstract class MusicShop {

    private String name;
    private double till;

    public MusicShop(String name, double till){
        this.name = name;
        this.till =  till;
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
