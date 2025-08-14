package variables;

import java.util.Scanner;

public class Dob {
public static void main(String[] args) {
	
	System.out.println("Enter date :");
	Scanner sc=new Scanner (System.in);
	int day=sc.nextInt();
	
	
	System.out.println("Enter Month :");
	Scanner sc1=new Scanner (System.in);
	int month=sc1.nextInt();
	
	
	System.out.println("Enter Year :");
	Scanner sc2=new Scanner (System.in);
	int Year=sc2.nextInt();
	
	String monthname;
	switch (month)
	{
	case 1: monthname="Jan"; break;
	case 2: monthname="Feb"; break;
	case 3: monthname="Mar"; break;
	case 4: monthname="April"; break;
	case 5: monthname="May"; break;
	case 6: monthname="June"; break;
	case 7: monthname="July"; break;
	case 8: monthname="Aug"; break;
	case 9: monthname="Sep"; break;
	case 10: monthname="Oct"; break;
	case 11: monthname="Nov"; break;
	case 12: monthname="Dec"; break;
	default: monthname="Invalid"; break; 
	}
	
	
	System.out.println();
	System.out.printf("%02d-%s-%d",day, monthname,Year);
	sc.close();
}
}
