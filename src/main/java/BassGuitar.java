public class BassGuitar extends MusicalInstrument {

    private int numberOfStrings;

    public BassGuitar(String name, String model, int numberOfStrings){
        super(name, model);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
