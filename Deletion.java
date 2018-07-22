import java.util.*;

class Node {
  public int data;
  public Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;
  public LinkedList() {
    this.head = null;
  }
  public void append(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      Node temp;
      for(temp = this.head; temp.next != null; temp = temp.next);
      temp.next = newNode;
    }
  }
  public void print() {
    Node temp;
    for(temp = this.head; temp !=null; temp = temp.next) {
      System.out.println(temp.data);
    }
  }

  public void Delete(int pos) {

    Node temp = head;
    if(head == null)
    return;

  if(pos == 1) {
    head = temp.next;
    return;
  }
  for(int i = 1; temp !=null && i < pos-1; i++ ) {
    temp = temp.next;
  }
  Node next = temp.next.next;
  temp.next = next;
 }
}

public class Deletion {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.append(3);
    l.append(5);
    l.append(8);
    l.append(7);
    l.append(0);
    l.append(4);
    l.append(10);
    Scanner scan = new Scanner(System.in);
    System.out.println("The LinkedList is: ");
    l.print();
    System.out.println("Enter the position to delete\n");
    int pos = scan.nextInt();
    l.Delete(pos);
    System.out.println("New LinkedList is :\n");
    l.print();
  }
}
