package dslab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class maxHeap { 
	void buildheap(ArrayList<Integer> array,int size) { 

		for (int i = size/ 2 - 1; i >= 0; i--)
			heapify(array, size,i);
	}
	
	void heapify(ArrayList<Integer> array,int size,int i) {
		int l=2*i+1; //left child
		int r=2*i+2; //right child
		int max=i;
		//checking heap property
		if(l<size && array.get(l)>array.get(max)) {
		max=l;}
		if(r<size && array.get(r)>array.get(max)) {
		max=r;
             }
		//if not the same ,they are swapped and continue checking
		//until the max is in the root
		if(max != i){
	   Collections.swap(array, i, max);
		
		heapify(array,size,max);
		}

	}
	void heapsort(ArrayList<Integer> array){
        int n=array.size();
		buildheap(array,n);

		for (int i=n-1; i>=0;i--){
			int temp=array.get(0);
			array.set(0,array.get(i));
			array.set(i,temp);
			heapify(array,i,0);
		}
	}
///-------------------TO IMPLEMENT PRIORITY QUEUE---------------
	int Extract_Max(ArrayList<Integer> array){
		//in the binary heap ,the max is the root
		int maximum=array.get(0);
		int n=array.size();
		//putting the last leaf in the place of root
		array.set(0, array.get(n-1));
		n=n-1;
        heapify(array,n,0);
        return maximum;
	}

	 int size=0;
	void Heap_Max_Insert(ArrayList<Integer> MAX_HEAP, int i){

		     MAX_HEAP.add(i);
			 //shifting up to
			//maintain the greatest element in the root
		    int current =size;
			int parent=(current-1)/2;

			while(size>0 && MAX_HEAP.get(parent)<MAX_HEAP.get(current)){
				Collections.swap(MAX_HEAP,parent,current);
				current=parent;
			}
		size=size+1;
	}
	static void printArray(ArrayList<Integer> arr)
	{
		int n = arr.size();
		for (int i = 0; i < n; ++i)
			System.out.print(arr.get(i) + " ");
		System.out.println();
	}

	public static void main(String[] args) {
	
	
		int num;
		maxHeap op=new maxHeap();
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		op.Heap_Max_Insert(array,45);
		op.Heap_Max_Insert(array,20);
		op.Heap_Max_Insert(array,14);
		op.Heap_Max_Insert(array,12);
		op.Heap_Max_Insert(array,31);
		op.Heap_Max_Insert(array,7);
		op.Heap_Max_Insert(array,11);
		op.Heap_Max_Insert(array,13);
		op.Heap_Max_Insert(array,7);
		System.out.println("the priority queue: ");
		printArray(array);
		//if you want extract max
		int maximum= op.Extract_Max(array);
		//if you want to sort
		op.heapsort(array);
		System.out.println("the max heap: "+ maximum);

		System.out.println("Sorted array: ");

        printArray(array);




	/*
		int n=array.size();*/
	
		
		

		
	
	
	
	
	
	
	
	

}
}