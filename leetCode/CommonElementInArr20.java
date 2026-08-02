package leetCode;
//write a program to find common integers between two sorted arrays. both arrays are sorted in ASC order.
// Both arrays don't have any duplicate number. Make you navigated through both arrays only once.
// input
// Array input1 = {2,7,17,19,20,45,56,159,239}; Array input2 = {7,12,15,19,22,34,55,150,159};


public class CommonElementInArr20 {
    public static void main(String[] args) {
        int[] input1 = {2,7,17,19,20,45,56,159,239};
        int[] input2 = {7,12,15,19,22,34,55,150,159};
        int index1 = 0;
        int index2 = 0;
        while (true){
            if (index1 >= input1.length || index2 >= input2.length){
                break;
            }
            if (input1[index1] == input2[index2]){
                System.out.print(input1[index1]);
                System.out.print("  ");
                index1 += 1;
            }
            else if (input1[index1] < input2[index2]){
                index1 += 1;
            }
            else {
                index2 += 1;
            }
        }

    }
}
