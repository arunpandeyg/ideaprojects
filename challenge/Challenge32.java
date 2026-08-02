package challenge;

public class Challenge32 {   //find out the leader element
    public static void main(String[] args) {
        int[]arr= {1,2,2,9,4,3,5,8,1};
        for (int i = 0; i < arr.length; i++){
            int count =0;
            for (int j=i+1; j < arr.length; j++){
                if (arr[j]>arr[i]){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println("The leader element is: "+arr[i]);
            }
        }
    }
}
class Qwe{
    public static void main(String[] args) {
        int[]arr= {12,2,9,4,3,5,8,1};
        for (int i = 0; i < arr.length; i++){
            int count =0;
            for (int j=i+1; j < arr.length; j++){
                if (arr[i]<arr[j]){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(arr[i]+", ");
            }
        }
    }
}

class Asdf{
    public static void main(String[] args) {      //accurate code for leader element(Leader element: 12, Leader element: 9, Leader element: 8)
        int[]arr= {12,2,9,4,3,5,8,1};
        int k = arr.length;
        for (int i = 0; i < arr.length; i++){
            for (int j=i+1; j < arr.length; j++){
                if (arr[i]<=arr[j]){
                    break;
                }
                if (j==k-1){
                    System.out.println("Leader element: "+arr[i]);
                }
            }
        }
    }
}
