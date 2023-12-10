package bootiful.loom;

public class Factorial {
    public int factorial(int i) {
        if (i <= 0) throw new IllegalArgumentException();
        if (i == 1) return 1;
        return i*factorial(i-1);
    }
}
