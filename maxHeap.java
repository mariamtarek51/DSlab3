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
	void bubblesort(ArrayList<Integer> array){
		int n = array.size();
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (array.get(j) > array.get(j+1))
				{
					// swap arr[j+1] and arr[j]
					int temp = array.get(j);
					array.set(j,array.get(j+1));
					array.set(j+1,temp) ;
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
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
//reading array elements from the user
			op.Heap_Max_Insert(array,sc.nextInt());
		}

		System.out.println("the priority queue: ");
		op.printArray(array);
		do {
			System.out.println("Enter 1 to extract max\n" +
					"2 to sort the elements by heapsort \n" +
					"3 to sort elements by bubblesort :\n" +
					"4 to sort elements by Mergesort :\n");
			int y = sc.nextInt();
			if (y == 1) {
				//if you want extract max
				for (int j=0;j<n;j++){arr.add(j,array.get(j));}
				System.out.println("the max heap: " + op.Extract_Max(arr));
			} else if (y == 2) {
				//if you want to sort
				for (int j=0;j<n;j++){arr.add(j,array.get(j));}
				System.out.println("Sorted array: ");
				op.heapsort(arr);
				op.printArray(arr);
			}
			else if(y==3){
				for (int j=0;j<n;j++){arr.add(j,array.get(j));}
				System.out.println("Sorted array using bubble sort : ");
				op.bubblesort(arr);
				op.printArray(arr);


			}
			else if(y==4){
				for (int j=0;j<n;j++){arr.add(j,array.get(j));}
				System.out.println("Sorted array using merge sort : ");
				Merge_sort j=new Merge_sort();
				j.sort(arr,arr.get(0),arr.get(arr.size()-1));
				op.printArray(j.sort(arr,0,arr.size()-1));}
		}while(true);

	}
}
