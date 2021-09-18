import java.util.*;

public class Pallindrome {

	
	
		public static void main(String[] args) {
		    // madam 
		    // madam
		    
		    String str = "madamas";
		    int foward = 0, backward = str.length()-1;
		    while(foward<=backward){
		        if(str.charAt(foward) == str.charAt(backward)){
		            foward += 1;
		            backward -= 1;
		            
		        }
		        else break;
		    }
		    
		   if(foward > backward){
		       System.out.println("Palindrome");
		   }
		   else System.out.println("Not Palindrome");
		    
		 
	
}
}

