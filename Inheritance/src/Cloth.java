public class Cloth {
    private String color;
    private int condition;
    private String type;
    private int daysWorn;
    private int initialCondition;

    public Cloth(String color, int condition, String type) {
        this.color = color;
        this.condition = condition;
        this.initialCondition = condition;
        this.type = type;
    }
    public Cloth(String color, String type){
        if (type.equals("overwear")) {
            this.condition = 50;
        } else {
            this.condition = 100;
        }
        this.color = color;
        this.initialCondition = this.condition;
        this.type = type;
    }
    public void wear() {
        if (this.type.equals("overwear")) {
            if (this.daysWorn >= 5) {
                System.out.println("Needs to be washed");
            } else {
                this.daysWorn++;
            }
        } else {
            if (this.daysWorn >= 1) {
                System.out.println("Needs to be washed");
            } else {
                this.daysWorn++;
            }
        }
    }

    public void repair() {
        if (this.type.equals("overwear")) {
            this.condition = this.initialCondition;
        } else {
            System.out.println("Underwear cannot be repaired");
        }
    }

    public void wash() {
        this.daysWorn = 0;
        this.condition--;
        if (this.condition < 0) {
            this.condition = 0;
        }
    }

    public boolean needsToBeWashed() {
        if (this.type.equals("overwear")) {
            if (this.daysWorn >= 5) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.daysWorn >= 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean needsToBeRepaired() {
        if (this.type.equals("overwear")) {
            if (this.condition < 6) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getInfo() {
        return this.color + " " + this.type + " worn for " + this.daysWorn + " days, has " + this.condition + " wash cycles left.";
    }

    public int getCondition() {
        return condition;
    }
}
