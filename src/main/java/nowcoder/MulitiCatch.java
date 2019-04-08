/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MulitiCatch
 * Author:   YuSong
 * Date:     2018/10/10 11:43
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
 * @create 2018/10/10
 * @since 1.0.0
 */
public class MulitiCatch {

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
            System.out.println("b="+b);
        } catch (ArithmeticException e) {
            System.out.println("除0异常："+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组超越边界异常"+e);
        }
    }
}
