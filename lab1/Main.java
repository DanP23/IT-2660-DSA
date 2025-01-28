package lab1;
import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Daniel Pratt 
 */

public class Main {
  public static void main(String[] args) {
    /* System.out.println("hello, world!");

    Lab1 labs = new Lab1();
    System.out.println(labs.increment(1));
    */

    // "in the main method section of lab 1"
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;
    System.out.println("array in order is: ");
    while(i < nums.length) {
      System.out.println(nums[i]);
      i++;
    }
    System.out.println("array from last index to first is: ");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.println(nums[j]);
    }
    System.out.println("First index is: " + nums[0]);
    System.out.println("Last index is: " + nums[nums.length - 1]);

    /* creating new Lab1 object and calling created methods for lab1 class */

    Lab1 newLab = new Lab1();
    System.out.println("Max value is: " +newLab.max(10, 15));
    System.out.println("Min value is: " + newLab.min(20, 25));
    System.out.println("average value in array is: " + newLab.average(nums));
    System.out.println("Sum of all values in array is: " + newLab.sum(nums));
    System.out.println("Max value in array is: " + newLab.maxArray(nums));
    System.out.println("Min value in array is: " + newLab.minArray(nums));

  }
}


// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  // method that returns the greatest of 2 integer values
  public int max(int a, int b) {
    if ( a >  b) {
      return a;
    } else if (b > a){
      return b;
    } else {
      return 0;
    }
  }

  // method that returns the minimum of 2 integer values
  public int min (int a, int b) {
    if ( a <  b) {
      return a;
    } else if (b < a){
      return b;
    } else {
      return 0;
    }
  }

  // method that returns the sum of all values in an array
  public int sum(int[] nums) {
    int counter = 0;
    for(int i = 0; i < nums.length; i++) {
      counter += nums[i];
    }
    return counter;
  }

  // method to retrieve the average value in an array
  public double average(int[] nums) {
    int counter = 0;
    // Iterate through the array using foreach loop
    for (int num : nums) {
        counter += num;  // Sum up all elements
    }
    return (double) counter / nums.length;  // Calculate and return the average
  }

  // method to go through array and retrieve greatest value
  public int maxArray(int[] nums) {
    int currentMax = 0;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] > currentMax) {
        currentMax = nums[i];
      }
    }
    return currentMax;
  }

  // method to go through array and retrieve lowest value
  public int minArray(int[] nums) {
    int currentMin = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] < currentMin) {

        currentMin = nums[i];
      }
    }
    return currentMin;
  }
}