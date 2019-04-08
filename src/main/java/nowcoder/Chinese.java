/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Chinese
 * Author:   YuSong
 * Date:     2018/10/1 22:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package main.nowcoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/10/1
 * @since 1.0.0
 */
class Person{
    public static void  prt(String s){
        System.out.println(s);
    }

    /**
     * 无参构造方法
     * @return
     */
    Person(){
        prt("父类.无参构造方法： "+"A Person.");
    }

    /**
     * 含一个参数的构造方法
     * @param name
     */
    Person(String name){
        prt("父类.含一个参数的构造方法："+"A Person's name is: "+name);
    }
}
public class Chinese  extends Person{

    Chinese(){
        super();//调用父类无参构造方法
        prt("子类.调用父类“无参构造方法”："+"A chinese coder.");
    }

    Chinese(String name){
        //调用父类具有相同形参的构造方法
        super(name);
        prt("子类.调用父类 ”含有一个参数的构造方法“"+"his name is: "+name);
    }

    Chinese(String name,int age){
        //调用子类具有相同形参的构造方法
        this(name);
        prt("子类.调用子类具有相同形参的构造方法：this age is: "+age);
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        cn = new Chinese("coder");
        cn = new Chinese("coder",12);
    }
}
