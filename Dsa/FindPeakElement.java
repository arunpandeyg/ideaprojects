package Dsa;
//find peak element in an array


public class FindPeakElement {
    public static Integer findPeakElement(int[] inputArr){
        if (inputArr == null || inputArr.length == 0){
            return null;
        }
        int length = inputArr.length;
        int start = 0;
        int end = length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if ((mid == 0 || inputArr[mid - 1] <= inputArr[mid])
                && (mid == length -1 || inputArr[mid] >= inputArr[mid + 1])){
                System.out.println("Peak element is: " + inputArr[mid]);
                return mid;
            }
            else if (mid > 0 && inputArr[mid - 1] > inputArr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
    int[] inputArr1 = {1,2,3,1};
        System.out.println("Peak element Index; " + FindPeakElement.findPeakElement(inputArr1));

        int[] inputArr2 = {1,2,1,3,5,6,4};
        System.out.println("Peak element Index; " + FindPeakElement.findPeakElement(inputArr2));
    }
}
