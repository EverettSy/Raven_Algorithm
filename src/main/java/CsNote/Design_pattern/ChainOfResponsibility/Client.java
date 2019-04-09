/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   Raven
 * Date:     2019/4/9 14:32
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
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.TYPE1,"request1");
        handler2.handleRequest(request1);

        Request request2 = new Request(RequestType.TYPE2,"request2");
        handler2.handleRequest(request2);
    }
}
