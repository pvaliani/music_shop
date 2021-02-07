public class BassGuitar extends MusicalInstrument implements IPlay{

    private int numberOfStrings;

    public BassGuitar(String name, String model, int numberOfStrings){
        super(name, model);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument(){
        return "SLAPPA DA BASS";
    }
}
