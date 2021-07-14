import java.util.Arrays;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyArray {

    private int myArray[];
    int result;

    private static final Logger LOGGER = LogManager.getLogger(MyArray.class);

    public MyArray(int[] array) {
        myArray = new int[array.length];
        myArray = Arrays.copyOf(array, array.length);

        if (checkLengthOfArray()) return;

        Arrays.sort(myArray);
        countProductOfThreeNumbers();
    }

    private void countProductOfThreeNumbers() {
        if (myArray[0]*myArray[1] > myArray[myArray.length-1]*myArray[myArray.length-2]){
            result = myArray[0]*myArray[1]*myArray[myArray.length-1];
        } else {result = myArray[myArray.length-3]*myArray[myArray.length-2]*myArray[myArray.length-1];}
    }

    private boolean checkLengthOfArray() {
        if (myArray.length < 3) {
            LOGGER.debug("The array consists of less than 3 elements, the product of 3 numbers cannot be counted.");
            return true;
        }
        return false;
    }

    public int getResult() {
        return result;
    }
}
