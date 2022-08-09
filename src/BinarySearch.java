import java.util.Scanner;

public class BinarySearch {
    private Scanner scanner = new Scanner(System.in);
    public int search(int[] sortedArray) {
        int result = Integer.MIN_VALUE;
        int high = sortedArray.length-1;
        int low = 0;
        System.out.println("Enter a number to find it's index:");
        int input = scanner.nextInt();

        while(low<=high) {
            int mid = low + ((high- low) /2);
            if (sortedArray[mid] < input) {
                low = mid + 1;
            } else if (sortedArray[mid] > input) {
                high = mid -1;
            } else if (sortedArray[mid] == input) {
                result = mid;
                break;
            }
        }
        return result;

    }
}
