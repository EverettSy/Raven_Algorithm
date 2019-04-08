/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LazySingLeton
 * Author:   YuSong
 * Date:     2018/3/24 21:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;
/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * 单例设计模式之懒汉模式
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * @author YuSong
 * @create 2018/3/24
 * @since 1.0.0
 */
public class LazySingLeton {
    private static LazySingLeton uniqueInstance;

    private LazySingLeton() {
    }

    public static synchronized LazySingLeton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new LazySingLeton();
        return uniqueInstance;
    }
}

