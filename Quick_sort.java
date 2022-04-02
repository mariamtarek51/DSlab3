package dslab3;

import java.util.ArrayList;
import java.util.Collections;

public class Quick_sort {

     int partition(ArrayList<Integer> arr, int low, int high)
    {
        int pivot = arr.get(high);

        // Index of smaller element
        // assumed  the right position
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

    void quickSort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high)
        {

            // pivot is partitioning index, arr[p]
            // is now at right place
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

}
