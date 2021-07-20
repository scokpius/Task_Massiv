import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MyArrayTest {
    private MyArray myArray;
    private int result;

    public MyArrayTest(MyArray myArray, int result) {
        this.myArray = myArray;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers(){
        return Arrays.asList(new Object[][] {
                {new MyArray(new int[]{5, -2}), 0},
                {new MyArray(new int[]{-8, 5, 3}), -120},
                {new MyArray(new int[]{ -6, 0, 5, -9, 3, -1}), 270},
                {new MyArray(new int[]{10,  -3, -1, -5, 7, 0, 6}), 420},
                {new MyArray(new int[]{-100,  -10, 1, 2, 3, 4}), 4000},
                {new MyArray(new int[]{-100,  0, 1, 2, 3, 4}), 24},
                {new MyArray(new int[]{-1, -2, -3, 4}), 24},
                {new MyArray(new int[]{-1, -2, -3, -4}), -6},
                {new MyArray(new int[]{1, 8, 2, 5, 6}), 240}

        });    }
    @Test
    public void checkingForRepetitions() {
        Assert.assertEquals(result, myArray.getResult());
    }
}


