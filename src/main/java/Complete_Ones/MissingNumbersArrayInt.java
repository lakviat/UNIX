package Complete_Ones;

public class MissingNumbersArrayInt {

    public static void main(String[] args) {

        ////This method prints out only missing numbers to the console !

        int[] numbers = {1, 2, 3, 5, 6, 7, 9,} ;
        int missing = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {

            do{
                if(numbers[i] !=missing){
                    System.out.println(" " + missing);
                    missing ++;
                }

            }while (numbers[i] != missing);
            missing++;

        }

    }
}
