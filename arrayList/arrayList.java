import java.util.*;

class Active {
    static void display(ArrayList<String> a) // print function
    {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " (Position: " + i + ")");

        }
    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        ArrayList<String> al = new ArrayList<String>(); // defining an array list
        ArrayList<String> ah = new ArrayList<String>();
        int opt=0;
        int ch;
        do{
            System.out.println(
                "Enter options \n1. Enter Elements of List 1 \n2. Enter Elements of List 2  \n3. Compare \n4. Compare by function \n5. Sort\n6.Update the array list\n");
             opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter no of elements");
                    n1 = sc.nextInt();
                    for (int i = 0; i < n1; i++) {
                        sc.nextLine();
                        System.out.println("Enter element" + i);// add elements
                        String names = sc.nextLine();
                        al.add(names);
                        
                    } // calling the display function
                    display(al);
                    break;
    
                case 2:
                    System.out.println("Enter no of elements");
                    n2 = sc.nextInt();
                    for (int i = 0; i < n2; i++) {
                        sc.nextLine();
                        System.out.println("Enter element" + i);// add elements
                        String names = sc.nextLine();
                        ah.add(names);
                        
                    }
                    display(ah);
                    break;
    
                case 3:
                    if (n1 != n2) {
                        System.out.println("array list is not equal");
                    } else {
                        String str1, str2;
                        int flag = 0;
                        for (int i = 0; i < n1; i++) {
                            str1 = al.get(i);
                            str2 = ah.get(i);
                            if (str1.equals(str2)==true ){
                                continue;
                            }
                            else{
                                flag =1;
                                break;
                            }
                                
                           
                           
                        }
    
                        if (flag == 0)
                            System.out.println("The array lists are equal");
                        else
                            System.out.println("The array lists are not equal");
                        
                    }
                    break;
    
                case 4:
                    boolean bb = al.equals(ah); // comparing two array lists
                    if (bb == true)
                        System.out.println("The array lists are equal");
                    else
                        System.out.println("The array lists are not equal");
                    break;
    
                case 5:
                    System.out.println("After sorting");
                    Collections.sort(al); // sorting the arrayList using sort function
                    System.out.println("Array list 1");
                    display(al);
                    Collections.sort(ah);
                    System.out.println("Array list 2");
                    display(ah);
                    break;
    
                case 6:
                    System.out.println("Enter string to be replaced");
                    sc.nextLine();
                    String names1 = sc.nextLine();
                    
                    int n = al.indexOf(names1); // getting the index of "Tanish"
    
                    System.out.println("Enter new string");
                   
                    String names2 = sc.nextLine();
                    sc.nextLine();
                    al.set(n, names2); // updating the value
                    display(al);
                    break;
    
                default:
                    System.out.println("Enter correct input");
    
            }
            System.out.println("press 1 to continue");
            ch=sc.nextInt();
        }while(ch==1);

    }

}
