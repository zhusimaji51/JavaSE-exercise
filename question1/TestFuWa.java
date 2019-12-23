package question1;

import java.util.Scanner;

public class TestFuWa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("贝贝");
			break;
		case 2:
			System.out.println("晶晶");
			break;
		case 3:
			System.out.println("欢欢");
			break;
		case 4:
			System.out.println("迎迎");
			break;
		case 5:
			System.out.println("妮妮");
			break;
		default:
			System.out.println("北京欢迎你");
		}
	}
}
