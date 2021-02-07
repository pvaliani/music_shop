public class DrumKit extends MusicalInstrument implements IPlay {

    private String numberOfCymbals;
    private String numberOfShells;

    public DrumKit(String name, String model, String numberOfCymbals, String numberOfShells){
        super(name, model);
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

    //    implements iplay to play the instrument sound

    public String playInstrument(){
        return "TSK TSK TSK TSK";
    }
}
