import java.util.Hashtable;
import java.util.Map;
//dictionaries in java are implemented using hashtables
public class hashtables {
    public static void main(String[] args)
    {
        Hashtable<String, Integer> ht1= new Hashtable<>();
        Hashtable<String, Integer> ht2= new Hashtable<>();
        Hashtable<String, Integer> ht3= new Hashtable<>(9, 0.8f);
        // here 9 defines the initial size and 0.8f defines the fill capacity of the hashtable
        //adding elements to different hashtable
        ht1.put("Niharika",1);
        ht1.put("Pallavi",2);
        ht1.put("Amey", 3);
        ht2.put("Shilpa", 4);
        ht2.put("Surendra", 5);

        System.out.println("Initial Mappings of ht1 "+ ht1);
        ht1.put("Niharika", 9); 
        ht1.remove("Niharika", 9); //altering the value present at index 0
        System.out.println("Final mappings of ht1 "+ ht1);
        System.out.println("Mappings of ht2 "+ ht2);
        //accessing the value with the key
        if(ht1.containsKey("Niharika"))
        {
            Integer n= ht1.get("Niharika");
            System.out.println("The value of the key \"Niharika\" is " + n);
        }

        Hashtable<String, Integer> ht =new Hashtable<>(ht1);
        System.out.println("Mappings of ht1 onto ht are " + ht);
        //counting the number of keys in a hastable
        System.out.println("The size of the hashtable ht1 is "+ ht1.size());
        ht1.clone();
        ht1.clear();
        System.out.println(ht1);
        //clearing out the whole hashtable
        Hashtable<String, Integer> ht4= new Hashtable<>();
        ht4.put("one", 1);
        ht4.put("two", 2);
        ht4.put("three", 3);
        System.out.println("ht4");
        System.out.println("Keys\tValues");
        for(Map.Entry<String, Integer>e: ht4.entrySet())
        {
            System.out.println("Keys Values");
            System.out.println(e.getKey()+" "+e.getValue());
        }//traversing and accesing all they key-value pairs of ht4

    }
}
