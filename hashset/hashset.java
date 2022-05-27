import java.io.IOException;
import java.util.*;

public class hashset {
public static void main(String[] args)throws IOException {
Scanner sc = new Scanner(System.in);
int choice;
HashSet<Integer> h1 = new HashSet<Integer>();
h1.add(22);
h1.add(33);
h1.add(44);
h1.add(88);
h1.add(10);
h1.add(99);
h1.add(74);
HashSet<Integer> h2 = new HashSet<Integer>();
h2.add(22);
h2.add(31);
h2.add(44);
h2.add(88);
h2.add(18);
h2.add(92);
h2.add(70);
//System.out.println(h1);
//System.out.println(h2);
//choice = sc.nextInt();
do {
System.out.println("--------------x-------------------\n");
System.out.println(" /Final-Viva/ \n");
System.out.println("--------------x-------------------\n");
System.out.println("1.Create a Hash Set.\n");
System.out.println("2.Iterate through all elements in a hash list 
and displaying them.\n");
System.out.println("3.Hash Set is empty or not.\n");
System.out.println("4.Compare Sets.\n");
System.out.println("5.Remove Elements from hash set.\n");
System.out.println("6.Exit.\n");
System.out.println("-------------x--------------\n");
System.out.println("Enter your choice->\n");
choice = sc.nextInt();
switch(choice) 
{
case 1: 
System.out.println("Creating HashSet...\n");
System.out.println("\n");
System.out.println("Hash Set->\n");
// int n;
// System.out.println("Enter number of elements you 
want to add: \n");
// n = sc.nextInt();
// for(int i=0; i<n; i++) {
// h1.add(i);
// }
// System.out.println("Enter number of elements you 
want to add: \n");
// n = sc.nextInt();
// for(int i=0; i<n; i++) {
// h2.add(i);
// }
System.out.println("Hash Set1 is: "+h1);
System.out.println("Hash Set2 is: "+h2);
break;
case 2:
System.out.println("Iterating through the Hash 
Set1...\n");
h1.iterator();
System.out.println("Iterating through the Hash 
Set2...\n");
h2.iterator();
break;
case 3: 
System.out.println("Checking if hash Set1 is empty or 
not...\n");
if(h1.isEmpty()) {
System.out.println("hash set is Empty!");
System.out.println(h1);
}else {
System.out.println("Hash Set is Not Empty!");
System.out.println(h1);
}
System.out.println("Checking if hash Set2 is empty or 
not...\n");
if(h2.isEmpty()) {
System.out.println("hash set is Empty!");
System.out.println(h2);
}else {
System.out.println("Hash Set is Not Empty!");
System.out.println(h2);
}
break;
case 4: 
System.out.println("Retaining similar elements...\n");
System.out.println(h1);
System.out.println(h2);
System.out.println("Similar Elements found are: \n");
h1.retainAll(h2);
h2.retainAll(h1);
System.out.println(h1);
break;
case 5:
System.out.println("Removing elements from both 
sets...\n");
h1.removeAll(h1);
h2.removeAll(h2);
System.out.println("Hash Sets after removing elements: 
\n");
System.out.println(h1);
System.out.println(h2);
break;
case 6: 
System.out.println("Exiting Program...\n");
System.out.println("Thank You!\n");
break;
default: 
System.out.println("Invalid Input!!!\n");
break;
}
}while(choice!=6);
}

                   }
