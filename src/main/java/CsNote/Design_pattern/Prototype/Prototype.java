/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Prototype
 * Author:   Raven
 * Date:     2019/4/9 10:31
 * Description: 原型模式（Prototype）
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.Prototype;

/**
 * 〈一句话功能简述〉<br>
 * 〈原型模式（Prototype）〉
 *  使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 * @author Raven
 * @create 2019/4/9
 * @since 1.0.0
 */
public abstract class Prototype {

    abstract Prototype myclone();
}


