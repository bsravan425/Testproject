import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		     
		  ArrayList<String> list=new ArrayList<String>();  
		      list.add("sravan");    
		      list.add("geeth");    
	          list.add("leela");    
		      list.add("dharam");  
//		      Iterator itr=list.iterator();
//		      while(itr.hasNext()){  
//		    	   System.out.println(itr.next());
//		      
//		 }
		      for(String names:list)    
		    	    System.out.println(names);
	}
}


 