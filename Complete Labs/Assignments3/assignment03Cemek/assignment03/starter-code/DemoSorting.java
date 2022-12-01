/**
 * @author Fahmida Hamid
 * @author Sami Cemek
 * @version November 16 2022
 * This file implements several known sorting algorithms:
 * 		 bubbleSort
 * 	     insertionSort
 *       selectionSort 
 *       mergeSort
 */


class SortingAlgorithms{
	
	
	/**
	 * Insertion Sort
	 * @param <T>
	 * @param a: an array of T type objects
	 * O(n^2)
	 */

	public static <T extends Comparable <? super T>> void insertionSort(T[] a)
	{
		T temp;
		int n = a.length;
		for(int i=1; i < n; i++){
			//T key = a[i];
			int j = i;
			//DemoSorting.printData(a);
			while(j > 0  && a[j-1].compareTo(a[j]) > 0){
				temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
				j = j - 1;
			}
			//DemoSorting.printData(a); //TO TEST
		}
	}

	/**
	 * Bubble Sort
	 * @param <T>
	 * @param a: an array of T type objects
	 * O(n^2)
	 */
	public static <T extends Comparable <? super T>> void bubbleSort(T[] a)
	{
		int n = a.length;
		T temp;

		for(int i = 0; i < n; i++){
			//DemoSorting.printData(a);   //TO TEST
			for(int j = 0; j < n - i - 1; j++){
				if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
			}
		}
	}


	/**
	 * Selection Sort
	 * @param <T>
	 * @param a : an array of T type objects 
	 */
	public static <T extends Comparable <? super T>> void selectionSort(T[] a)
	{
		
		for (int i = 0; i < a.length-1; i++)
		{
			
			int minIndex = i;
			for(int j = i+1; j < a.length; j++)
			{
			  if(a[j].compareTo(a[minIndex]) < 0)
			  {
				  minIndex = j;
			  }
			}
			if(minIndex != i)
			  {
				  T temp = a[i];
				  a[i] = a[minIndex];
				  a[minIndex] = temp; 
			  }
				
		  }
	}
	
	/**
	 * mergeSort
	 * @param <T>
	 * @param a : an array of T type objects
	 * I took Weiss's implementation of mergeSort
	 */
	public static <T extends Comparable <? super T>> void mergeSort(T[] a)
	{
		
		/* 
		 * Creating a temporary array that will be 
		 * used to store the the sorted sub-lists.
		 */
		T[] temp = (T[]) new Comparable[a.length]; 
		
		mergeSort(a, temp, 0, a.length-1);
		
     }

	/**
	 * mergeSort
	 * @param <T>
	 * @param a: given input
	 * @param temp: used to copy/store the left and right sublist
	 * @param p: left-most index
	 * @param r: right-most index
	 */
	public static <T extends Comparable <? super T>> void mergeSort(T[] a, T[] temp, int p , int r)
	{
		
		if(p < r)
		{
			int q = (p+r)/2;
			mergeSort( a, temp, p, q);
			mergeSort( a, temp, q+1, r);
			merge(a, temp, p, q+1, r);
		}
		
		
     }
	/**
	 * merge: merges the two sorted sublists into one
	 * @param <T>
	 * @param a
	 * @param tempArr
	 * @param leftPos
	 * @param rightPos
	 * @param rightEnd
	 */
	public static <T extends Comparable <? super T>> void merge(T[] a, T[] tempArr, int leftPos , int rightPos, int rightEnd)
	{

		int leftEnd = rightPos-1;
		int tempPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		
		
		while( leftPos <= leftEnd && rightPos <= rightEnd)
		{
			if(a[leftPos].compareTo(a[rightPos]) <= 0)
			
				tempArr[tempPos++] = a[leftPos++]; 
			else
				tempArr[tempPos++] = a[rightPos++];
				
		}
		
		/* copy the left over from the left subarray */
		while(leftPos <= leftEnd)
			tempArr[tempPos++] = a[leftPos++]; 
			
		/* copy the left over from the right subarray */
		while(rightPos <= rightEnd)
			tempArr[tempPos++] = a[rightPos++]; 
		
		/* copy the sorted data back to the original array */
		for(int i = 0; i < numElements; i++, rightEnd--)
			a[rightEnd] = tempArr[rightEnd];
		
     }

}

class RunningTimeRecorder{

	/**
	 * Test the
	 * @param n: n-random numbers for the array
	 */
	public static void empiricalRunningTime(int n){

		Integer[] arr = RandomIntegerGenerator.generateRandomNumbers(n);
		
		//this is your unsorted array
		System.out.println("This is your unsorted array:");
		//DemoSorting.printData(arr); //unncomment this to print the unsorted arrays
		System.out.println("");
			
		//making a copy (deep copy) for different sorting algorithms
		Integer[] copiedArray1 = new Integer[n];
		System.arraycopy(arr, 0, copiedArray1, 0, n);
		Integer[] copiedArray2 = new Integer[n];
		System.arraycopy(arr, 0, copiedArray2, 0, n);
		Integer[] copiedArray3 = new Integer[n];
		System.arraycopy(arr, 0, copiedArray3, 0, n);
		Integer[] copiedArray4 = new Integer[n];
		System.arraycopy(arr, 0, copiedArray4, 0, n);

		//each of the sorting algorithms will have a different start and end time
		long startTime1 = System.nanoTime();
		SortingAlgorithms.mergeSort(copiedArray1);
		long stopTime1 = System.nanoTime();
	
		long startTime2 = System.nanoTime();
		SortingAlgorithms.insertionSort(copiedArray2);
		long stopTime2 = System.nanoTime();

		long startTime3 = System.nanoTime();
		SortingAlgorithms.selectionSort(copiedArray3);
		long stopTime3 = System.nanoTime();

		long startTime4 = System.nanoTime();
		SortingAlgorithms.bubbleSort(copiedArray4);
		long stopTime4 = System.nanoTime();

		// now, copiedArray has the elements in sorted order
		// in milliseconds (ms)
		double runningTime1 =  (double)(stopTime1 - startTime1)/Math.pow(10, 9) * 1000;

		double runningTime2 =  (double)(stopTime2 - startTime2)/Math.pow(10, 9) * 1000;

		double runningTime3 =  (double)(stopTime3 - startTime3)/Math.pow(10, 9) * 1000;

		double runningTime4 =  (double)(stopTime4 - startTime4)/Math.pow(10, 9) * 1000;
	
		//DemoSorting.printData(copiedArray1);
		System.out.println("Running time for mergeSort " + runningTime1);

		//DemoSorting.printData(copiedArray2);
		System.out.println("Running time for insertionSort " + runningTime2);
		
		//DemoSorting.printData(copiedArray3);
		System.out.println("Running time for selectionSort " + runningTime3);

		//DemoSorting.printData(copiedArray3);
		System.out.println("Running time for bubbleSort " + runningTime4);

	}

}


public class DemoSorting {

	
	public static <T extends Comparable <? super T>> void printData(T[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] +  " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		 
		/* 
		// Prof. Hamid's example
		Integer[] arr = RandomIntegerGenerator.generateRandomNumbers(20);
			
		//this is your unsorted array
		printData(arr);
			
		//making a copy (deep copy)
		Integer[] copiedArray1 = new Integer[20];
		System.arraycopy(arr, 0, copiedArray1, 0, 20);

			
		long startTime = System.nanoTime();
			
		SortingAlgorithms.mergeSort(copiedArray1);
		//now, copiedArray1 has the elements in sorted order
		long stopTime = System.nanoTime();
		double runningTime =  (double)(stopTime - startTime)/1000000000;
	
		printData(copiedArray1);
		System.out.println("Running time: " + runningTime);
		*/


		// Now, from the main method/caller, call the empiricalRunningTime for the following values of n:
		RunningTimeRecorder.empiricalRunningTime(5);
		RunningTimeRecorder.empiricalRunningTime(10);
		RunningTimeRecorder.empiricalRunningTime(50);
		RunningTimeRecorder.empiricalRunningTime(100);
		RunningTimeRecorder.empiricalRunningTime(200);
		RunningTimeRecorder.empiricalRunningTime(500);
		RunningTimeRecorder.empiricalRunningTime(1000);
		RunningTimeRecorder.empiricalRunningTime(2000);
		RunningTimeRecorder.empiricalRunningTime(5000);
		RunningTimeRecorder.empiricalRunningTime(10000);
	}

}
