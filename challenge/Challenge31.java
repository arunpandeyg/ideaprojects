package challenge;

public class Challenge31 {    //removing the duplicate elements
    public static void main(String[] args) {
        int temp;
        int []arr = {3,7,2,2,8,7,9,3,5,6};
        int k = arr.length;

        for (int i = 0; i < k; i++) {
            for (int j = i+1; j<k;j++){
                if (arr[i]==arr[j]){  //checking current elements same as next element.
                    temp = arr[j];  //swapping
                    arr[j] = arr[k-1];
                    arr[k-1]=temp;
                    k--;  //decreasing array size.
                }
           }
        }
        System.out.println("New array size: "+k);
        for (int i = 0; i < k; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
