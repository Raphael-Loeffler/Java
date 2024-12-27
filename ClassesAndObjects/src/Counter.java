public class Counter {
    public int counter;
    public int iniCounter;
    public Counter() {
        this.counter = 0;
        this.iniCounter = 0;
    }
    public Counter(int counter) {
        this.counter = counter;
        this.iniCounter = counter;
    }
    public void add(int number) {
        this.counter += number;
    }
    public void add() {
        this.counter++;
    }
    public int get() {
        return this.counter;
    }
    public void reset() {
        this.counter = this.iniCounter;
    }
}
