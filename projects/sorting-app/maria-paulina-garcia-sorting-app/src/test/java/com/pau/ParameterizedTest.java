package com.pau;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    /**
     * The constructor takes two arguments, "array" which is the input for testing the function and "expected",
     * which is the expected result of applying the function into the given array.
     */
    private final int[] array;
    private final int[] expected;

    public ParameterizedTest(int[] array, int[] expected){
        this.array = array;
        this.expected = expected;
    }

    /**
     * The list of parameters for the test include a case with 10 elements, a case with one element and two other
     * cases with a number of elements between 1 and 10.
     */
    @Parameterized.Parameters
    public static Collection <Object []> data(){
        return Arrays.asList( new int[][][]{
                {{1, 3, 2, 4, 7}, {1, 2, 3, 4, 7}},
                {{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {{1}, {1}},
                {{4, 5, 3, 2, 8, 9}, {2, 3, 4, 5, 8, 9}}
        });
    }

    /**
     * This test checks if the App is sorting the elements correctly and is giving the expected result in the cases
     * mentioned above.
     */
    @Test
    public void testSort(){
        App test = new App(array);
        test.sortArgs();
        assertThat(test.args, is(expected));
    }
}
