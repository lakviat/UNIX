package Complete_Ones;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,59};
        for (int i = 0; i < numbers.length /2  ; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - (1+i)];
            numbers[numbers.length-(1+i)] = temp;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
