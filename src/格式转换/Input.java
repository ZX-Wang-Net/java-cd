package 格式转换;

import java.util.Scanner;
//字符串输入
public class Input {
    //从键盘输入一个字符串

    /**
     * 从键盘输入一个日期
     * @return 表示日期的字符串
     */
    public String Input(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("pull test!");
        return s;
    }
}
