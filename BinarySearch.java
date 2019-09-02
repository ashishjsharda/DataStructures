
package addleaf;

/**
 * Binary Search
 * @author asharda
 *
 */
public class BinarySearch {

	/**
	 * Binary Search 
	 * @param arr
	 * @param low
	 * @param high
	 * @param num
	 * @return boolean
	 */
	public boolean binSearch(int arr[],int low,int high,int num)
	{

		if(high>=low)
		{
			int mid=(low+high)/2;
			if(num==arr[mid])
			{

				return true;

			}
			else if(num<arr[mid])
			{
				return binSearch(arr,low,mid-1,num);
			}
			else if(num>arr[mid])
			{

				return binSearch(arr,mid+1,high,num);

			}

		}
		return false;
	}
	public static void main(String[] args) {

		BinarySearch binSearch=new BinarySearch();
		int arr[]= {2,4,6,8,10,12};
		System.out.println(binSearch.binSearch(arr, 0, arr.length-1, 2));

	}

}
