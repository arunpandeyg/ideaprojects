public class pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*" +" ");
                } else {
                    System.out.print(" " +" ");
                }
            }
            System.out.println();
        }

    }
}

class A1 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}

class A2{
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
    }

    class A3{
        public static void main(String[] args) {
            int n = 4;

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*" +" ");
                }
                System.out.println();
            }
        }
    }

class A4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " +" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}

class A5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " " +" ");
            }
            System.out.println();
        }
    }
}

class A6{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

class A7 {
    public static void main(String[] args) {
        int n = 5;                        //floyd Triangle
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number +" ");
                number ++;
            }
            System.out.println();
            }

        }
    }

class A8 {
    public static void main(String[] args) {
        int n = 5;                        // 0 1 Triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(" 1 ");
                }
                else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}

class A9{  //horizontal pyramid
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

class A10 {  //Ship
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s <= noOfSpaces - totalColsInRow; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class A11 {     //butterfly
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class A12 {     //butterfly with equal
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
