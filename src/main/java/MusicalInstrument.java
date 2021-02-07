public class MusicalInstrument {

    private String name;
    private String brand;

//    An instrument will have common properties of a name and brand which can be passed down
//    to the sub-class

    public MusicalInstrument(String name, String brand){
        this.name = name;
        this.brand = brand;
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
}
