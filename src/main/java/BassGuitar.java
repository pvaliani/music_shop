public class BassGuitar extends MusicalInstrument{

    private int numberOfStrings;

    public BassGuitar(String name, String model, double costPrice, double salePrice, int numberOfStrings){
        super(name, model, costPrice, salePrice);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

//    implements iplay to play the instrument sound

    public String playInstrument(){
        return "SLAPPA DA BASS";
    }

    public double calculateMarkup(){
        return 100.1;
    }
}
