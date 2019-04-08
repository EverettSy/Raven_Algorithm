/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: NioReceiver
 * Author:   YuSong
 * Date:     2018/10/30 1:12
 * Description: 服务端
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package thread_io.nio.test;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈服务端〉
 *
 * @author YuSong
 * @create 2018/10/30
 * @since 1.0.0
 */
public class NioReceiver {

    @SuppressWarnings("null")
    public static void main(String[] args) throws Exception {

        ByteBuffer echoBuffer = ByteBuffer.allocate(8);
        ServerSocketChannel ssc = ServerSocketChannel.open();
        Selector selector = Selector.open();
        ssc.configureBlocking(false);
        ServerSocket ss = ssc.socket();
        InetSocketAddress address = new InetSocketAddress(8080);
        ss.bind(address);
        SelectionKey key = ssc.register(selector,SelectionKey.OP_ACCEPT);
        System.out.println("开始监听");
        while (true){
            int num = selector.select();
            Set selectedKeys = selector.selectedKeys();
            Iterator it = selectedKeys.iterator();
            while (it.hasNext()){
                SelectionKey sKey = (SelectionKey) it.next();
                SocketChannel channel = null;
                if (sKey.isAcceptable()){
                    ServerSocketChannel sc = (ServerSocketChannel) key.channel();
                    // 接受连接请求
                    channel = sc.accept();
                    channel.configureBlocking(false);
                    channel.register(selector, SelectionKey.OP_READ);
                    it.remove();
                }else if (sKey.isReadable()){
                    channel = (SocketChannel) sKey.channel();
                    while (true){
                        echoBuffer.clear();
                        int r = channel.read(echoBuffer);
                        if (r <= 0){
                            channel.close();
                            System.out.println("接收完毕，断开连接");
                            break;
                        }
                        System.out.println("##"+r+" "+new String(echoBuffer.array(),0,echoBuffer.position()));
                        echoBuffer.flip();
                    }
                    it.remove();
                }else{
                    channel.close();
                }
            }
        }
    }
}

