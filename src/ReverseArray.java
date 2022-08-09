public class ReverseArray {

    public int[] reverse(int[] inputArray) {
        int length = inputArray.length;
        int[] outputArray = new int[length];
        for(int i=length-1;i>=0;i--) {
            outputArray[length-i-1] = inputArray[i];
        }
        
        return outputArray;
    }
}
