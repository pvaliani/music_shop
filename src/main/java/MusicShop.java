import java.lang.reflect.Array;
import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

//    a shop will have a name, a total till and a total stock quantity

    public MusicShop(String name, double till){
        this.name = name;
        this.till =  till;
        this.stock =  new ArrayList<ISell>();
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

//    retrieve the stock

    public int getStockCount(){
        return this.stock.size();
    }

//   add to stock

    public void addToStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

//    remove from stock
    public ISell removeFromStock(ISell stockItem) {
        return this.stock.remove(this.stock.indexOf(stockItem));
    }

//    clear the stock list

    public void removeAllStock() {
        this.stock.clear();
    }

//    calculate the total shop profit

    public double calculateTotalProfit() {
        double totalProfit = 0;
        for (ISell stockItem : stock) {
            totalProfit += stockItem.calculateMarkup();
        }
        return totalProfit;
    }
}
