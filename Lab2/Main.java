package Lab2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Collection;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Daniel Pratt (Im learning a lot in this class thank you)
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and offer your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be offered to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String> progLanguages = new LinkedList<>();

    // 2. offer elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    progLanguages.offer("Java");
    progLanguages.offer("Python");
    progLanguages.offer("JavaScript");
    progLanguages.offer("C++");

    // 3. Remove the element "C++" from the list using .remove()
    progLanguages.remove("C++");

    // 4. offer an element "HTML" at index 2.
    progLanguages.add(2, "HTML");

    // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
    Iterator<String> iterator = progLanguages.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q
    Queue<String> q = new java.util.LinkedList<>();

    // 7. add 5 first names to q.
    q.add("Jacob");
    q.add("Daniel");
    q.add("Matthew");
    q.add("David");
    q.add("Joseph");

    // 8. Uncomment the following line
    System.out.println("Elements of queue: " + q);

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    String removedElementt = q.poll();

    //    Display the value of "Removed element: " + removedElement
    System.out.println("Removed Element: " + removedElementt);

    // 10. View the head of the queue using peek(). Output it's value.
    System.out.println("Head of List: " + q.peek());

    // 11. Using for(String element : q), output all of the values in the queue
    for (String element : q) {
      System.out.println(element);
    }

    
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<>();

    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
    bookStack.push("Clean code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");
    

    // 14. pop() 1 book off the stack. Display it's value
    System.out.println("book popped from stack: " + bookStack.pop());

    // 15. Use the peek() method to view the top book on the stack
    System.out.println("Top of book stack: " + bookStack.peek());

    // 16. push() "Web DB Technologies" onto the stack
    bookStack.push("Web Db Technologies");

    // 17. Use the peek() method to view the top book on the stack
    System.out.println("Peek to view top of bookStack: " + bookStack.peek());

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.
    System.out.println(bookStack.search("Design Patterns"));

    // 19. Call empty(). Output the results
    System.out.println("is Stack empty: " + bookStack.empty());

    // 20. Print the titles of all of the books on the stack
    for (String element : bookStack) {
      System.out.print(element + ", ");
    }
    
  }

  
}