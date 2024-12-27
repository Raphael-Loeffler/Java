package Domino;

public class Domino implements Printable, Comparable {
    private int sideA;
    private int sideB;
    public Domino(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.sideA + ", B side: " + this.sideB);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
