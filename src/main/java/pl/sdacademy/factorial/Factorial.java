package pl.sdacademy.factorial;

public class Factorial {
    public static void main(String[] args) {
        int[] data = new int[] {0,1,2,5,10};
        for (int datum : data) {
            System.out.printf("%d! = %d\n", datum, factorial(datum));
        }


    }

    public static long factorial(int datum) {
        int a =1;
        for (int i = 1; i < datum; i++){
            a = a*(i+1);
        }
        return a;

    }
}
