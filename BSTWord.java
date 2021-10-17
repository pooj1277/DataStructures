package com.bridgelabz.DataStructures;
import java.io.*;
import java.util.*;

public class BSTWord
{
	int binarySearch(ArrayList<Integer> arr, int l, int r, int x)
   {
       if (r >= l)
       {
           int mid = l + (r - l) / 2;
           if (arr.get(mid) == x)
               return mid;
           if (arr.get(mid) > x)
               return binarySearch(arr, l, mid - 1, x);
           return binarySearch(arr, mid + 1, r, x);
       }
       return -1;
   }

   // Driver method to test above
   public static void main(String args[])
   {
	   BufferedReader bufReader = new BufferedReader(new FileReader("file.txt"));
	   ArrayList<String> listOfLines = new ArrayList<>();
	   String line = bufReader.readLine();
	   while (line != null)  
	   {
	   listOfLines.add(line);
	   line = bufReader.readLine();
	   }
	   bufReader.close();
	   //sort the arraylist
	   listofLines.sort( Comparator.comparing( String::toString) );
       BSTWord ob = new BSTWord();

       ArrayList<Integer> arr = new ArrayList<Integer>();
       arr.add(5);
       arr.add(10);
       arr.add(15);
       arr.add(20);
       arr.add(25);
       arr.add(30);
       arr.add(35);

       int n = arr.size();

       // We will find x inside the arraylist
       int x = 10;

       // Printing elements of array list
       System.out.println("The elements of the arraylist are: "+arr);

       int result = ob.binarySearch(arr,0,n-1,x);

       if (result == -1)
           System.out.println("Element not present");
       else
           System.out.println("The Element " + x + " is found at "
                              + "index " + result);
   }
}



