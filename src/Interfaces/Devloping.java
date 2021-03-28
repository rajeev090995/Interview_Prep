package Interfaces;

public class Devloping implements Bankingclient,Domainclient {

	
	public static void main (String[]args){
		
		Devloping d1=new Devloping();
		
		d1.creditcardbill(5001);
		d1.paythebill("Ys");
		d1.transfermoney("Ye");
	    d1.login(); 
	    d1.investmenfund("N");
	    Bankingclient br =new Devloping();
	    Domainclient dm=new Devloping();
	    dm.investmenfund("Yes");
	}
	
	
	 
	@Override
	public void paythebill(String a) {
		// TODO Auto-generated method stub
		
		if(((a=="Yes")||(a=="YES"||a=="Y"))){
			System.out.println("Paid the Bill");
		}
		else {
			System.out.println("Not paid the bill");
		}
	}

	@Override
	public void creditcardbill(int b) {
		// TODO Auto-generated method stub
		
		if ((b >=1000 && b <=5000)){
			System.out.println("Paid the bill");
		}
			else {
				System.out.println("Not paid the bill");
			}
			
		}	
	

	@Override
	public void transfermoney(String b) {
		// TODO Auto-generated method stub
		
		if(((b=="Yes")||(b=="YES"||b=="Y"))){
	           System.out.println("Money has been transfered");
		}
	
		else {
			System.out.println("Nahi aaye paise");
		}
	}

	
	public void login(){
		System.out.println("I Logged in to the application");
	}

	@Override
	public void investmenfund(String c) {
		// TODO Auto-generated method stub
       if(c=="Yes"||c=="yes"||c=="YES"||c=="Y"||c=="y"){
    	   System.out.println("Investement is done");
       }		
       else{
    	   System.out.println("Investment is not done");
       }
	}
}
