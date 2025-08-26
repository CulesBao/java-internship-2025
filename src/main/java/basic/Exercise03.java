package src.main.java.basic;

import java.util.List;

public class Exercise03 {
    public static String primeFactorization(int n) {
        final List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return String.join(" * ", factors.stream().map(String::valueOf).toArray(String[]::new));
    }
}
