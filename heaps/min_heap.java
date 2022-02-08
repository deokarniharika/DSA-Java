import java.util.Arrays;
import java.util.Scanner;
public class min_Heap {

    public static void main(String[] args)
    {
        func obj= new func();
        int option, op;
        int max=20;
        int[] items= new int[max];
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("-----Heap operations-----");
        System.out.println("\t1. Insert");
        System.out.println("\t2. Delete first");
        System.out.println("\t3. Access first");
        System.out.println("\t4. Check Empty");
        System.out.println("Enter your option");
        option=sc.nextInt();
        switch(option)
        {
            case 1: 
            System.out.println("Enter the element to be inserted");
            int elem=sc.nextInt();
            obj.insert(elem);
            break;

            case 2: 
            obj.delete();
            break;

            case 3: 
            obj.peek();
            break;

            case 4: 
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
class func{
int max=20;
int[] items=new int[max];
int size=0;

void checkEmpty()
{
    if(size==0)
    {
        System.out.println("The heap is empty");
    }
}

    int getLeft(int parent)
    {
        return 2*parent + 1;
    }
    int getRight(int parent)
    {
        return 2*parent + 2;
    }
    int getParent(int child)
    {
        return (child-1)/2;
    }

    boolean hasLeft(int index)
    {
        return getLeft(index) < size;
    }
    boolean hasRight(int index)
    {
        return getRight(index) < size;
    }
    boolean hasParent(int index)
    {
        return getParent(index) >= 0;
    }

    int leftChild(int index)
    {
        return items[getLeft(index)];
    }
    int RightChild(int index)
    {
        return items[getRight(index)];
    }
    int parent(int index)
    {
        return items[getParent(index)];
    }
    void ensureCapacity()
    {
        if(size==max)
        {
            items=Arrays.copyOf(items, max*2);
            max*=2;
        }
    }
//these were the necessary functions

public void peek()
{
//if(size==0) throw new IllegalStateException(); (alternative method)
checkEmpty();
System.out.println(items[0]);
} 

//returns the first element
public void delete()
{
//deleting the first element of the heap
//extracts the min element and removes it from the array
//if (size==0) throw new IllegalStateException(); (alternative method)
checkEmpty();
int item= items[0];
items[0]=items[size-1];
size--;
heapifyDown();
System.out.println("The first element was deleted");
} 

public void insert(int item)
{
ensureCapacity();
items[size]=item;
size++;
hepifyUp();
System.out.println("The element was inserted");
}

//now the important ones
public void hepifyUp()
{
int index=size-1;
while(hasParent(index) && parent(index)> items[index])
{
    int temp;
    temp=items[getParent(index)];
    items[getParent(index)]=items[index];
    items[index]=temp;
    index= getParent(index);
    
}
}
public void heapifyDown()
{
int index=0;
while(hasLeft(index))
{
    int smaller=getLeft(index);
    if(hasRight(index) && RightChild(index)< leftChild(index))
    {
        smaller=getRight(index);
    }
    if(items[index]< items[smaller])
    {
        break;
    }
    else{
        int temp;
        temp= items[index];
        items[index]=items[smaller];
        items[smaller]=temp;
    }
    index=smaller;
    
}
}
}
