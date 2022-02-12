import java.util.*;
public class question11 {
    //how many nos are less than itself
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len=sc.nextInt();
        int a[]=new int[len];
        int cnt[]= new int[len];
        for(int i=0;i<len;i++)
        {
            cnt[i]=0;
        }
        System.out.println("Enter array elements");
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
       for(int i=0;i<len;i++)
       {
           for(int j=0;j<len;j++)
           {
               if(j!=i)
               {
                if(a[j]<a[i])
                {
                    cnt[i]++;
                }
               }
           }
           System.out.println("The count is" +cnt[i]);
           
       }
    }
}
