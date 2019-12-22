package cop3530assignment4;
import java.util.Arrays;

/**************************************************************
 Purpose/Description: The purpose of this program is to move all the negative 
 one values found within an array to the end and do so at worst in linear time 
 and by keeping the relative order of the items in the array. I accomplished 
 this by using another array and 2 variables that would store the location of 
 the beginning and of the new array. Then, the original array being passed as a
 parameter was iterated with a for loop and if the value of the current index 
 was -1, then it was placed at the end of the new array and the variable holding
 the location for the end of the array was then decremented. If the value was
 not -1, then the value was stored at the front of the new array and the 
 variable holding the location of the start of the new array was incremented. 
 By doing so, the array is filled from both ends, and the relative order of the 
 array is maintained if the value being tested is not -1.
 Author’s Panther ID: 2597461
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
**************************************************************/

/*******************************************************************************
 
PROBLEM 1

*******************************************************************************/ 

public class COP3530Assignment4 
{
    /**
     * Method that takes in an array and and moves all negative one values to 
     * the end of the array and keeps the rest of the array in relative order.
     * @param originalArray
     * @return array newArray that holds the relative order of the array being 
     *         passed and the -1 values at the end.
     */
    
    public static int[] moveAllNegativeOne(int[] originalArray)
    {
        //Variable for the index of the for loop.
        int i = 0;
        //Variable that will hold location for start of the array.
        int start = 0;
        //Variable that will hold the location for the end of the array.
        int arrayEnd = originalArray.length-1;
        //New array with size of the array being passed as a parameter.
        int[] newArray = new int[originalArray.length];
        
        //For loop iterates through the entire length of the array parameter.
        for(i = 0; i < originalArray.length; i++)
        {
            //If statement to check if current index is equal to -1.
            if(originalArray[i] == -1)
            {
                //If it is equal to -1, then the value is stored at end of the 
                //new array, and the location of array end is decreased.
                newArray[arrayEnd] = -1;
                arrayEnd--;
            }
            //Otherwise, the value is not -1, and the new array stores the 
            //current value of the array parameter and the start of the array is 
            //increased.
            else
            {
                newArray[start] = originalArray[i];
                start++;
            }
        }
        return newArray;
    }
    
    public static void main(String[] args) 
    {
        int[] array = new int[]{-1, 10, -4, 3, -1, -2, 29, 38, -1, 4, -1};
        System.out.println("Input: " + Arrays.toString(array));
        array = moveAllNegativeOne(array);
        System.out.println("Output: " + Arrays.toString(array));
    }
    
}
