package package2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMapSerializationExample {
	
    public static void main(String[] args) {
    	HashMap<Integer,String> col=new HashMap<>();
    	col.put(1,"Sembu");
    	col.put(2,"Moon");
    	col.put(3,"Narmu");
    	col.put(4,"Vasu");
    	   // Serialize the HashMap
    	try(ObjectOutputStream oop=new ObjectOutputStream(new FileOutputStream("hashmap.ser"))) {
    		oop.writeObject(col);
   System.out.println("HashMap has been seriyalized");
   
    	}catch(IOException ex){
    		ex.printStackTrace();
    	}
    	
    	   
    	   
    	 // Deserialize the HashMap
    	  HashMap<String, Integer> deserializedMap = null;
    	  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hashmap.ser"))) {
              deserializedMap = (HashMap<String, Integer>) ois.readObject();
              System.out.println("HashMap has been deserialized.");
          } catch (IOException | ClassNotFoundException e) {
              e.printStackTrace();
          }
    	  System.out.println("Deserialized HashMap: " + deserializedMap);
    }

    }


