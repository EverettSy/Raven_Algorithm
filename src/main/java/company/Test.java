/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Test
 * Author:   YuSong
 * Date:     2018/4/14 20:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author YuSong
 * @create 2018/4/14
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args){

        StringBuffer sBuffer = new StringBuffer("菜鸟教程网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        // 将此字符序列用其反转形式取代
        //sBuffer.reverse();
        System.out.println(sBuffer);
        //将 int 参数的字符串表示形式插入此序列中。offset表示位置,str：插入的内容
        System.out.println(sBuffer.delete(2,4));
        System.out.println(sBuffer.insert(2,"教程"));
        //使用给定 String 中的字符替换此序列的子字符串中的字符.start表示起始位置，end表示结束外置，str表示要替换的内容
        System.out.println(sBuffer.replace(2,4,"驿站物流"));


       /*
       * Java charAt() 方法
       * charAt() 方法用于返回指定索引处的字符。
       * 索引范围为从 0 到 length() - 1。
       * **/
        String s = "www.runoob.com";
        //char reult = s.charAt(8);
        System.out.println(s.charAt(9));

        //java compareTo()
        /*
        * 字符串与对象进行比较。
        * 按字典顺序比较两个字符串。
        * */
        String str1 = "Strings";
        String str2 ="Strings";
        String str3 = "Strings123";

        int result  = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);

        //compareTolgnoreCase()方法用于按字典顺序比较俩个字符串，不考虑大小写
        String str4 = "STRINGS";
        String str5 ="Strings";
        String str6= "Strings123";

        int results = str4.compareToIgnoreCase(str5);
        System.out.println(results);

        results = str5.compareToIgnoreCase(str6);
        System.out.println(results);

        results = str6.compareToIgnoreCase(str4);
        System.out.println(results);

        String sc ="我买网:";
        sc = sc.concat("www.womaiwang.com");
        System.out.println(sc);

        String str11 = "String1";
        String str12 = "String";
        StringBuffer str13 = new StringBuffer("String1");

        boolean resultso = str11.contentEquals(str13);
        System.out.println(resultso);

        resultso = str12.contentEquals(str13);
        System.out.println(resultso);


        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);

        String yest = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        System.out.println(yest);
    }

}

