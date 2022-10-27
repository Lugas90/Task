public class Main {
    public static void main(String[] args) {

        int x = 0;
        int y = 30;

        try {
            int num = y/x;
        } catch (ArithmeticException | IndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println(e);
        }
    }
}