package 简单工厂模式_1;

import java.util.Scanner;

/**
 * @Author: WangYao
 * @description:
 * @date: 2023-11-22 22:25
 */
public class Program_2 {
    /**
     * 请用 C+、Java、C#或 VBNET 任意一种
     * 面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。”
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入数字A: ");
        Scanner sc = new Scanner(System.in);
        // 命名不规范
        int strNumberA = sc.nextInt();
        System.out.println("请输入运算符号: ");
        String strNumberB = sc.nextLine();
        System.out.println("请输入数字B: ");
        int strNumberC = sc.nextInt();

        Integer strNumberD = null;
        try {

            switch (strNumberB) {
                case "+":
                    strNumberD = strNumberA + strNumberC;
                    break;
                case "-":
                    strNumberD = strNumberA - strNumberC;
                    break;
                case "*":
                    strNumberD = strNumberA * strNumberC;
                    break;
                case "/":
                    if ((strNumberC != 0)) strNumberD = strNumberA / strNumberC;
                    break;
                default:
                    System.out.println("输入的运算符号有误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入的运算符号有误");
        }
        // 判断分支 意味每个条件都要判断 等于计算机做了三次无用工
        System.out.println("结果: " + strNumberD);

    }
}

