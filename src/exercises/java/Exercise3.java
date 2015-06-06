package exercises.java;

/**
 * Created by hubert on 2015.06.06.
 */
public class Exercise3 {
    public static void main(String [] args) {
        int numbers[] = {1,2,3,4,5};
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        System.out.println("Sum is " + sum);
    }
}
