/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AbstractStringBuilder
 * Author:   YuSong
 * Date:     2019/4/7 23:22
 * Description: 一个简易的 StringBuilder 实现，参考了 JDK 1.8 源码。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CsNote.Design_pattern.Builder;

import java.util.Arrays;

/**
 * 〈生成器（Builder）〉
 * 封装一个对象的构造过程，并允许按步骤构造。
 * 〈一个简易的 StringBuilder 实现，参考了 JDK 1.8 源码。〉
 *
 * @author Raven
 * @create 2019/4/7
 * @since 1.0.0
 */
public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int cpacity) {
        count = 0;
        value = new char[cpacity];
    }

    public AbstractStringBuilder append(char c) {
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        if (minimumCapacity - value.length > 0) {
            expandCapacity(minimumCapacity);
        }
    }

    void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - minimumCapacity < 0) {
            newCapacity = minimumCapacity;
        }
        if (newCapacity < 0) {
            if (minimumCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value, newCapacity);
    }
}
