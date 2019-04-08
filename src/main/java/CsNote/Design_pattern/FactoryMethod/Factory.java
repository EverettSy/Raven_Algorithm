/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Factory
 * Author:   Raven
 * Date:     2019/4/2 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.FactoryMethod;

import CsNote.Design_pattern.SimpleFactory.Product;

/**
 * 〈一句话功能简述〉<br>
 * 〈工厂方法实现类〉
 *
 * @author Raven
 * @create 2019/4/2
 * @since 1.0.0
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
    }
}
