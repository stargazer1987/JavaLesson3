public class BubbleSort {

    public void sort(int[] inputArray) {
        int length = inputArray.length;
        for(int j=0;j<length-1;j++) {
            for (int i = 0; i < length-j-1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
        }
    }
}
