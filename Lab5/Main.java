/*
 * IT-2660-DSA - Lab 5
 * Student Name: Daniel Pratt Daniel Pratt
 */
package Lab5;

 import java.util.ArrayList;

 import javax.swing.tree.TreeNode;

 
 class Main {
   public static void main(String[] args) {
 
     // Step 1 - Create a BST tree object called lab5Tree
     BST<Integer> lab5Tree = new BST<>();
 
     // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40,
     // 29, 34, 10
     lab5Tree.add(13);
     lab5Tree.add(22);
     lab5Tree.add(36);
     lab5Tree.add(5);
     lab5Tree.add(48);
     lab5Tree.add(17);
     lab5Tree.add(39);
     lab5Tree.add(2);
     lab5Tree.add(26);
     lab5Tree.add(40);
     lab5Tree.add(29);
     lab5Tree.add(34);
     lab5Tree.add(10);
 
     // Step 3 - Delete the value 17
     lab5Tree.delete(17);
 
     // Step 4 - Traverse and output the values using inorder (sorted)
     System.out.println("in order: ");
     lab5Tree.inorder();
 
     // Step 5 - Traverse and output the values using postorder
     System.out.println("\npost order: ");
     lab5Tree.postorder();
 
     // Step 6 - Traverse and output the values using preorder
     System.out.println("\npre order: ");
     lab5Tree.preorder();
 
     // Step 7 - Display the result of a search for the value 36
     System.out.println("\nis 36 in tree: ");
     System.out.println(lab5Tree.search(36));
 
     // Step 8 - Display the result of a search for the value 37
     System.out.println("is 37 in tree: ");
     System.out.println(lab5Tree.search(37));
 
     // Step 9 - Using the path() method, display the path from the root to 2
     System.out.println("path to 2 is: ");
     ArrayList<BST.TreeNode<Integer>> k = lab5Tree.path(2);
     for (BST.TreeNode<Integer> node : k) {
       System.out.println(node.element); // This will print the data of each node in the path
     }
 
     // Step 10 - Display the path from the root to 34
     System.out.println("path to 34 is: ");
     ArrayList<BST.TreeNode<Integer>> s = lab5Tree.path(34);
     for (BST.TreeNode<Integer> node : s) {
       System.out.println(node.element);
     } 
  }
}