package estefan;

import java.util.StringTokenizer;



public class Createur {
	
	
	private static String forme;
	private static String socket[];
	private static String str;
	private static int i;
	private static int registre;
	
	public Createur(){
		
		forme= "";
		
				
	}
	
	public static void setCreateur(String str){
		
		forme = str;
		
		
	}
	
	public static Forme getForme(String forme){
		
		Forme forme1 =  null;
		
		 StringTokenizer str = new StringTokenizer(forme);
		 
	     while (str.hasMoreTokens()) {
	    	 i++;
	         
	         socket[i]= str.nextToken();
	        
	         
	     }
	 
       
      	 registre = Integer.parseInt( socket [1]);
        	 
	     if (socket[2]== "<CARRE>")
	     {
	    	forme1= new Carre(Integer.parseInt( socket [3]),Integer.parseInt( socket [4]),Integer.parseInt( socket [5]),Integer.parseInt( socket [6])); 
	     }
	     else if (socket[2]== "<RECTANGLE>")
	     {
	    	forme1= new Rectangle(Integer.parseInt( socket [3]),Integer.parseInt( socket [4]),Integer.parseInt( socket [5]),Integer.parseInt( socket [6]));
	     }
	     else if (socket[2]== "<CERCLE>")
	     {
	    	forme1= new Cercle(Integer.parseInt( socket [3]),Integer.parseInt( socket [4]),Integer.parseInt( socket [5]));
	     }
	     else if (socket[2]== "<OVAL>")
	     {
	    	 forme1= new Oval(Integer.parseInt( socket [3]),Integer.parseInt( socket [4]),Integer.parseInt( socket [5]),Integer.parseInt( socket [6]));
	     
	     }  else if (socket[2]== "<LIGNE>")
	     {
	    	 forme1= new Ligne(Integer.parseInt( socket [3]),Integer.parseInt( socket [4]),Integer.parseInt( socket [5]),Integer.parseInt( socket [6]));
	      
	     }
	     else {i=0;}
           
                  	
      return forme1;
      
		
	     
	
	
			
	}
}
	
	


