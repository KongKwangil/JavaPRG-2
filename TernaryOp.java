package cp3;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
	Scanner stdin=new Scanner(System.in);
	System.out.print("enter number:");
	int a=stdin.nextInt();//첫 번째 정수 저장
	
	boolean flag;
	flag=(a%2==0)?true:false;
	System.out.print(a+"이 짝수인가?:");
	System.out.print(flag);

	}

}
