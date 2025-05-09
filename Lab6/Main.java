/*
 * IT-2660-DSA - Lab 6
 * Student Name: Daniel Pratt
 */
package Lab6;


class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6

    MyHashMap<String, Integer> creditHours = new MyHashMap<>();
    
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);


    // check to see if table contains 'IT-1025' and ' IT-2110'
    System.out.println("is IT-1025 in table: " + creditHours.containsKey("IT-1025"));
    System.out.println("is IT-2110 in table: " + creditHours.containsKey("IT-2110"));
    System.out.println(creditHours.entrySet());

    // remove listed entries
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // print table to console post deletion of specified entries
    System.out.println(creditHours.entrySet());

  }
}