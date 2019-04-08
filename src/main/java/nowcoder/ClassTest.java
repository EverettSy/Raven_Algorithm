/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClassTest
 * Author:   YuSong
 * Date:     2018/9/15 12:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package nowcoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/9/15
 * @since 1.0.0
 */
public class ClassTest {
    String str = new String("hello");
    char[] ch = {'a', 'b', 'c'};

    public void fun(String str, char ch[]) {
        str = "world";
        ch[0] = 'd';
    }

    public static void main(String[] args) {
        ClassTest test1 = new ClassTest();
        test1.fun(test1.str, test1.ch);
        System.out.print(test1.str + " and ");
        System.out.println( test1.ch);
    }
}
