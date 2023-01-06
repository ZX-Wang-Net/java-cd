package 格式转换;
//日期格式分析
public class Analysis {


//判断参数中字符串的格式

    /**
     * 判断键盘输入的日期所属格式并且调用相应的转换方法
     * @param m String
     */
    public void InputDate(String m){
         if (m.charAt(0)<91&&m.charAt(0)>64) {
            TransformOne to = new TransformOne();
            to.trans1(m);
        }
        else {
            TransformTwo tt = new TransformTwo();
            tt.trans2(m);
        }
    }
}
