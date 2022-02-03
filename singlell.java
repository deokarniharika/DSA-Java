import java.util.*;

public class singlell {
    public static void main(String[] args)
    {
        int option, op;
        Scanner sc=new Scanner(System.in);
        Node ab=new Node();
        LinkedList obj=new LinkedList();
        do{
            System.out.println("-----Heap operations-----");
            System.out.println("\t1. Append");
            System.out.println("\t2. Prepend");
            System.out.println("\t3. Access first");
            System.out.println("\t4. Delete");
            System.out.println("\t5. Check empty");
            System.out.println("Enter your option");
            option=sc.nextInt();
            switch(option)
            {
                case 1: 
                System.out.println("Enter the element to be appended");
                int elem=sc.nextInt();
                obj.append(elem);
                break;
    
                case 2: 
                System.out.println("Enter the element to be prepended");
                int ele=sc.nextInt();
                obj.prepend(ele);
                break;
    
                case 3: 
                obj.accessFirst();
                break;
    
                case 4: 
                System.out.println("Enter the element to be deleted");
                int dele=sc.nextInt();
                obj.delete(dele);
                break;

                case 5: 
                obj.checkEmpty();
                break;
    
                default:
                System.out.println("Invalid choice");
                break;
            }
    
            System.out.println("Enter 1 to continue and 0 to end the program");
            op=sc.nextInt();
            }
            while(op==1);
            if(op==0)
            {
                System.out.println("----End of program----");
            }
    }
}

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
    }
    public Node() {
    }

}
class LinkedList{
    Node head;
    void append(int data)
    {
        if(head==null){
            head.data=data;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next= new Node(data);
        System.out.println("The element was appended");
    }


    void prepend(int data)
    {
        Node newHead=new Node(data);
        newHead.next=head;
        head=head.next;
    }

    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("The linked list is empty");
        }
        Node current=head;
        while(current.next!=null)
        {
            if(current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    void checkEmpty()
    {
        if(head==null)
        {
            System.out.println("The single linked list is empty");
        }
    }
    void accessFirst()
    {
        Node current=head;
        System.out.println("The first element is: " + head.data);
    }
}
