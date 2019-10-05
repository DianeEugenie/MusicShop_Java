package shop;

import behaviours.ISell;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }


    public double calculatePotentialProfit() {
        double totalProfit = 0;

        for (ISell item: this.stock) {
            totalProfit += item.calculateMarkup();
        }

        return totalProfit;

    }

}
