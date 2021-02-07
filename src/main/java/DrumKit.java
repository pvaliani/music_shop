public class DrumKit {

    private String numberOfCymbals;
    private String numberOfShells;

    public DrumKit(String numberOfCymbals, String numberOfShells){
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfShells = numberOfShells;
    }

    public String getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public void setNumberOfCymbals(String numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }

    public String getNumberOfShells() {
        return numberOfShells;
    }

    public void setNumberOfShells(String numberOfShells) {
        this.numberOfShells = numberOfShells;
    }
}
