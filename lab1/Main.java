package lab1;
import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Daniel Pratt 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 labs = new Lab1();
    System.out.println(labs.increment(1));
  }
}


// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int add(int b, int a) {
    return a + b;
  }
}