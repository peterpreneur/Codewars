package findOdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOdd {

	public static int findIt(int[] arrInt) {
		//public static void main(String[] args) {
		//int[] arrInt = { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 };
		
        // Create an empty List
		List<Integer> arrIntList = new ArrayList<>();
  
        // Iterate through the array
        for (int i : arrInt) {
            // Add each element into the list
        	arrIntList.add(i);
        }
  
        for(int i = 0; i < arrInt.length; i++) {
            int count = Collections.frequency(arrIntList, arrInt[i]);	
            if (count %2 == 1 ) {
            	//System.out.println(count + " is " + arrInt[i]);
            	return arrInt[i];
            } 
        }
		return 0;
	}
}
