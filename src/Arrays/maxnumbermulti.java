package Arrays;

public class maxnumbermulti {

	public static void main(String[]args){
		
		//2,4,5
		//3,0,7
		//1,2,9
		
		int bcd[][]={{2,4,5},{3,0,7},{1,2,9}};
		
		int max=bcd[0][0];
	
		for (int i=0;i<3;i++){
			
			for (int j=0;j<3;j++){
				
				if (max<bcd[i][j]){ 	
					max=bcd[i][j];
				}
			}
		}
		
		System.out.println(max);
	}
	
}
