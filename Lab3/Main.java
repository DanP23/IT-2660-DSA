/*
 * IT-2660 - Lab 3
 * Student Name: Daniel Pratt 
 */
package Lab3;

public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "ABC";

    //  Initialize startTime here
    long bestCaseStartTime = System.nanoTime();
    int index = match(text, bestCase);
    //  Initialize endTime here
    long bestCaseEndTime = System.nanoTime();
    //  Calculate elapsedTime here
    long bestCaseElapsed = bestCaseEndTime - bestCaseStartTime;
    // output best case run time
    System.out.println(" best case elapsed time: " + bestCaseElapsed * Math.pow(10, -9) + " seconds or " + bestCaseElapsed + " nanoseconds");
    
    

    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   

    String worstCase = "789";
    
    // Initialize startTime here
    long worstCaseStartTime = System.nanoTime();
    index = match(text, worstCase);
    //  Initialize endTime here
    long worstCaseEndTime = System.nanoTime();
    //  Calculate elapsedTime here
    long worstCaseelapsedTime = worstCaseEndTime - worstCaseStartTime;
    // output worst case run time
    System.out.println(" worst case elapsed time: " + worstCaseelapsedTime * Math.pow(10, -9) + " seconds or " + worstCaseelapsedTime + " nanoseconds");
    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}
