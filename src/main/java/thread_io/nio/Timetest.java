/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Timetest
 * Author:   YuSong
 * Date:     2018/11/10 22:51
 * Description: 取昨天、今天、明天的日期
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package thread_io.nio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 〈一句话功能简述〉<br>
 * 〈取昨天、今天、明天的日期〉
 *
 * @author Raven
 * @create 2018/11/10
 * @since 1.0.0
 */
public class Timetest {

    public static void main(String[] args) {

        //获取今天日期
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        System.out.println(date);

        //获取昨天日期
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,-1);
        String date2 = sdf.format(calendar.getTime());
        System.out.println(date2);

        Date date3 = new Date(System.currentTimeMillis()-24*60*60*1000);
        String time = sdf.format(date3);
        System.out.println(time);*/

        /**
         * 格式化时间（SimpleDateFormat）
         */
        //获取今天日期
        Date date1 = new Date();
        //时间格式
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        //格式化时间
        SimpleDateFormat sdft = new SimpleDateFormat(strDateFormat);
        // a为am/pm的标记
        sdft.applyPattern("yyyy-MM-dd HH:mm:ss a");
        System.out.println(sdft.format(date1));

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        calendar.add(Calendar.DATE, -1);
        String date3 = sdft.format(calendar.getTime());
        System.out.println(date3);


    }
}
