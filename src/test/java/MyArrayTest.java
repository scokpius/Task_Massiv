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
                {new MyArray(new int[]{10,  -3, -1, -5, 7, 0, 6}),420},
        });    }
    @Test
    public void checkingForRepetitions() {
        Assert.assertEquals(result, myArray.getResult());
    }
}


