/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConcretePrototype
 * Author:   Raven
 * Date:     2019/4/9 10:38
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
public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed){
        this.filed = filed;
    }
    @Override
    Prototype myclone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
