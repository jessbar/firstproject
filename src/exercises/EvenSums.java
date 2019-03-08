package exercises;

public class EvenSums {
    public static int sumEvenNumbers(int[] numbers){
        int sumOfEvens = 0;

        for(int number : numbers){
            if (number % 2 == 0){
                sumOfEvens += number;
            }
        }

        return sumOfEvens;

    }

    public static void main(String args[]){
        int[] numbers = new int[]{2,4,6,8};
        System.out.println(sumEvenNumbers(numbers));
    }
}