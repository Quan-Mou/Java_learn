import java.util.Scanner;

public class YangHuiSanJiao {
  public static void main(String[] args) {
    // 使用二维数组打印杨辉三角
    Scanner sca = new Scanner(System.in);
    System.out.print("请输入杨辉三角行数");
    int row = sca.nextInt();
    int[][] triangle = new int[row][];

    for (int i = 0; i < triangle.length; i++) {
      triangle[i] = new int[i + 1];

      triangle[i][0] = 1;
      triangle[i][triangle[i].length - 1] = 1;

      for (int j = 0; j < triangle[i].length; j++) {

        System.out.print(triangle[i][j] + " ");
      }

      System.out.println();
    }
  }
}
