public class Op {
    public Op() {
    }

    public static void main(String[] args) {
        int a = 110;
        int b = 20;
        int c = 50;

        int r = (a>b) ? (a>c? a : c):(b>c ? b : c);

        System.out.println(r);
    }
}




