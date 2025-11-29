import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class L01_RomaToInteger {

    public int romanToInt(String s) {
        int[] array_a = new int[]{1, 5, 10, 50, 100, 300, 1000};
        char[] str_a = s.toCharArray();
        int sum = 0;
        ArrayList<Integer> num_array = new ArrayList();

        // I X C  MCMXCIV
        for (int j = 0; j < str_a.length; j++) {
            switch (str_a[j]) {
                case 'I' ->
                    num_array.add(array_a[0]);
                case 'V' ->
                    num_array.add(array_a[1]);
                case 'X' ->
                    num_array.add(array_a[2]);
                case 'L' ->
                    num_array.add(array_a[3]);
                case 'C' ->
                    num_array.add(array_a[4]);
                case 'D' ->
                    num_array.add(array_a[5]);
                case 'M' ->
                    num_array.add(array_a[6]);
                default -> {
                }
            }
        }
        int length = num_array.size();
        int endValue = 0;
        System.out.println(Arrays.toString(num_array.toArray()));
        for (int i = length - 1; i >= 0; i--) {
            int curentValue = num_array.get(i);
            if (curentValue >= endValue) {
                sum = sum + curentValue;
            } else {
                sum = sum - curentValue;
            }

            endValue = curentValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        L01_RomaToInteger romatointeger = new L01_RomaToInteger();
        String str = "DCXXI";
        int result = romatointeger.romanToInt(str);
        System.out.println(result);

    }
}
