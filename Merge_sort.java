package dslab3;

import java.util.ArrayList;

public class Merge_sort {
    void merge(ArrayList<Integer> array, int start, int middle, int end)
    {
        // Find sizes of two subarrays to be merged
        int n1 = middle - start + 1;
        int n2 = end - middle;

        // Create two arrays
        ArrayList<Integer> array1=new ArrayList<>(n1);
        ArrayList<Integer> array2=new ArrayList<>(n2);

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++)
            array1.add(i,array.get(start+i));
        for (int j = 0; j < n2; j++)
            array2.add(j,array.get(middle+1+j));
        /* Merge the temp arrays */
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = start;
        while (i < n1 && j < n2) {
            if (array1.get(i) <= array2.get(j)) {
                array.set(k,array1.get(i));
                i++;
            }
            else {
                array.set(k,array2.get(j));
                j++;
            }
            k++;
        }

       //copy the rest of the elements in the subarrays
        while (i < n1) {
            array.set(k,array1.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            array.set(k,array2.get(j));
            j++;
            k++;
        }
    }
    ArrayList<Integer> sort(ArrayList<Integer> arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int middle =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, middle);
            sort(arr, middle + 1, r);

            // Merge them
            merge(arr, l, middle, r);

        } return arr;
    }
}
