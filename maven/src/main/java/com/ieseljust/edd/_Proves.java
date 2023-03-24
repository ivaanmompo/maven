
import java.util.ArrayList;
import java.util.HashMap;


class _Proves {
    
    
    
    static  HashMap<String, Integer> getMesos(){
        HashMap <String,Integer  > mesos = new HashMap();
        
        mesos.put("Gener", 31);
        mesos.put("Febrer", 28);        
        
        return mesos;
    }
    

   
    static void main(String[] args) {
        ArrayList <String> pobles = new ArrayList();
        
        pobles.add("Tavernes");
        pobles.add("Tavernes Vall");
        pobles.add("Tavernes Bla");
        
        
        pobles.remove(1 );
        pobles.remove("Tavernes");
        
        
        System.out.println(pobles.get(0));
        
        pobles.set(0, "Duyeasdf");
        
        
        ArrayList <Integer> edats = new ArrayList();
        
        edats.add(10);
        edats.add(2);
        edats.add(3);
                
        edats.remove(2); // Esborra el contingut 2
        edats.remove((Integer)2); // Esborra la posició 2
                
        HashMap <String, Integer> mesos;
        mesos = getMesos();
        
        System.out.println( mesos.get("Febrer")      );
        
        mesos.replace("febrer", 29);
        
        System.out.println(   mesos.size());
        
    }

}