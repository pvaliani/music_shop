
// create the musical instrument as an abstract class as we want to be able to
// test instruments which are the subclass of instrument and not just a musical instrument per se

public abstract class MusicalInstrument implements IPlay, ISell {

    private String name;
    private String brand;
    private double costPrice;
    private double salePrice;

//    An instrument will have common properties of a name and brand which can be passed down
//    to the sub-class

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public MusicalInstrument(String name, String brand, double costPrice, double salePrice){
        this.name = name;
        this.brand = brand;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

//    getters and setters for the instrument name and brand for the shop to be able
//    to input information about the items in the store

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double calculateMarkup(){
        return this.salePrice - this.costPrice;
    }
}
