public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.fillStock(new ShopItem("milk", 150, "Diary"));
        shop.fillStock(new ShopItem("cheese", 250, "Diary"));
        shop.fillStock(new ShopItem("yogurt", 50, "Diary"));
        shop.fillStock(new ShopItem("creme", 450, "Diary"));
        shop.fillStock(new ShopItem("carrot", 150, "Vegetable"));
        shop.fillStock(new ShopItem("broccoli", 20, "Vegetable"));
        shop.fillStock(new ShopItem("cucumber", 100, "Vegetable"));
        shop.fillStock(new ShopItem("salad", 120, "Vegetable"));
        shop.fillStock(new ShopItem("potato", 110, "Vegetable"));
        shop.showStock();
        shop.closeShop();
        shop.closeShop();
        shop.showStock();
        shop.sellItems(100000, false);
        shop.showStock();
    }
}
