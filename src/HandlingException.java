public class HandlingException {
    public static void main(String[] args) {
        divide(2,0);
    }

    private static void divide(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
