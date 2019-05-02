/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Dao
 * Author:   YuSong
 * Date:     2019/5/2 17:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.lesson8;

/**
 * <<自定义泛型类的声明>>
 *
 * @author Raven
 * @description: 在类中凡是可以使用类型的地方都可以使用类中声明的泛型.
 * @date 2019/5/2
 */
public class Dao<T> {

    public T get(int id) {
        T result = null;

        return result;
    }

    //在泛型中使用类声明的泛型.
    public void save(T entity) {

    }

    /**
     * 在类(不一定是泛型类)中使用泛型方法.
     *
     * 1.在方法的返回值前面使用 <> 声明泛型类型，则在方法的返回值,参数,方法体中
     * 都可以使用该类型
     * @param id
     * @param <E>
     * @return
     */
    public <E> E getProperty(int id){
        E result = null;
        return result;
    }

    public <E> void test(E entity){

    }
}