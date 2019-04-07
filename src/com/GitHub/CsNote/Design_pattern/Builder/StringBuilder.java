/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringBuilder
 * Author:   YuSong
 * Date:     2019/4/7 23:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Design_pattern.Builder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/7
 * @since 1.0.0
 */
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder(){
        super(16);
    }

    @Override
    public String toString() {
        return new String(value,0,count);
    }
}