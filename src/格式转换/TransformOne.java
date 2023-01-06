package 格式转换;

import java.util.StringTokenizer;
//日期格式转换方法1
public class TransformOne {
    //日期格式转换

    /**
     * 转化为全为数字的日期格式
     * @param c String
     */
    public void trans1(String c){
        //将输入的日期分割成表示年月日的三个字符串
        String[] str=new String[3];
        StringTokenizer fenxi=new StringTokenizer(c," ,");
        int i=0;
        while (fenxi.hasMoreTokens()) {
            str[i] = fenxi.nextToken();
            i++;
        }
        boolean k=true;
        //将英文月份转换为数字月份
        switch (str[0]) {
            case "January":
                str[0]="01";
                break;
            case "February":
                str[0]="02";
                break;
            case "March":
                str[0]="03";
                break;
            case "April":
                str[0]="04";
                break;
            case "May":
                str[0]="05";
                break;
            case "June":
                str[0]="06";
                break;
            case "July":
                str[0]="07";
                break;
            case "August":
                str[0]="08";
                break;
            case "September":
                str[0]="09";
                break;
            case "October":
                str[0]="10";
                break;
            case "November":
                str[0]="11";
                break;
            case "December":
                str[0]="12";
                break;
            default:
                k=false;
                System.out.println("你输入的月份有误,请重新输入。");
                Input in=new Input();
                String s=in.Input();
                Analysis an=new Analysis();
                an.InputDate(s);
        }
        if(k)
            System.out.println(str[2]+"."+str[0]+"."+str[1]); //打印转换后的格式
    }
}
