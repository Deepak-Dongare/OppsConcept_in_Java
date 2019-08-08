package Opps;

public class demodata1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Deepak   Dongare";
		
	//	System.out.println(s);
		char ch[]=s.toCharArray();
		//System.out.println(ch);
		int i=0;
		int count=0;
//		System.out.println(ch[i]);
	for(i=0;i<s.length();i++) {
		
		
			 if(s.charAt(i) == 'D')    
				 System.out.println("D::-"+"*");
        count++;
			
        if(s.charAt(i) == 'e')    
			 System.out.println("E:-"
			 		+ ""+"*");
   count++;
			 
   if(s.charAt(i) == 'Q')  
	   
		 System.out.println("Q:-"+"*");
   
   count++;

if(s.charAt(i) == 'k')    
	 System.out.println("K:-"+"*");
count++;

if(s.charAt(i) == 32)    
	 System.out.println("32:-"
	 		+ ""+"*");
count++;
	 
if(s.charAt(i) == 'g')    
	 System.out.println("G:-"
	 		+ ""+"*");
count++;
if(s.charAt(i) == 'p')    
	 System.out.println("P:-"
	 		+ ""+"*");
count++;
	 
	 
}    
		
			
		
		//i++;
		
	//System.out.println("*");
//	System.out.println(count);
		

	}

}

