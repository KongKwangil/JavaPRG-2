/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1: 동전의 총개수를 최소화
 * 조건2: 고액의 동전 우선 교환
 */
package cp3;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("Money :");
		int a=stdin.nextInt();
		
		System.out.println(a/500);
		System.out.println(a/100);
		System.out.println(a/50);
		System.out.println(a/10);
		
	}

}
