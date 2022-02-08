import java.util.Arrays;
import java.util.Scanner;

public class stack_basics
{
public static void main(String[] args)
{
    stacks obj =new stacks();
    Scanner sc=new Scanner(System.in);
    int ch; int x;
    do{
        System.out.println("-----Stack basic operations-----");
        System.out.println("\t1. push\n\t2. pop\n\t 3. peek\n\t4. checkEmpty\n\t5. print all");
        int op=sc.nextInt();
        switch(op)
        {
            case 1:
            System.out.println("Enter value to be pushed");
            x=sc.nextInt();
            obj.push(x);
            break;

            case 2:
            obj.pop();
            break;

            case 3:
            obj.peek();
            break;

            case 4:
            obj.checkEmpty();
            break;

            case 5:
            obj.print();
            break;

            default:
            System.out.println("Invalid choice");
            break;

        }
        System.out.println("Enter 1 to continue and 0 to exit");
        ch=sc.nextInt();
    }
    while(ch==1);
    if(ch==0)
    {
        System.out.println("------End of prgram------");
    }
}
}

class stacks {
    final int MAX=1000;
    int s[]=new int[MAX];
    int top;
    stacks()
    {
        top=-1;
    } //stack is initially declared as empty
    void checkEmpty()
    {
        if(top<0)
        {
            System.out.println("Stack empty");
        }
        else{
            System.out.println("The stack isnt empty");
        }
    }
    void push(int n)
    {
        if(top>MAX)
        {
            System.out.println("Stack overflow");
        }
        else{
            s[++top]=n;
        } // LIFO principle
    }
    void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow/ Empty stack");
        }
        else{
            int n=s[top--];
            System.out.println(n);
        } // LIFO principle
    }
    void peek()
    {
        if(top<=-1)
        {
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(s[top]);
        }
    }
        void print()
        {
            for(int i=top;i>-1;i--)
            {
                System.out.println(s[i]);
            } 
        }
    
}
