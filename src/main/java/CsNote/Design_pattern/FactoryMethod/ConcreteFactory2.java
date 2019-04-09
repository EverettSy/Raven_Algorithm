/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConcreteFactory2
 * Author:   Raven
 * Date:     2019/4/2 17:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.FactoryMethod;

import CsNote.Design_pattern.SimpleFactory.ConcreateProduct2;
import CsNote.Design_pattern.SimpleFactory.Product;


/**
 * 〈工厂模式〉<br>
 * 〈定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类〉
 * 子类继承父类，重写父类方法并实例化
 * @author Raven
 * @create 2019/4/2
 * @since 1.0.0
 */
public class ConcreteFactory2 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreateProduct2();
    }
}
