package Arrays;

public class practicearray {

	
	
 static void check(int cb[]){
	
	 int check =cb[0];
	 
	 for (int i=0;i<cb.length;i++){
		 
		 if(check < cb[i]){
			 
			 check =cb[i];
		 }
		
	 }
	 System.out.println(check);
	 
}	
	
 static void sumarray(int d[]){
	 
	 
	 int sum= 0;
	 
	for (int j=0;j<d.length;j++){
		
		sum =sum + d[j];
		
	}
	System.out.println(sum); 
	
 }
 
 
 static void reversecheck(String r){
	 
	 String s1= "";
	 
	 for(int k=r.length()-1;k>=0;k--){
		 
		 s1=s1+r.charAt(k);
	 }
	 
	 System.out.println(s1);
 }
 

 public static void main(String[]args){
	 
	
	 String s="LOVE";
     int c[]={15,17,8,21,14};
 
//     check(c);     
//     sumarray(c);
     reversecheck(s);  
 
 }
	
}
