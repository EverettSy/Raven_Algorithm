/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Log4jTestDemo
 * Author:   Raven
 * Date:     2019/4/8 16:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/8
 * @since 1.0.0
 */
public class Log4jTestDemo {

    private static Logger logger = LoggerFactory.getLogger(Log4jTestDemo.class);

    public static void main(String[] args) {

        //记录debug级别的信息
        logger.debug("This is debug message");
        //记录info级别的信息
        logger.info("This is info message");
        //记录error级别的信息
        logger.error("This is error message");
    }
}
