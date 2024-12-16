import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<ShopItem> stock;
    public Shop() {
        this.stock = new ArrayList<>();
    }
    public Shop(List<ShopItem> stock) {
        this.stock = stock;
    }
    public void fillStock(ShopItem shopItem) {
        this.stock.add(shopItem);
    }
    public void showStock() {
        for (int i = 0; i < stock.size(); i++) {
            System.out.print(i + 1 + ". item: " + this.stock.get(i).getName() + ", " + this.stock.get(i).getPrice() + " Ft, " + this.stock.get(i).convertFreshnessToString() + " freshness");
            if (i == stock.size() - 1) {
                System.out.println();
            } else {
                System.out.println(",");
            }
        }
    }
    public float getStockValue() {
        float stockValue = 0;
        for (ShopItem shopItem: this.stock) {
            stockValue += shopItem.getPrice();
        }
        return stockValue;
    }
    public void sellItems(float price, boolean superHealthy) {
        float paid = 0;
        int index = 0;
        while (price >= paid && index < this.stock.size()) {
            if (superHealthy) {
                if (this.stock.get(index).calculateFreshness() == 2 && this.stock.get(index).getPreservativePercentage() <= 0.02f) {
                    if (paid + this.stock.get(index).getPrice() <= price) {
                        paid += this.stock.get(index).getPrice();
                        this.stock.remove(index);
                        index--;
                    }
                }
            } else {
                if (paid + this.stock.get(index).getPrice() <= price) {
                    paid += this.stock.get(index).getPrice();
                    this.stock.remove(index);
                    index--;
                }
            }
            index++;

        }
    }
    public void closeShop() {
        for (ShopItem shopItem: stock) {
            shopItem.incrementDaysInTheShop();
            System.out.println("--- " + shopItem.getName() + " ---:");
            shopItem.reducePrice();
        }
    }
}
