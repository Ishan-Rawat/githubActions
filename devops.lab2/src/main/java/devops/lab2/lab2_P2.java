package devops.lab2;

public class lab2_P2 {
	public int number_reverser(int a) {
		int reverse = 0;  
		while(a != 0)   
		{  
		int remainder = a%10;  
		reverse = reverse * 10 + remainder;  
		a = a/10;  
		}
		return reverse;
	}
}
