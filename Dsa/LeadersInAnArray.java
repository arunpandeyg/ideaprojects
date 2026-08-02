package Dsa;
//leaders in an array , find out?


public class LeadersInAnArray {
    public void printLeaders(int[] arr){
        if (arr == null) return;
        int maxNumber = arr[arr.length - 1];
        System.out.println("Leader numbers are..");
        System.out.print(maxNumber + " ");
        for (int i = arr.length - 2; i >= 0; i--){
            if (maxNumber <= arr[i]){
                maxNumber = arr[i];
                System.out.print(maxNumber + " ");
            }
        }
    }

    public static void main(String[] args) {
        LeadersInAnArray lead = new LeadersInAnArray();
        lead.printLeaders(new int[] {16, 17, 4, 3, 5, 2});
        System.out.println();
        lead.printLeaders(new int[] {1, 95, 4, 46, 8, 12, 21});
    }
}
