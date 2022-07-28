//28-07-22
import java.util.*;
class leet1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        int l1=str1.length();
        int l2=str2.length();
        int count=0,l=0;
       if(l1>l2)
       {
        l=l1;
       }
       else{
        l=l2;
       }
        char[] ca1 = str1.toCharArray();
        char[] ca2 = str2.toCharArray();
  
        // sort the char array
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        if(Arrays.equals(ca1,ca2)==true)
        {  
            System.out.println("Is an anagram");
        }
    else{
        System.out.println("Not an anagram");
    }
    }
}
