package challenge;

public class Challenge28 {           //find out array is same or not
    public static void main(String[] args) {
        int count = 0;
        int[]a ={10,20,30,40,50};
        int[]b ={10,20,30,40,50};

        for (int i = 0; i< a.length; i++){
            for (int j = 0; j< b.length; j++){
                if (a[i]==b[j]){
                    count++;
                }
            }
        }
        if (count==a.length){
            System.out.println("Array is same");
        }
        else {
            System.out.println("Array is not same");
        }
    }
}
