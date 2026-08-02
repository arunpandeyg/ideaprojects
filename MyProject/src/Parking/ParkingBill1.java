    package Parking;


   

    import java.util.Scanner;
    public class ParkingBill1 {
            static String name;
            static int vehicleNumber;
            static int amount;
            static long phoneNumber;
            static Scanner sc = new Scanner(System.in);

            private static ParkingList pvl = new ParkingList();
            
            public static void main(String[] args) {
            ParkingBill1 b = new ParkingBill1();
            ParkingBill pb = new ParkingBill();
            b.input();
            b.printBill();
            ParkingBill1.addVehicle();
            ParkingBill1.removeParkingVehicle();
            //pb.addParkingVehicle();
            //pb.printVehicleList();

            }
        
        public static void addVehicle(){
            System.out.println("Please Enter your Parking Vehicle");
           
           pvl.addParkingItem(sc.nextLine());
           
        }
        public static void removeParkingVehicle(){
            System.out.println("Enter Vehicle Number: ");
            int vehicleNo = sc.nextInt();
            sc.nextLine();
            pvl.removeParkingItem(vehicleNo - 1);
        }

            private void input() {
                System.out.println("Enter Name of the Costumer: ");
                String name = sc.nextLine();
                System.out.println("Enter Phone Number: ");
                phoneNumber = sc.nextLong();
                System.out.println("Enter Vehicle Number: ");
                vehicleNumber = sc.nextInt();
                System.out.println("Enter Parking Charges: ");
                amount = sc.nextInt();
            }
            private void printBill()   {
                System.out.println("Name of the Costumer: " +name);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Vehicle Number: " + vehicleNumber);
                System.out.println("Parking Charges: " + amount);
                System.out.println("UPI Parking Charges at 9810012345 ");

            }



    }







