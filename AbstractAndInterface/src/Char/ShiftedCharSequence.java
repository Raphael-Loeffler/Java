package Char;

import java.util.stream.IntStream;

public class ShiftedCharSequence implements CharSequence{
    String string;
    int shift;
    public ShiftedCharSequence(String string, int shift) {
        this.string = string;
        this.shift = shift;
    }

    public int length() {
        return this.string.length();
    }
    public char charAt(int index) {
        return this.string.charAt(index + this.shift);
    }

    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(start + this.shift, end + this.shift);
    }

    public IntStream chars() {
        return CharSequence.super.chars();
    }

    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}