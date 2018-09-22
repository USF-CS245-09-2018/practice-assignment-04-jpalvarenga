import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {

        boolean sorted = false;

        while(!sorted){

            sorted = true;

            // Go over array
            for(int i = 0; i < a.length - 1; i++) {
                int prev = a[i];
                int current = a[i+1];

                // Swap
                if(a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;

                    sorted = false;
                }

            }


        }

    }



}
