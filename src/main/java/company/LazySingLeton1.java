/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LazySingLeton1
 * Author:   YuSong
 * Date:     2018/3/24 23:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * 单例设计-懒汉模式
 * 保证一个类仅有一个实例，并且提供一个访问它的全局访问点
 *如果开销比较大，希望用到时才创建就要考虑延迟实例化,或者Singleton的初始化需要某些外部资源(比如网络或存储设备)
 * @author YuSong
 * @create 2018/3/24
 * @since 1.0.0
 */
public class LazySingLeton1 {

    private static LazySingLeton1 uniqueInstance;

    private LazySingLeton1() {
    }

    public static synchronized LazySingLeton1 getInstance1() {
        if (uniqueInstance == null)
            uniqueInstance = new LazySingLeton1();
        return uniqueInstance;
    }
}


