/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConcreteHandler2
 * Author:   Raven
 * Date:     2019/4/9 14:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.ChainOfResponsibility;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/9
 * @since 1.0.0
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2){
            System.out.println(request.getName()+" is handle by ConcreteHandler2");
            return;
        }
        if (successor != null){
            successor.handleRequest(request);
        }
    }
}
