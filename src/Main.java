import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       /* ClassWork classWork = new ClassWork();
        //classWork.read();
        //classWork.write();
        //System.out.println(Arrays.stream(classWork.generateArray()).sum());
        classWork.generateMatrix();*/
        // Get an Array
        InputArray inputArray = new InputArray();
        int[] myArray = inputArray.getArray();
        // Reverse the Array
        ReverseArray reverseArray = new ReverseArray();
        System.out.println("Reverse numbers:");
        Arrays.stream(reverseArray.reverse(myArray)).forEach(num -> System.out.print(num + " "));
        System.out.println();
        // BubbleSort for the Array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(myArray);
        System.out.println("Sorted numbers:");
        Arrays.stream(myArray).forEach(num-> System.out.print(num + " "));
        System.out.println();
        // BinarySearch in the Array
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("The index is: " + binarySearch.search(myArray));
        System.out.println();
        // Make the Spiral-Matrix
        System.out.println("This is your spirally-filled matrix: ");
        Spiral spiral = new Spiral(4,5);
        spiral.printSpiral(spiral.createSpiral());
        System.out.println();

    }
}

class InputArray {
    private Scanner scanner = new Scanner(System.in);

    public int[] getArray() {
        System.out.println("Enter the length of an array:");
        int arrayLength = scanner.nextInt();
        int[] myArray = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers");
        for(int i =0; i< arrayLength; i ++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
}