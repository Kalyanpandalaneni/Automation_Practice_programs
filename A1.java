package kalyan;

public class A1 {
public static void main(String[] args) {
	boolean loginsuccess=false;
	for(int attempt=1;attempt<=3;attempt++)
	{
		System.out.println("Attempt " +attempt+ " trying to login");
		
		if(attempt==2)
		{
			loginsuccess=true;
			System.out.println("Attempt "+attempt+" successfully login");
			break;
		}
		System.out.println("login failed on attempt "+ attempt);
	}
	if(!loginsuccess)
	{
		System.out.println("login failed cross check you credentials");
	}
	
	
	for (int a=1;a<=10;a++)
	{
		for(int b=1;b<=10;b++)
		{
			System.out.println(a+" * "+b+" = "+a*b);
		}
	}
}
}
