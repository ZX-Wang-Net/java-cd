package 格式转换;
import java.util.*;
//输出语句“请输入一个日期”，调用Input类的对象从键盘输入一个日期，并调用Analysis类的对象对该日期进行格式判断
public class DateDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个日期");
        Input in=new Input();
        String s=in.Input();
        Analysis an=new Analysis();
        an.InputDate(s);
    }
}
