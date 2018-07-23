
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

    public void AddNode(int pos,int data) {
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
  }

    public class Addposition {
      public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.Append(1);
        l.Append(2);
        l.Append(3);
        l.Append(4);
        Scanner scan = new Scanner(System.in);
        System.out.println("The LikedList is : ");
        l.print();
        System.out.println("Enter the position to insert\n");
        int pos = scan.nextInt();
        int data = scan.nextInt();
        l.AddNode(pos,data);
        System.out.println("New LinkedList is :\n");
        l.print();
      }
    }
