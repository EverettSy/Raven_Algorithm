/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   YuSong
 * Date:     2019/4/7 16:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Design_pattern.AbstractFactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/7
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
    }
}