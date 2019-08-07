package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액: ");
		int money = scanner.nextInt();
		int num;

		num = money / 50000;
		System.out.println("50000원 : " + num + "개");
		money = money - num * 50000;

		num = money / 10000;
		System.out.println("10000원 : " + num + "개");
		money = money - num * 10000;

		num = money / 5000;
		System.out.println("5000원 : " + num + "개");
		money = money - num * 5000;
		
		num = money / 1000;
		System.out.println("1000원 : " + num + "개");
		money = money - num * 1000;
		
		num = money / 500;
		System.out.println("500원 : " + num + "개");
		money = money - num * 500;
		
		num = money / 100;
		System.out.println("100원 : " + num + "개");
		money = money - num * 100;
		
		num = money / 50;
		System.out.println("50원 : " + num + "개");
		money = money - num * 50;
		
		num = money / 10;
		System.out.println("10원 : " + num + "개");
		money = money - num * 10;
		
		num = money / 5;
		System.out.println("5원 : " + num + "개");
		money = money - num * 5;
		
		num = money / 1;
		System.out.println("1원 : " + num + "개");
		money = money - num * 1;

		scanner.close();
	}
}