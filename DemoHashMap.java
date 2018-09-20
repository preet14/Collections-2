import java.util.*;
public class DemoHashMap
{
  public static void main(String args[])
  {
    
    Map<Integer,String> l = new HashMap<>();
         
         l.put(1,"abc");
         l.put(2,"def");
         l.put(3,"efg");
         l.put(4,"pqr");
         l.put(5,"xyz");
         
         Set s = l.entrySet();

         Iterator it = s.iterator();

         while(it.hasNext())
         {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+": "+((String)me.getValue()));
         }     
  }
}