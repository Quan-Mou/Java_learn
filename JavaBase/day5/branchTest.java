// import javax.print.FlavorException;

import java.util.Scanner;
// import java.lang.Math;

class branchTest {

	public static void main(String[] args) {

		// int num1 = 100;
		// int num2 = 50;
		// if (num1 > num2) {
		// System.out.println("hello world");
		// }

		// double num1 = 19.14;
		// double num2 = 10.1;
		// if (num1 > 10.0 && num2 < 20.0) {
		// System.out.println(num1 + num2);
		// } else {
		// System.out.println(num1 * num2);
		// }

		// 如果我家狗是5岁，那么狗的5岁相当于我们人类的多少岁呢？，比如狗的前两年每一年相当于人的10.5岁，之后每一年增加4岁。
		// Scanner scan = new Scanner(System.in);
		// System.out.println("请输入狗的年龄：");
		// int dogAge = scan.nextInt();
		// int age = 0;
		// if (dogAge > 2) {
		// dogAge = dogAge - 2;
		// age = (int)(10.5 * 2);
		// age += dogAge * 4;
		// }
		// System.out.println("狗狗的年龄相当于人类的：" + age + "岁");

		// if (dogAge > 0 && dogAge <= 2) {
		// // 狗狗在两岁
		// System.out.println("相当于人的：" + (2 * 10.5) + "岁");
		// } else if (dogAge > 2) {
		// System.out.println((int) (2 * 10.5) + ((dogAge - 2) * 4));
		// } else {
		// System.out.println("输入非法");
		// }

		// 从键盘读取三个数，从小到大输出
		// Scanner sca = new Scanner(System.in);
		// int random1 = sca.nextInt();
		// int random2 = sca.nextInt();
		// int random3 = sca.nextInt();

		// if (random1 > random2) {
		// if (random2 > random3) {
		// System.out.println(random1 + " " + random2 + " " + random3);
		// } else if (random2 < random3) {
		// System.out.println(random1 + " " + random3 + " " + random2);
		// }
		// } else {
		// if (random3 > random1) {
		// System.out.println(random2 + " " + random3 + " " + random1);
		// } else if (random3 < random1) {
		// System.out.println(random2 + " " + random1 + " " + random3);
		// }
		// }

		// 随机产生一个两位数的彩票，提示用户输入一个两位数，按照规则判定用户是否能赢
		// 1.如果用户输入的数字匹配彩票的实际顺序，奖励10000元
		// 2如果用户输入的数字匹配彩票的所有数字，但是顺序不一致，奖励3000元.
		// 3.如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖励1000元
		// 4.如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖励500元
		// 5.如果用户输入的数字没有匹配任何一个数字，则彩票作废
		// 需要生成一个10-99之间的数

		int lottery = (int) ((Math.random() * 90) + 10);
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入一个两位数彩票号码：");
		int userInput = sca.nextInt();

		if ((userInput / 10) < 10) {
			if (userInput == lottery) {
				// 符合第一条情况
				System.out.println(lottery);
				System.out.println(userInput);
				System.out.println("奖励10000元");
			} else if (userInput / 10 == lottery % 10 && lottery / 10 == userInput % 10) {
				// 符合第二条情况
				System.out.println(lottery);
				System.out.println(userInput);
				System.out.println("奖励3000元");

			} else if (userInput / 10 == lottery / 10 || userInput % 10 == lottery % 10) {
				// 符合第三条情况
				System.out.println(lottery);
				System.out.println(userInput);
				System.out.println("奖励1000元");
			} else if (userInput / 10 == lottery % 10 || userInput % 10 == lottery / 10) {
				// 符合第四条情况
				System.out.println(lottery);
				System.out.println(userInput);
				System.out.println("奖励500元");
			} else if (userInput / 10 != lottery / 10 && userInput % 10 != lottery % 10) {
				System.out.println(lottery);
				System.out.println(userInput);
				System.out.println("彩票作废");
			}
		} else {
			System.out.println("请输入一个两位数的彩票号");
		}

		// 随机给出一个整数，打印显示它的个位数，十位数，百位数的值
		// 例如：123，个位数1，十位数2，百位数3

		// Scanner sca = new Scanner(System.in);

		// System.out.println("请输入一个整数:");
		// int num = sca.nextInt();
		// if (num > 99) {
		// int b = num / 100 % 10;
		// int s = num / 10 % 10;
		// int g = num % 10;
		// System.out.println("个" + g + "十" + s + "百" + b);
		// }

	}
}