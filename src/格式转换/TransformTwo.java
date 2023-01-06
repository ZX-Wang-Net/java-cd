package 格式转换;

import java.util.StringTokenizer;
//日期格式换方法2
public class TransformTwo {
    //转换日期格式

    /**
     * 转换为带英文月份的日期格式
     * @param c String
     */
    public void trans2(String c){
        //将输入的日期分割成表示年月日的三个字符串
        String[] str=new String[3];
        StringTokenizer fenxi=new StringTokenizer(c,".");
        int i=0;
        while (fenxi.hasMoreTokens()) {
                str[i] = fenxi.nextToken();
                i++;
        }
        boolean k=true;
        //将数字月份转换为英文月份
        switch (str[1]) { 
            case "01":
                str[1] = "January";
                break;
            case "02":
                str[1] = "February";
                break;
            case "03":
                str[1] = "March";
                break;
            case "04":
                str[1] = "April";
                break;
            case "05":
                str[1] = "May";
                break;
            case "06":
                str[1] = "June";
                break;
            case "07":
                str[1] = "July";
                break;
            case "08":
                str[1] = "August";
                break;
            case "09":
                str[1] = "September";
                break;
            case "10":
                str[1] = "October";
                break;
            case "11":
                str[1] = "November";
                break;
            case "12":
                str[1] = "December";
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
            System.out.println(str[1]+" "+str[2]+","+str[0]); //打印转换后的格式
    }
}
