/**
 * 
 */
package array;

import java.util.Arrays;

/**
 * @author dredmo
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		showProcess();
		arraySort();
	}
	
	public static void showProcess() {
		System.out.println("Begin");
		
		Process p = new Process();
		int[] result = p.create();
		p.display(result);
	}
	
	public static void arraySort() {
		// Allocate and initialize array. 
	    int array[] = new int[10];  
	    for(int i = 0; i < 10; i++)  
	      array[i] = -3 * i;  
	  
	    // Display, sort, and display the array. 
	    System.out.print("Original contents: ");  
	    display(array);  
	    Arrays.sort(array);  
	    System.out.print("Sorted: ");  
	    display(array);  
	  
	    // Fill and display the array. 
	    Arrays.fill(array, 2, 6, -1);  
	    System.out.print("After fill(): ");  
	    display(array);  
	  
	    // Sort and display the array. 
	    Arrays.sort(array);  
	    System.out.print("After sorting again: ");  
	    display(array);  
	  
	    // Binary search for -9. 
	    System.out.print("The value -9 is at location ");  
	    int index =   
	      Arrays.binarySearch(array, -9);  
	 
	    System.out.println(index);  
	}
	
	static void display(int array[]) {  
	    for(int i: array) 
	      System.out.print(i + " ");  
	 
	    System.out.println();  
	 }  

}

class Process{
	public int[] create(){
		int num[];
		num = new int[10];
		num[3] = 6;
		num[7] = 9;
		
		return num;
	}
	
	public void display(int[] src){
		for(int counter=0; counter<10; counter++){
			System.out.println(src[counter]);
		}
	}
}
