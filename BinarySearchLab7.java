
package binarysearchlab7;

public class BinarySearchLab7
{
    public static void binarySearch(int arr[], int first, int last, int key)//search method that includes our variables
    {
        int mid = (first + last)/2;//function to determine the middle index of the array
       
        while( first <= last )//while loop makes sure it goes through the entire array and stops once we reach the target index of the array
        {
          if ( arr[mid] < key )//compares mid and key, if true narrows down the location of key to upper bound of original array
          {
            first = mid + 1; //starts the array at the one after previous midpoint
          }
          else if ( arr[mid] == key )//if key is equal to middle of array 
          {
            System.out.println("Element is found at index: " + mid);//print out located key
            break;
          }
          else
          {
             last = mid - 1;//if the target int is less than mid than we eliminate the upper bound of array and start at one less than the previous mid
          }
          mid = (first + last)/2;//finds new middle of array
        }
        if ( first > last )//if target integer cant be located in whole array
        {
          System.out.println("Element is not found!");//print out error message
        }
    }
    public static void main(String args[])//method to declare the variables
    {
	int arr[] = {10,20,30,40,50};//defines the sorted array we want to look in
	int key = 30;//the target integer we want to locate
        int last=arr.length-1;//a variable to check the last int in the array to compare with the first int
	binarySearch(arr,0,last,key);//sends these variables to be used in the binary search method
    }
    
}
