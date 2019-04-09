/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   Raven
 * Date:     2019/4/9 10:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.Prototype;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myclone();
        System.out.println(clone.toString());
    }
}
