package cwa;
import java.util.Scanner;
public class sem1as3exampass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("please enter your name");
String s=sc.next();
System.out.println("dear"+s+" please enter your marks");
int a= sc.nextInt();
if(a>=40)
	System.out.println("Congratuation you are passed the exam");
else
	System.out.println("sorry you had failed the exam");
	}

}
