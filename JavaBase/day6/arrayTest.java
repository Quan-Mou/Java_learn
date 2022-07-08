import java.util.Scanner;

public class arrayTest {
  public static void main(String[] args) {

    // 1.一维数组
    // int[] arr1 = new int[] { 1, 2, 3, 4 };
    // int arr2[] = { 5, 6, 7, 8, 9 };
    // for (int i = 0; i < arr1.length; i++) {
    // System.out.println(arr1[i]);
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // System.out.println(arr2[i]);
    // }

    // System.out.println();

    // 2.二维数组

    // int[][] arr3 = new int[][] { { 1, 2, 3 }, { 7, 8, 9 } };
    // for (int i = 0; i < arr3.length; i++) {
    // for (int j = 0; j < arr3[i].length; j++) {
    // System.out.println(arr3[i][j]);
    // }
    // }

    // 求数值型数组中元素的最大值，最小值，平均数，总和等
    // 定义一个int型的整形数组，包含10个元素，分别赋一些随机整数
    // 然后求出所有元素的最大值，最小值，和值，平均数，并输出出来
    // 要求：所有随机数都是两位数
    // Scanner sca = new Scanner(System.in);
    // int[] randomNum = new int[10];
    // int i = 0;
    // int max = 0;
    // int min = 0;
    // int sum = 0;
    // int mean = 0;
    // System.out.println("请输入一个两位数");
    // anew: while (true) {
    // int input = sca.nextInt();
    // if (input / 10 < 10 & input / 10 > 0) {
    // randomNum[i] = input;
    // min = randomNum[0];
    // if (randomNum[i] > max) {
    // max = randomNum[i];
    // } else if (randomNum[i] < min) {
    // min = randomNum[i];
    // }
    // sum += randomNum[i];
    // if (i == 9) {
    // break;
    // } else {
    // i++;
    // }
    // } else {
    // System.out.println("输入数组不对，请输入一个两位数");
    // continue anew;
    // }
    // }

    // System.out.println();

    // mean = sum / randomNum.length;

    // System.out.println(max);// 最大值
    // System.out.println(min);// 最小值
    // System.out.println(sum); // 和值
    // System.out.println(mean); // 平均数

    // 从键盘读入学生成绩，找出最高分，并输出学生成绩等级
    // 成绩>=最高分-10 等级为 A
    // 成绩>=最高分-20 等级为 B
    // 成绩>=最高分-30 等级为 C

    // 先读入学生人数，根据人数创建int数组 ，存入学生成绩

    // System.out.print("请输入学生人数：");
    // Scanner sca = new Scanner(System.in);
    // // 人数
    // int num = sca.nextInt();

    // // 最高分
    // int topScore = 0;

    // // 输入学生成绩
    // int[] chegnji = new int[num];
    // for (int i = 0; i < chegnji.length; i++) {
    // chegnji[i] = sca.nextInt();
    // topScore = chegnji[0];
    // }

    // // 找出最高分
    // for (int i = 0; i < chegnji.length; i++) {
    // if (chegnji[i] > topScore) {
    // topScore = chegnji[i];
    // }
    // }

    // 数组的赋值、反转、查找（线性查找、二分查找）

    // 赋值
    // int[] sourceArr = new int[] { 1, 3, 5, 7, 9 };
    // int[] copyArr = new int[5];
    // for (int i = 0; i < sourceArr.length; i++) {
    // copyArr[i] = sourceArr[i];
    // }

    // for (int i = 0; i < copyArr.length; i++) {
    // System.out.println(copyArr[i]);
    // }

    // 反转
    // int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    // for (int i = 0; i < arr.length / 2; i++) {
    // int temp;
    // temp = arr[arr.length - i - 1];
    // arr[arr.length - i - 1] = arr[i];
    // arr[i] = temp;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }

    // 线性查找
    // int key = 78;
    // int[] arr = new int[] { 10, 23, 45, 32, 25, 78, 99, 100 };
    // // int[] arr = new int[] { 10, 23, 45, 32, 25, 99, 100 };
    // boolean flag = true;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == key) {
    // flag = false;
    // System.out.println("找到了：" + arr[i]);
    // break;
    // }
    // }
    // if (flag) {
    // System.out.println("没有找到");
    // }

    // 二分查找
    // 二分查找的前提是需要一组有序的数字
    // int[] nums = new int[] { 1, 25, 31, 45, 58, 79, 98, 102, 110, 145, 160, 189,
    // 197, 203 };
    // int findTarget = 98;
    // int mid = 0;
    // int left = nums[0];
    // int right = nums.length - 1;
    // boolean flag = false;
    // for (int i = 0; i < nums.length; i++) {
    // mid = (right + left) / 2;
    // if (nums[mid] > findTarget) {
    // right = mid;
    // mid--;
    // } else if (nums[mid] < findTarget) {
    // left = mid;
    // mid++;
    // } else {
    // flag = true;
    // break;

    // }
    // }
    // if (flag) {
    // System.out.println("找到了" + nums[mid]);
    // } else {
    // System.out.println("没找到");
    // }

    // 冒泡排序
    // int arr[] = new int[] { 10, 23, 4, 5, 100, 35, 500, 430, 230, 434, 1 };
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int tmp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = tmp;
    // }
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }

    // 数组中常见的异常
    // 1.数组角标越界（越界访问）
    // 2.空指针异常

    for (int i = 0; i < 3; i++) {

    }
    // System.out.println(i);
    if (i == 2) {
      System.out.println("i == 2");
    }

  }

}
