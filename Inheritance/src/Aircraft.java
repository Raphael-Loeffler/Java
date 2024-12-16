public class Aircraft {
    private String type;
    public int maxAmmo;
    public int baseDamage;
    public int ammo;
    public Aircraft(String type) {
        this.type = type;
        if (this.type.equals("F16")) {
            this.maxAmmo = 8;
            this.baseDamage = 30;
        } else if (this.type.equals("F35")){
            this.maxAmmo = 12;
            this.baseDamage = 30;
        }
    }
    public int fight() {
        int out = ammo * baseDamage;
        this.ammo = 0;
        return out;
    }
    public int refill(int number) {
        this.ammo += number;
        int out = Math.abs(this.maxAmmo - this.ammo);
        if (this.ammo > this.maxAmmo) {
            this.ammo = this.maxAmmo;
        }
        return out;
    }
    public String status() {
        return "Type " + this.type + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.ammo * this.baseDamage;
    }
    public boolean isPriority() {
        return this.type.equals("F35");
    }
}
