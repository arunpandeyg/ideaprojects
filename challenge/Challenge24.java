package challenge;

public class Challenge24 { // search and add required element
    public static void main(String[] args) {
        int[] arr = {9,2,6,1,7,3,8,4,5};
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j< arr.length;j++){
                int c=arr[i]+arr[j];
                if (c==10){
                    System.out.println("The values are: "+arr[i]+", "+arr[j]);
                }
            }
        }
    }
}
