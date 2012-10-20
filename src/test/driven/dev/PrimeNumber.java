package test.driven.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class PrimeNumber {
    public static List<Integer> primeNumbers(int naturalNumber) {
        if (naturalNumber < 2) return Collections.EMPTY_LIST;
        if (isPrimeNumber(naturalNumber)) return asList(naturalNumber);

        List<Integer> primeNumbers = new ArrayList<Integer>();

        int minPrime = minPrimeNumber(naturalNumber);
        primeNumbers.add(minPrime);
        primeNumbers.addAll(primeNumbers(naturalNumber / minPrime));

        return primeNumbers;
    }

    private static int minPrimeNumber(int naturalNumber) {
        for (int i = 2; i < naturalNumber; i++) {
            if (!isPrimeNumber(i)) continue;

            if (naturalNumber % i != 0) continue;
            return i;
        }
        return naturalNumber;
    }

    private static boolean isPrimeNumber(int naturalNumber) {
        for (int i = 2; i < naturalNumber; i++) {
            if (naturalNumber % i == 0) return false;
        }
        return true;
    }
}
