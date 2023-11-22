package 简单工厂模式_1;

import java.util.Scanner;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-22 22:25
 */
public class Program_1 {
    /**
     * 请用 C+、Java、C#或 VBNET 任意一种
     * 面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。”
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入数字A: ");
        Scanner sc = new Scanner(System.in);
        // 命名不规范
        int A = sc.nextInt();
        System.out.println("请输入运算符号: ");
        String B = sc.nextLine();
        System.out.println("请输入数字B: ");
        int C = sc.nextInt();

        Integer D = null;
        // 判断分支 意味每个条件都要判断 等于计算机做了三次无用工
        if (B.equals("+")) D = A + C;
        if (B.equals("-")) D = A - C;
        if (B.equals("*")) D = A * C;
        // 客户输入0怎么办如果输入的是字符号而不是数组
        if (B.equals("/")) D = A / C;
        System.out.println("结果: " + D);
    }
}

