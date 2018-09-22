public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {

        int limit = 0;

        for(int i = 0; i < a.length; i++) {
            int min = limit;

            // Finds min
            for(int x = limit; x < a.length; x++) {
                if(a[x] < a[min]) {
                    min = x;
                }
            }

            // Swap
            int temp = a[limit];
            a[limit] = a[min];
            a[min] = temp;


            limit++;

        }
    }



}
