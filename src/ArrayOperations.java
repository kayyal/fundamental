import java.util.PriorityQueue;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of element");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

    }
    public static   int sum (int [] array){
        int sum = 0 ;
        for (int element : array) {
            sum+= element;
        }
        return sum;
    }

    public static int max (int [] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) max = element;
        }
        return max;
    }
    public static int min (int [] array){
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min)min = element;
        }
        return min;

    }


}
