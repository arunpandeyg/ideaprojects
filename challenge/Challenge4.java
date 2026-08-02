package challenge;


import java.util.Random;

public class Challenge4 { //random number


    public static void main(String[] args) {
       /* Random rn = new Random();

          int min = 100;
          int max = 200;

          for (int i = 1; i<= 20; i++){
              int num = rn.nextInt(max-min)+min;
              System.out.println(num);
          }


    }*/
        Random r = new Random();
        /*for (int i =1; i<= 10; i++) {
            System.out.println(r.nextInt(100)+100);
        }*/
       /* for (int i=0; i<20;i++){
            int a = r.nextInt(200);
            if (a < 100)
                System.out.println(a+100);
            else
                System.out.println(a);

        }*/
        /*int count =0;
        while (true){
            int x = r.nextInt(200)+100;
            if (x<200){
                System.out.println(x);
                count++;
            }
            if (count >20){
                break;
            }
        }*/
        int count =0;
        while (count<20){
            int x = r.nextInt(200);
            if (x>99){
                count++;
                System.out.println(x);
            }
        }
    }
}

