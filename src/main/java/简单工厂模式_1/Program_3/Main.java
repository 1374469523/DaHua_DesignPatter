package 简单工厂模式_1.Program_3;

import java.util.Scanner;

/**
 * @Author: WangYao
 * @description: 客户端代码
 * @date: 2023-11-22 22:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D;
        try {
            System.out.println("请输入数字A");
            double A = sc.nextInt();
            System.out.println("请输入运算符号: ");
            String B = sc.nextLine();
            System.out.println("请输入数字C: ");
            double C = sc.nextInt();

            D = Operation.GetResult(A, C, B);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("结果: " + D);
    }
}
