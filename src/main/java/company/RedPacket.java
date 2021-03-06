/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: RedPacket
 * Author:   Raven
 * Date:     2018/9/26 0:10
 * Description: 红包算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;

import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈红包算法〉
 * 模拟微信红包生成，以分为单位
 *
 * @author Raven
 * @create 2018/9/26
 * @since JDK 1.8
 */
public class RedPacket {

    /**
     * 生成红包最小值1分
     */
    private static final int MIN_MONEY = 1;

    /**
     * 生成红包最大值 200元人民币（200 * 100）/分
     */
    private static final int MAX_MONEY = 200 * 100;

    /**
     * 小于最小值
     */
    private static final int LESS = -1;

    /**
     * 大于最大值
     */
    private static final int MORE = -2;

    /**
     * 正常值
     */
    private static final int OK = 1;

    /**
     * 最大的红包是平均值的TIMES倍,防止某一次分配红包较大
     */
    private static final double TIMS = 2.1F;

    private int recursiveCount = 0;

    /**
     * @param money
     * @param count
     * @return
     */
    private List<Integer> splitRedPacket(int money, int count) {
        List<Integer> moneys = new LinkedList<>();

        //计算出最大红包
        int max = (int) ((money / count) * TIMS);
        max = max > MAX_MONEY ? MIN_MONEY : max;

        for (int i = 0; i < count; i++) {
            //随机获取红包
            int redPacket = randomRedPacket(money, MIN_MONEY, max, count - i);
            moneys.add(redPacket);
            //总金额每次减少
            money -= redPacket;
        }
        return moneys;
    }

    /**
     * @param totalMoney
     * @param minMoney
     * @param maxMoney
     * @param count
     * @return
     */
    private int randomRedPacket(int totalMoney, int minMoney, int maxMoney, int count) {
        //只有一个红包直接返回
        if (count == 1) {
            return totalMoney;
        }
        if (minMoney == maxMoney) {
            return minMoney;
        }

        //如果最大金额大于了剩余金额 则用剩余金额 因为这个 money 每分配一次都会减小
        maxMoney = maxMoney > totalMoney ? totalMoney : maxMoney;

        //在minMoney到maxMoney 生成一个随机红包
        int redPacket = (int) (Math.random() * (maxMoney - minMoney) + minMoney);

        int lastMoney = totalMoney - redPacket;

        int status = checkMoney(lastMoney, count - 1);

        //正常金额
        if (OK == status) {
            return redPacket;
        }

        //生成的金额不合法，则递归重新生成
        if (LESS == status) {
            recursiveCount++;
            System.out.println("recursiveCount==" + recursiveCount);
            return randomRedPacket(totalMoney, minMoney, redPacket, count);
        }
        if (MORE == status) {
            recursiveCount++;
            System.out.println("recursiveCount===" + recursiveCount);
            return randomRedPacket(totalMoney, redPacket, maxMoney, count);
        }
        return redPacket;

    }

    /**
     * 检验剩余的金额的平均值是否在最小值和最大值这个范围
     *
     * @param lastMoney
     * @param count
     * @return
     */
    private int checkMoney(int lastMoney, int count) {

        double avg = lastMoney / count;
        if (avg < MIN_MONEY) {
            return LESS;
        }
        if (avg > MAX_MONEY) {
            return MORE;
        }
        return OK;
    }

    public static void main(String[] args) {
        RedPacket redPacket = new RedPacket();
        List<Integer> redPackets = redPacket.splitRedPacket(20000, 10);
        System.out.println(redPackets);

        int sum = 0;
        for (Integer red : redPackets) {
            sum += red;
        }
        System.out.println(sum);
    }
}
