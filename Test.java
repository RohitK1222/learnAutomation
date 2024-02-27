
class Test2{
	
	
	 int heigth;
	 
	 Test2(){
		 super();
	 }
	 
	 Test2(int setHeigth){
		 
		heigth=setHeigth;
		 
	 }
	 Test2(double setHeigth){
		 heigth=(int)setHeigth;
	 }
}
class Test{
 
	    
   public static void main(String[] args){
        
		  Test2 t= new Test2();
		  Test2 t2= new Test2(20);
		  Test2 t3= new Test2(30.25);
        
	   
		System.out.println(t.heigth);      
		System.out.println(t2.heigth);
			  System.out.println(t3.heigth);
				 
	  
   }
}