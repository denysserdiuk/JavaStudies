package studies;

import java.util.Scanner;

public class Readability {
	 

	public static void main(String[] args) {
		char[] test = {'n','s','n','s','n','s','n','s','n','s'};
		Readability.isValid(test);
		
	}

		public static boolean isValid(char[] walk) {
			int destination = 0; 
		    int nsCount = 0;
		    int ewCount = 0;
	    
	    if (walk.length == 10){
	      for (int i = 0; i < walk.length; i++){
	    	if(walk[i] == 'n'){
	          nsCount++;
	          destination++;
	        } else if(walk[i] == 's'){
	          nsCount --;
	          destination --; 
	        } else if(walk[i] == 'e'){
	          ewCount++;
	          destination ++;
	        } else if(walk[i] == 'w'){
	          ewCount--;
	          destination --; 
	        } 
	       
	      } 
	      	destination += ewCount + nsCount;
	        System.out.println(destination == 0);
	         return destination == 0;
	         
	      } 
	    System.out.println("False, because char's length is: " + walk.length);
	    return false;
	  }

}
