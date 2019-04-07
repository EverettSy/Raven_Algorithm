/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CopyFile
 * Author:   YuSong
 * Date:     2018/10/30 0:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread_io.nio.ibm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author YuSong
 * @create 2018/10/30
 * @since 1.0.0
 */
public class CopyFile {

    public static void main(String[] args) throws Exception {
        String infile = "d://Yusong/scc.txt";
        String outfile ="d://Yusong/result.txt";
        String clearfile = "d://Yusong/clear.txt";

        FileInputStream fin = new FileInputStream(infile);
        FileOutputStream fout = new FileOutputStream(outfile);
        FileOutputStream fclear = new FileOutputStream(clearfile);
        //获取读的通道
        FileChannel fcin = fin.getChannel();
        //获取写的通道
        FileChannel fcout = fout.getChannel();
        FileChannel fcclear = fout.getChannel();
        //定义缓冲区，并指定大小
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true){
            //清除缓冲区
            buffer.clear();
            //从通道读取一个数据到缓冲区
            int r = fcin.read(buffer);
            //判断是否从通道读取数据
            if (r == -1){
                break;
            }
            //将buffer指针指向头部
            buffer.flip();
            //将缓冲区数据写入通道
            fcout.write(buffer);
            System.out.println("写入完成");
            buffer.clear();
            buffer.flip();
            fcclear.write(buffer);
            System.out.println("清除后写入");
        }
    }
}

