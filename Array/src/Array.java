
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = {10,20, 30, 40,50,};

        System.out.println(a[4]);
    }

}
class Array1{
    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for ( int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

    }
}
class Array2{  //dynamic array
    public static  void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        size = sc.nextInt();
        System.out.println("Enter Array Elements");
        int [] a = new int [size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Print Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] +" ");

        }

    }


}

class Array3{   //ways of print elements
    public static  void main(String[] args) {
       int[] a = new int[3];
       a[0] = 10;
       a[1] = 20;
       a[2] = 30;


        System.out.println("Array Elements: ");
        for (int i = 0; i < 3; i++) {
            System.out.println( a[i]  );

        }
        System.out.println("for each loop");
        for (int b:
             a) {
            System.out.println(b +" ");
        }

    }


}
//toString, asList, deepToString;
class Array4 {
    public static void main(String[] args) {
        String[] a = {"Learn", "Coding", "KeyPoints", "education"};

        System.out.println("toString" + Arrays.toString(a));
        System.out.println("asList" +Arrays.asList(a));

        int [][] arr = {{10,20},{30,40}};
        System.out.println(Arrays.deepToString(arr));

    }
}
class Array5{   //length
    public static void main(String[] args) {
        int[] a = new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] +" ");
        }
        System.out.println("Array Length " +a.length);

    }

}
class Array6{  //reverse order
    public static void main(String[] args) {
        int[]a = new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] +" ");
        }
        System.out.println("Array reverse");
        for (int i = a.length-1; i>=0; i--) {
            System.out.println(a[i] +" ");
        }

    }


}
class Array7{   //copy
    public static void main(String[] args) {
        int[] a = new int [5];
        int[] b = new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("First Array Elements");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] +" ");
        }
        System.out.println("Second Array Elements");
        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
            System.out.println(b[i] +" ");
        }
    }


}
class Array8{     //sum
    public static void main(String[] args) {
        int sum = 0, n;
        int[] a = new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i <a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] +" ");
            sum=a[i]+sum;
        }
        System.out.println("Addition of Array: " +"\n" +sum);

    }

}
class Array9 {     //search
    public static void main(String[] args) {

        int count = 0;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter Search Element");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if(count>0)
            System.out.println("Item found" +"\n" +count+ "\n" +"Item: " +n);
        else
            System.out.println("Item not Found");
    }
}
class Array10{     //average
    public static void main(String[] args) {
        int sum =0; double avg;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
           sum = a[i] + sum;
        }
        avg = sum / 5.0;
        System.out.println("Addition: " +sum + "\nAverage: " +avg);
    }
}
class Array11{     // ascending order

    public static void main(String[] args) {

        int[] a = new int[5]; int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Ascending Array ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }


    }
}
class Array12{     //descending order
    public static void main(String[] args) {
        int temp;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Ascending Array ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
class Array13{        //sort() Equals() copy()
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] a2 = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
class Arrays14{    //copy of
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int a2[] = Arrays.copyOf(a,5);
        System.out.println("data in Array2: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
class Arrays15{   //equals
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] a2 = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Elements in Array2");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("both arrays equals: " +b);
    }
}
class Array16{    //compare1
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Elements in Array2");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        if(a==b){
            System.out.println("bothe are equal");
        }
        else {
            System.out.println("both are not equal");
        }
    }
}
class Array17{    //compare2
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Elements in Array2");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        if(Arrays.equals(a,b)){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }
    }
}
class Arrays18{ //find out bigger element
    public static void main(String[] args) {
        int max;
        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }

        }
        System.out.println("Maximum element: " +max);
    }

}
class Arrays20{   //minimum element
    public static void main(String[] args) {
        int min;
        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }

        }
        System.out.println("Minimum element: " +min);
    }
}

class Arrays21 {     //insert item
    public static void main(String[] args) {
        int size, loc, item;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size in Array");
        size = sc.nextInt();
        int[] a = new int[size+1];
        System.out.println("Enter Elements ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Location ");
        loc = sc.nextInt();
        System.out.println("Enter new item");
        item = sc.nextInt();
        for (int i = size; i > loc ; i--) {
            a[i] = a[i-1];
        }
        a[loc] = item;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] +" ");

        }
    }
}
class Arrays22{     //delete item
    public static void main(String[] args) {

        int size, loc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size in Array");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Elements ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Location ");
        loc = sc.nextInt();
        System.out.println("New Array after Deletion ");
        for (int i = loc; i < size-1 ; i++) {
            a[i] = a[i+1];
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] +" ");

        }
    }
}
class Arrays23 {    //matrix
    public static void main(String[] args) {
        int a [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Elements");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               a[i][j] = sc.nextInt();
            }

        }
        System.out.print("Matrix: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Arrays24{   //addition of 2matrix
    public static void main(String[] args) {
        int a [][] = new int[2][2];
        int b [][] = new int[2][2];
        int c [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix Data");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter Second Matrix Data");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }

        }
        System.out.println("First Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Sum of 2 Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }

}
class Arrays25{   //Transpose matrix

    public static void main(String[] args) {

        int a [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Data: \n");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matrix: ");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.print(a[j][i] +" ");
            }
            System.out.println();
        }
    }

}
class Arrays26{    //mirror matrix
    public static void main(String[] args) {
        int a [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix Data: \n");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matrix: ");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix: ");
        for (int i = 0; i <=1; i++) {
            for (int j = 1; j >=0; j--) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

}
class Arrays27{    //mirror matrix
    public static void main(String[] args) {
        int a [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix Data: \n");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matrix: ");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix: ");  //Left to right
        for (int i = 0; i <=1; i++) {
            for (int j = 1; j >=0; j--) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix: ");  //bottom to up anti clock wise
        for (int i = 1; i >=0; i--) {
            for (int j = 1; j >=0; j--) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Matrix: ");  //bottom up
        for (int i = 1; i >=0; i--) {
            for (int j = 1; j >=0; j--) {
                System.out.print(a[j][i] +" ");
            }
            System.out.println();
        }
        System.out.println("Matrix: ");  //bottom up
        for (int j = 0; j <=1; j++) {
            for (int i = 1; i >=0; i--) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Matrix: ");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

}


