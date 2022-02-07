import java.util.Hashtable;

public class hashtables {
    public static void main(String[] args)
    {
        Hashtable<String, Integer> ht1= new Hashtable<>();
        Hashtable<String, Integer> ht2= new Hashtable<>();

        //adding elements to different hashtable
        ht1.put("Niharika",1);
        ht1.put("Pallavi",2);
        ht1.put("Amey", 3);
        ht2.put("Shilpa", 4);
        ht2.put("Surendra", 5);

        System.out.println("Mappings of ht1"+ ht1);
        System.out.println("Mappings of ht2"+ ht2);

        //accessing the value with the key
        if(ht1.containsKey("Niharika"))
        {
            Integer n= ht1.get("Niharika");
            System.out.println("The value of the key \"Niharika\" is " + n);
        }
        //counting the number of keys in a hastable
        System.out.println("The size of the hashtable ht1 is "+ ht1.size());

        

    }
}
