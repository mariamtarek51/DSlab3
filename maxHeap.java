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
	
	
	
	
	
	
	public static void main(String[] args) {
	
	
		int num;
		
		Scanner sc=new Scanner(System.in);  
		
		num=sc.nextInt(); 
		 
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(6);
		array.add(9);
		array.add(1);
		int n=array.size();
	
		
		

		
	
	
	
	
	
	
	
	

}
}