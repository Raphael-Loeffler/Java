package Char;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{
    String string;
    public Gnirts(String string) {
        this.string = string;
    }

    public int length() {
        return this.string.length();
    }
    public char charAt(int index) {
        return this.string.charAt(this.string.length() - 1 - index);
    }

    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(end, start);
    }

    public IntStream chars() {
        return CharSequence.super.chars();
    }

    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
