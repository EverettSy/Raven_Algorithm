/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Test1
 * Author:   YuSong
 * Date:     2018/9/16 22:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package nowcoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/9/16
 * @since 1.0.0
 */
class A{
    public A foo(){
        return  this;
    }
    class B extends A{
        @Override
        public A foo(){
            return  this;
        }
    }
    class C extends B{
        public  A foo(B b){
            return b;
        }
    }
}

class Persons{
    private int age =10;
    public Persons(){
        System.out.println("初始化年龄："+age);
    }

    public int GetAge(int age) {
        this.age = age;
        return this.age;
    }
}

class Country{
    String name;
    void  value(){
        name = "China";
    }
}

class City extends Country{
    String name;

    @Override
    void value(){
        name ="ShangHai";
        super.value();//调用父类方法
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Test1 {

    public static void main(String[] args) {
        double d = Math.cos(Math.toRadians(42));
        System.out.println(d);

        Persons harry = new Persons();
        System.out.println("Harr's age is "+harry.GetAge(12));

        City city = new City();
        city.value();

        int x,y;
        x=5>>2;
        y = x>>>2;
        System.out.println(y);

        String str = "hello wprld";
        str += 100;
        System.out.println(str);
    }
}
