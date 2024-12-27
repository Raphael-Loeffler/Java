public class Station {
    public int gasAmount;
    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }
    public void refill(Car car) {
        this.gasAmount -= car.capacity;
        car.gasAmount = car.capacity;
    }
}
