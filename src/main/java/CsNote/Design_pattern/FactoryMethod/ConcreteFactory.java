/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConcreteFactory
 * Author:   Raven
 * Date:     2019/4/2 17:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.FactoryMethod;

import CsNote.Design_pattern.SimpleFactory.ConcreateProduct;
import CsNote.Design_pattern.SimpleFactory.Product;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/2
 * @since 1.0.0
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreateProduct();
    }
}
