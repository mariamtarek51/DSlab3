package dslab3;

import java.util.ArrayList;
import java.util.Random;

public class performance {
    ArrayList<Integer> generate_random_array(int array_length){
        Random rd = new Random(); // creating Random object
        ArrayList<Integer> arr=new ArrayList<>(array_length);
        for (int i = 0; i < array_length; i++) {
            arr.add(i, rd.nextInt());  // storing random integers in an array
        }return arr;
    }
    public static void main(String[] args ) {
        int num;
        maxHeap op=new maxHeap();
        performance sample=new performance();
        Random rd = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        //ArrayList<Integer> arr = new ArrayList<Integer>();
       // for(int i=0; i<6;i++){
            int array_size=200;//rd.nextInt(100)+1;
            System.out.println("Array size: \n"+array_size);
            array=sample.generate_random_array(array_size);
        //heap sort
            System.out.println("Sorted array using heap: ");
            long start= System.currentTimeMillis();
            op.heapsort(array);
            op.printArray(array);
            long end = System.currentTimeMillis();
            System.out.println("lllll"+end);
            System.out.println("Time taken by heap:" + (end-start)/Math.pow(10,6) +" nano sec\n");
        //bubble sort
            System.out.println("Sorted array using bubble sort : ");
            long startTime= System.currentTimeMillis();
            op.bubblesort(array);
            long endTime= System.currentTimeMillis();
            op.printArray(array);
            System.out.println("Time taken by bubble:" + (endTime-startTime)/1000 +" micro Sec\n");
        //merge sort
          /*  System.out.println("Sorted array using Merge sort : ");
            Merge_sort j=new Merge_sort();
            long start_Time= System.currentTimeMillis();
            j.sort(array,array.get(0),array.get(array.size()-1));
            long end_Time= System.currentTimeMillis();
            op.printArray(j.sort(array,0,array.size()-1));
            System.out.println("Time taken by Merge:" + (end_Time-start_Time));*/
        //quick sort
            Quick_sort u=new Quick_sort();
            long start_Time= System.currentTimeMillis();
            u.quickSort(array,0, array.size()-1);
            long end_Time= System.currentTimeMillis();
            op.printArray(array);
            System.out.println("Time taken by Quick:" + (end_Time-start_Time)/1000 +" micro");
            //}


    }
}