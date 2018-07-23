
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
  public void Append(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      Node temp;
      for(temp = head; temp.next != null; temp = temp.next);
        temp.next = newNode;
      }
    }
    public void Addfront(int data) {
      Node newNode = new Node(data);
      if(head == null) {
        head = newNode;
        return;
      } else {
        Node temp;
        temp = head;
        head = newNode;
        newNode.next = temp;
      }
    }
    public void Addlast(int data) {
      Node newNode = new Node(data);
      Node temp;
      if(head == null){
        head = newNode;
        return;
      } else {
        for(temp = head; temp.next != null; temp = temp.next);
        temp.next = newNode;

      }
    }
    public void Addposition(int pos,int data) {
      Node newNode = new Node(data);
      Node temp = head;
      if(head == null){
        head = newNode;
        return;
      } else {
        for(int i = 1; temp != null && i<pos-1; i++) {
          temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
      }
    }
    public void print() {
      Node temp;
      for(temp = head; temp != null; temp = temp.next) {
        System.out.println(temp.data);
      }
    }
  }

    public class AddNode {
      public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.Append(10);
        l.Append(12);
        l.Append(6);
        l.Append(29);
        l.Append(5);
        l.Append(2);
        Scanner scan = new Scanner(System.in);
        System.out.println("The LikedList is : ");
        l.print();
        System.out.println("Enter the data :");
        int data = scan.nextInt();
        System.out.println("Enter the case :");
        System.out.println("1 : Insert at front \n 2 : Insert at last \n 3 : Insert at position");
        int n = scan.nextInt();
        switch(n)
        {
          case 1 : l.Addfront(data);
                   break;
          case 2 : l.Addlast(data);
                   break;
          case 3 : System.out.println("Enter the position to insert\n");
                   int pos = scan.nextInt();
                   l.Addposition(pos,data);
                   break;
          default : System.out.println("Invalid");

        }
        System.out.println("New LinkedList is :\n");
        l.print();
      }
  }
