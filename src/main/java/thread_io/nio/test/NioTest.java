/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: NioTest
 * Author:   YuSong
 * Date:     2018/10/30 1:35
 * Description: 客户端（NIO)
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package thread_io.nio.test;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈客户端（NIO)〉
 *
 * @author YuSong
 * @create 2018/10/30
 * @since 1.0.0
 */
public class NioTest {

    public static void main(String[] args) throws Exception {
        ByteBuffer echoBuffer = ByteBuffer.allocate(1024);
        SocketChannel channel = null;
        Selector selector = null;
        channel = SocketChannel.open();
        channel.configureBlocking(false);
        // 请求连接
        channel.connect(new InetSocketAddress("localhost", 8080));
        selector = Selector.open();
        channel.register(selector, SelectionKey.OP_CONNECT);
        int num = selector.select();
        Set selectedKeys = selector.selectedKeys();
        Iterator it = selectedKeys.iterator();
        while (it.hasNext()) {
            SelectionKey key = (SelectionKey) it.next();
            it.remove();
            if (key.isConnectable()) {
                if (channel.isConnectionPending()) {
                    if (channel.finishConnect()) {
                        // 只有当连接成功后才能注册OP_READ事件
                        key.interestOps(SelectionKey.OP_READ);
                        echoBuffer.put("123456789abcdefghijklmnopq".getBytes());
                        echoBuffer.flip();
                        System.out.println("##" + new String(echoBuffer.array()));
                        channel.write(echoBuffer);
                        System.out.println("写入完毕");
                    } else {
                        key.cancel();
                    }
                }
            }
        }

    }

}

