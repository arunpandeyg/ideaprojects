import java.util.Scanner;

public class Bill {




    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            System.out.println("Please Enter Plot number/ Slot Number: ");
            int plotSlotNumber = sc.nextInt();
            System.out.println("Please Enter Phone Number: ");
            long phoneNumber = sc.nextLong();
            System.out.println("Please Enter Vehicle  Number: ");
            int vehicleNumber = sc.nextInt();
            System.out.println("Please Enter Vehicle Type: ");
            String vehicleType = sc.next();
            System.out.println("Please Enter Costumer Name");
            String name = sc.next();
            System.out.println("Please Enter Amount");
            int amount = sc.nextInt();


            System.out.println("phone number " + phoneNumber);
            System.out.println("vehicle number " + vehicleNumber);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Plot/Slot Number: " + plotSlotNumber);
            System.out.println("costumers name: " + name);
            System.out.println("Parking Amount: " + amount);
            System.out.println("Amount UPI at 9810010011 ");

        }


    }



