package codes;
import java.util.Random;

public class rand50nums {
    public static void main(String[] args) {
        //Creating array, setting the sum and the average
        int[] nums = new int[50];
        int sum=0;
        double average;
        //looping the random numbers
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            nums[i] = random.nextInt(100)+1;
            sum += nums[i];
        }//printing the numbers
        for (int i = 0; i < 50; i++){
            System.out.print(nums[i]+" | ");
        }//printing the sum and the average
        average = sum / 50d;
        System.out.println("\n"+"Adding all numbers is: "+ sum);
        System.out.println("The average is: "+ average);
    }
}
