/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SimpleFactory
 * Author:   Raven
 * Date:     2019/4/2 17:09
 * Description: 简单工厂实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.SimpleFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈简单工厂实现〉
 *
 * @author Raven
 * @create 2019/4/2
 * @since 1.0.0
 */
public class SimpleFactory {

    public Product createProduct(int type){
        if (type == 1){
            return new ConcreateProduct1();
        }else if (type == 2){
            return  new ConcreateProduct2();
        }
        return  new ConcreateProduct();
    }
}
