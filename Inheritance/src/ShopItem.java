public class ShopItem {
    private String name;
    private float price;
    private float preservativePercentage;
    private int daysInShop;
    private String type;
    public ShopItem(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public ShopItem(String name, int price, int preservativePercentage, String type) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = preservativePercentage;
        this.type = type;
    }
    public int calculateFreshness() {
        if (type.equals("Diary")) {
            if (this.daysInShop > 5) {
                return 0;
            } else if (this.daysInShop > 3 && this.daysInShop <= 5) {
                return 1;
            } return 2;
        } else {
            if (this.daysInShop > 3) {
                return 0;
            } else if (this.daysInShop > 1 && this.daysInShop <= 3) {
                return 1;
            } return 2;
        }
    }
    public void reducePrice() {
        System.out.println("Old price: " + this.getPrice());
        if (this.type.equals("Diary")) {
            if (this.calculateFreshness() == 0) {
                this.price -= this.price * 0.5f;
                System.out.println("Reduces price (-" + 50 + "%): " + this.price);
            } else if (this.calculateFreshness() == 1) {
                this.price -= this.price * 0.3f;
                System.out.println("Reduces price (-" + 30 + "%): " + this.price);
            } else {
                System.out.println("The price is not reduced yet!");
            }
        } else {
            if (this.calculateFreshness() == 0) {
                this.price -= this.price * 0.4f;
                System.out.println("Reduces price (-" + 40 + "%): " + this.price);
            } else if (this.calculateFreshness() == 1) {
                this.price -= this.price * 0.2f;
                System.out.println("Reduces price (-" + 20 + "%): " + this.price);
            } else {
                System.out.println("The price is not reduced yet!");
            }
        }
    }
    public String convertFreshnessToString() {
        if (calculateFreshness() == 0) {
            return "Bad";
        } else if (calculateFreshness() == 1) {
            return "Ok";
        } else if (calculateFreshness() >= 2) {
            return "Good";
        } else {
            return "None of the expected statements worked";
        }
    }
    public void incrementDaysInTheShop() {
        this.daysInShop++;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getPreservativePercentage() {
        return preservativePercentage;
    }

    public int getDaysInShop() {
        return daysInShop;
    }

    public String getType() {
        return type;
    }
}