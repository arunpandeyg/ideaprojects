package challenge;



public class Challenge34 {   //find element same from different array
    int[] x ={10,20,30,44,55,66}; //first array
    int[] y ={10,20,45,77,66};     // second array
    //method
    public  void RepeatedElements(){
        for (int a : x){
            for (int b : y){
                //checking elements equal or not if it is equal then print.
                if (a==b){
                    System.out.println(a+"-"+b);
                }
            }
        }
    }

}
//main class
class Test{
    public static void main(String[] args) {
        Challenge34 ch = new Challenge34();
        ch.RepeatedElements();
    }
}

//..................................................

class toy{
    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4,5,6};
        int[] arr2 ={1,2,3,5,9,7};
        for (int i : arr1){
            for (int j : arr2){
                if (i==j){
                    System.out.println(i+ "-" +j);
                }
            }
        }
    }
}
