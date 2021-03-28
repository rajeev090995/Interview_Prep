package Arrays;

public class Minnumberarray {

	
	public static void main(String[]args){
	
		
		
	int abc[][]={{7,4,5},{6,0,7},{4,13,9}};
		int min =abc[0][0];
		int mincolumn =0;
		
		for(int i=0;i<3;i++){
	 for (int j=0;j<3;j++){
	
		  if(abc[i][j]< min)
		  {  
			 min=abc[i][j]; 
		     mincolumn=j;	  
		  }
		  }
		}
	int k=0;
	int maxnumber = abc[0][mincolumn];
	while(k<3){
		
		if(abc[k][mincolumn]>maxnumber){
			
			maxnumber=abc[k][mincolumn];
		}
		k++;
	}
    System.out.println(maxnumber);
}
	}

