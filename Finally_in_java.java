public class Finally_in_java {
    public static int allisgood() {
        for (int i = 0; i <= 10; i++) {


            if (i == 9) {
                try {
                    int o = 12;
                    int t = 3;
                    int y = o /i;
                    return y;
                } catch (ArithmeticException r) {
                    System.out.println(r);
                } finally {
                    System.out.println("This is the finally check");
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int e=allisgood();
        System.out.println(e);
    }
}