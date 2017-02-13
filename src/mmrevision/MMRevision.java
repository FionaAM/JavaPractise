/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmrevision;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Fiona
 */
public class MMRevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = {10,20,30,40,50};
        int total = 0;
        for (int x : numbers)
        {
          System.out.print(x);
          System.out.print(", ");
        }
        System.out.print("\n");
        printArray(numbers);
        total = sumElements(numbers);
        System.out.println("The total of the array is : " + total);
        biggestNumber(numbers);
     //  int [] reversedArray = reverse(numbers);
     //   System.out.println(Arrays.toString(reversedArray));
    }
    public static void printArray(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + " ");
        }
    }
    public static int sumElements(int [] array)
    {
       int total = 0;
       for(int i = 0; i < array.length; i++)
       {
           total += array[i];
       }
       return total;
    }
    public static void biggestNumber(int [] array)
    {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] > maxNumber)
                maxNumber = array[i];
        }
        System.out.println("The biggest number in the array is : " + maxNumber);
    }
    public static int[] reverse(int [] array)
    {
        int[] reversedArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < reversedArray.length; j--)
            {
            reversedArray[j] = array[i];
            }
        }
        return reversedArray;
    }
    
}
