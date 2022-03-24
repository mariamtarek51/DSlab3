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
		int l=2*i+1;
		int r=2*i+2;
		int max=i;
		if(l<size && array.get(l)>array.get(max)) {
		max=l;}
		if(r<size && array.get(r)>array.get(max)) {
		max=r;
             }
		if(max != i){
	   Collections.swap(array, i, max);
		
		heapify(array,size,max);
		}

	}
	void heapsort(ArrayList<Integer> array){
        int n=array.size();
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(array, n, i);

		for (int i=n-1; i>=0;i--){
			int temp=array.get(0);
			array.set(0,array.get(i));
			array.set(i,temp);
			heapify(array,i,0);
		}
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
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(6);
		array.add(9);
		array.add(1);
		printArray(array);
		maxHeap op=new maxHeap();
		op.heapsort(array);
        printArray(array);
	/*
		int n=array.size();*/
	
		
		

		
	
	
	
	
	
	
	
	

}
}