package challenge;

public class Challenge30 {     //removing duplicate elements of the array.
    public static void main(String[] args) {
        int[] arr = {3,7,2,2,8,7,9,3,5,6};  // print all ele in array
        for (int i : arr){
            System.out.print(i+", ");
        }
        // now cursor move to nexr line
        System.out.println();
        int n = arr.length -1;
        //iterate an array
        for (int i=0; i<=n; i++){
            int count = 0;
            //inner loop to check duplecate
            for (int j = 0; j<=n;j++){
                if (arr[i]==arr[j]){
                    count++;
                    // to over write duplecate
                    if (count >=2){
                        int k = j;
                        //over write elements
                        while (k<n){
                            int m = k+1;
                            arr[k] = arr[m];
                            k++;
                        }
                        //reduce the size
                        n--;
                    }
                }
            }
        }
        //print the array with reduced size.
        for (int i =0; i<=n; i++) {
            System.out.print(arr[i]+", ");
        }
    }

}
