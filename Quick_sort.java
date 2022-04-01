package dslab3;

import java.util.ArrayList;
import java.util.Collections;

public class Quick_sort {
    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
     int partition(ArrayList<Integer> arr, int low, int high)
    {

        // pivot
        int pivot = arr.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            // If current element is smaller than the pivot
            if (arr.get(j) < pivot)
            {
                // Increment index of smaller
                i++;
                Collections.swap(arr,i,j);
            }
        }
        Collections.swap(arr,i+1,high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    void quickSort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}
