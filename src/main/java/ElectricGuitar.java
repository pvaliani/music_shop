public class ElectricGuitar extends MusicalInstrument implements IPlay {

    private boolean extendedRange = true;
    private int numberOfStrings;

    public ElectricGuitar(String name, String model, boolean extendedRange, int numberOfStrings) {
        super(name, model);
        this.numberOfStrings=numberOfStrings;
        this.extendedRange = true;
    }

    public boolean isExtendedRange() {
        return extendedRange;
    }

    public void setExtendedRange(boolean extendedRange) {
        this.extendedRange = extendedRange;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String playInstrument(){
        return "CHUN CHUN CHUN";
    }
}
