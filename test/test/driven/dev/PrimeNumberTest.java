package test.driven.dev;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    @Test
    public void should_return_2_when_given_2() {
        assertThat(PrimeNumber.primeNumbers(2), is(asList(2)));
    }

    @Test
    public void should_return_3_when_given_3() {
        assertThat(PrimeNumber.primeNumbers(3), is(asList(3)));
    }

    @Test
    public void should_return_2_2_when_given_4() {
        assertThat(PrimeNumber.primeNumbers(4), is(asList(2, 2)));
    }

    @Test
    public void should_return_2_3_when_given_6() {
        assertThat(PrimeNumber.primeNumbers(6), is(asList(2, 3)));
    }

    @Test
    public void should_return_2_2_3_when_given_12() {
        assertThat(PrimeNumber.primeNumbers(12), is(asList(2, 2, 3)));
    }

    @Test
    public void should_return_3_3_11_when_given_99() {
        assertThat(PrimeNumber.primeNumbers(99), is(asList(3, 3, 11)));
    }

    @Test
    public void should_return_empty_list_when_given_less_than_2() {
        assertThat(PrimeNumber.primeNumbers(1), is(Collections.EMPTY_LIST));
        assertThat(PrimeNumber.primeNumbers(0), is(Collections.EMPTY_LIST));
        assertThat(PrimeNumber.primeNumbers(-1), is(Collections.EMPTY_LIST));
        assertThat(PrimeNumber.primeNumbers(-100), is(Collections.EMPTY_LIST));
    }

}
