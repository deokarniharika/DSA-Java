import java.util.*;

//product of elements except self
public class question10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len=sc.nextInt();
        int n[]=new int[len];
        System.out.println("Enter array elements");
        for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        int pro[]=new int[len];
        for(int i=0;i<len;i++)
        {
            pro[i]=1;
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(j!=i)
                {
                pro[i]=pro[i]*n[j];
                }
            }
            System.out.println("");
          System.out.println(pro[i]);
        }

    }
}
