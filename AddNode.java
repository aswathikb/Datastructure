
import java.util.*;

class Node {
  public int data;
  public Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
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
      } else {
        Node temp;
        temp = head;
        head = newNode;
        newNode.next = temp;
      }
    }
    public void Addpostion(int data,int pos) {
      Node newNode = new Node(data);
      NOde temp;
      if(head == null){
        head = newNode;
      } else {
        for(int i = 1; temp !=null && i<pos-1; i++) {
          temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = temp.next.next;
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
        l.Add(1);
        l.Add(2);
        l.Add(3);
        l.Add(4);
        l.print();
        System.out.println("Enter the position to insert  node\n");
        int pos = scan.nextInt();
        l.Addposition(pos);
      }
    }
