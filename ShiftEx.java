package cp3;
import java.util.Scanner;
public class ShiftEx {

	public static void main(String[] args) {
	Scanner stdin=new Scanner(System.in);
	System.out.print("enter two numbers:");
	int a=stdin.nextInt(); //첫 번째 정수 저장
	int b=stdin.nextInt(); //두 번째 정수 저장		
	
	System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
	System.out.println("b="+b+"("+Integer.toBinaryString(b)+")");
	
	System.out.println("a<<2="+(a<<2)+("+Integer.toBinaryString(a<<2)+"));
	System.out.println("a>>2="+(a>>2)+("+Integer.toBinaryString(a>>2)+"));
	}

}
