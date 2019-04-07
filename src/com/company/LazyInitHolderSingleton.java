/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LazyInitHolderSingleton
 * Author:   YuSong
 * Date:     2018/4/14 18:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *占位符式
 * @author YuSong
 * @create 2018/4/14
 * @since 1.0.0
 */
public class LazyInitHolderSingleton {

    private LazyInitHolderSingleton(){//构造方法

    }

    private static class SingletonHolder{

        private static final LazyInitHolderSingleton INSTANCE = new LazyInitHolderSingleton();
    }

    private  static LazyInitHolderSingleton getInstance(){
        return  SingletonHolder.INSTANCE;
    }

}

