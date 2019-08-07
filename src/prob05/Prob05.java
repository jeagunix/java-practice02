package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int minNum = 1;
			int maxNum = 100;
			int i = 1;
			char flag;
			// 정답 랜덤하게 만들기

			Random random = new Random();
			int correctNum = random.nextInt(maxNum) + minNum;
			int answerNum;
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println(minNum + "-" + maxNum);

			while (true) {
				System.out.print(i + ">>");
				answerNum = scanner.nextInt();
				if (correctNum == answerNum) {
					System.out.println("맞았습니다.");
					break;
				} else if (correctNum < answerNum) {
					System.out.println("더 작게");
					maxNum = answerNum;
					System.out.println(minNum + "-" + maxNum);
				} else {
					System.out.println("더 크게");
					minNum = answerNum;
					System.out.println(minNum + "-" + maxNum);
				}
				i++;
			}
			System.out.print("다시하시겠습니까?(y/n)>>");
			flag = scanner.next().charAt(0);
			if (flag == 'n')
				break;

		}
		scanner.close();
	}

}