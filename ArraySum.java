package ArraySum;

/**
 * Recursive class for generating sum of values in array using the provided driver ArraySumDriver
 * @author James Gibbs
 *
 */
public class ArraySum {

	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public int sumOfArray(Integer[] arr, int num) {
		int sum;
		   if (num == 0)
		      sum = arr[num];  //base case
		   else
		      sum = sumOfArray(arr, num - 1) + arr[num]; // Recursive call
		    
		   return sum;

	 
	}
}
