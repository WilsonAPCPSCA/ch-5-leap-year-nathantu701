import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Give me a year and I will tell you whether is is a leap year or not:");
int year=in.nextInt();
System.out.println(isLeapYear(year));
	}
	public static boolean isLeapYear(int year){
if (year%4==0 || year%400==0){
	return true;
}
else if (year%100==0){
	return false;
}
else {
	return false;
}
	}
	}
