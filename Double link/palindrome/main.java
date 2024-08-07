import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList
{
    Node head;
    Node tail;
    void create_List(int data)
    {
        Node Newnode = new Node(data);
        if(head == null)
        {
            head = Newnode;
            tail=Newnode;
        }
        else 
        {
          tail.next=Newnode;
          Newnode.prev=tail;
          tail=Newnode;
        }
    }
    void palindrome()
    {
      Node left=head;
      Node rig=tail;
      int count = 0;
      while(left!=null && rig!=null)
      {
        if(left.data == rig.data)
        {
          left=left.next;
          rig=rig.prev;
        }
        else
        {
         count +=1;
         break;
        }
       }
      if(count==1) System.out.print("Not a palindrome");
      else System.out.print("palindrome");
      
    }   
}
public class main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList List = new DoublyLinkedList();
        int num=0;
        while(num!=-1)
        {
            num = input.nextInt();
            if(num == -1)
            {
                break;
            }
            List.create_List(num);
        }
        List.palindrome();
    }
}