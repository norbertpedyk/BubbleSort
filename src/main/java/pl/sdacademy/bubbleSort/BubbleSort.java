package pl.sdacademy.bubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
       // int[] values = new int[] {4,2,3,1,8,0};
        Random random = new Random();
        int[] values = new int[10000];
        for (int i = 0; i < values.length; i++){
            values[i] = random.nextInt();
        }
        int[] valuesBubble = Arrays.copyOf(values, values.length);
        int[] valuesQuick = Arrays.copyOf(values, values.length);
        //System.out.println(Arrays.toString(values));
        //System.out.println("------------------");
        long before = System.nanoTime();
        sort(valuesBubble);
        long after = System.nanoTime();
        System.out.println(after - before);

        before = System.nanoTime();
        Arrays.sort(valuesQuick);
        after = System.nanoTime();
        System.out.println(after - before);


    }

    public static void sort(int[] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (j < values.length -1 && values[j] > values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
              //  System.out.println(Arrays.toString(values));
            }
           // System.out.println("------------------");
        }

    }

}
