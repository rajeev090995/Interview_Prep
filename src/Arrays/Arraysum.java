package Arrays;

class Arraysum4 {
	int sum = 0;
	int c[] = { 10, 12, 15, 9, 15 };

	void sumofarray()
	{
		for (int i = 0; i < c.length; i++) {
			
			sum = sum + c[i];
		}
		System.out.println(sum);
	}
	int printindex(int f) {

		for (int i = 0; i < c.length; i++) {
			if (c[i] == f) {
				System.out.println(i);
				
					} 
			else {
			  	System.out.println("Not Found");
			}
		}
		return f;
	}
}

public class Arraysum {
	public static void main(String[] args) {

		Arraysum4 a1 = new Arraysum4();
		a1.sumofarray();
		a1.printindex(15);

	}

}
