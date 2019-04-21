package java_StringMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {
	
	public  static void main(String []args) { 
	
	
	String [] names = {"java","php","perl","python","ruby","java","python"};
	
	
	     for(int i=0;i<names.length;i++) {
	    	 
	    	 for(int j=i+1;j<names.length;j++) {
	    		 
	    		if(names[i].equals(names[j])) {
	    			
	    			System.out.println("Duplicate names is :" +names[i]);
	    		}
	    		
	    	 }
	    	 
	    	
	    	 
	     }
	
	     System.out.println("**************************************************************");
	
	     
	     Set<String> store = new HashSet<String>();
	     
	     for(String name:names) {
	    	 
	    	 if(store.add(name)==false) {
	    		 
	    		System.out.println("Duplicate name is :"+ name); 
	    		 
	    	 }
	     }
	     
	     System.out.println("************************************************************************");
	     
	     
	    Map<String, Integer> storeMap = new HashMap<String,Integer>();
	    
	     for(String name:names) {
	    	 
	    	 Integer count =storeMap.get(name);
	    	 
	    	 if(count ==null) {
	    		
	    		 storeMap.put(name, 1);
	    		 
	    	 }else {
	    		 storeMap.put(name, ++count);
	    	 }
	     }
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	
	}	
	

}
