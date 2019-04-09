/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Handler
 * Author:   Raven
 * Date:     2019/4/9 11:14
 * Description: 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.ChainOfResponsibility;


/**
 *  三、行为型
 * 〈1. 责任链（Chain Of Responsibility）〉<br>
 * 〈使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。〉
 *  Handler：定义处理请求的接口，并且实现后继链（successor）
 * @author Raven
 * @create 2019/4/9
 * @since 1.0.0
 */
public abstract class Handler {

    protected Handler successor;

    public Handler (Handler successor){
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
