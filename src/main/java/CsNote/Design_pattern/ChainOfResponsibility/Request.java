/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Request
 * Author:   Raven
 * Date:     2019/4/9 11:51
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
public class Request {

    private RequestType type;
    private String name;

    public Request(RequestType type,String name){
        this.type = type;
        this.name = name;
    }

    public RequestType getType(){
        return type;
    }

    public String getName() {
        return name;
    }
}
