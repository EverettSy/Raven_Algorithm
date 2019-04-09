/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   Raven
 * Date:     2019/4/2 16:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.SimpleFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/2
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
       /* int type = 1;
        Product product;
        if (type == 1){
            product = new ConcreateProduct1() ;
        } else if (type == 2){
            product = new ConcreateProduct2();
        }else {
            product = new ConcreateProduct();
        }*/

        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        System.out.println(product.toString());
    }
}
