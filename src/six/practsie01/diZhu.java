package six.practsie01;

import java.util.ArrayList;
import java.util.Random;

public class diZhu {
    public static void main(String[] args) {
        String[] colour = {"红桃", "梅花", "黑桃", "方块"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] wang = {"大王", "小王"};
        String[] cards = new String[55];
        Random random = new Random();
        int k = 0;
        int count_1 = 0, count_2 = 0, count_3 = 0;
        ArrayList<String> objArray = new ArrayList<String>();
//        显示54张牌
        cards[52] = wang[0];
        cards[53] = wang[1];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[k++] = colour[i] + number[j];

            }
        }
//求出谁是地主
        int dizhu = random.nextInt(3);
        switch (dizhu) {
            case 0:
                System.out.println("一号地主拥有的牌：");
                break;
            case 1:
                System.out.println("二号地主拥有的牌：");
                break;
            case 2:
                System.out.println("三号地主拥有的牌：");
                break;
            default:
                break;
        }
//随机出剩下的三张牌

        for (int i = 0; i < 3; i++) {
            int i1 = random.nextInt(53);
            System.out.print(" " + cards[i1]);
            {
                for (int j = i1; j < 54; j++) {
                    cards[j] = cards[j + 1];
                }
            }
        }
        System.out.println();
        //一号
        System.out.println("一号拥有的牌：");
        out:
        while (count_1 != 17) {
            {
                int i2 = random.nextInt(54);
                if (cards[i2] == null) {
                    continue out;
                }
                System.out.print(" " + cards[i2]);
                count_1++;
                if (count_1 == 17) {
                    break;
                }
                for (int j = i2; j < 54; j++) {
                    cards[j] = cards[j + 1];
                }
            }
        }
        //二号
        System.out.println();
        System.out.println("二号拥有的牌：");
        out2:
        while (count_2 != 17) {
            int i3 = random.nextInt(54);
            if (cards[i3] == null) {
                continue out2;
            }
            System.out.print(" " + cards[i3]);
            count_2++;
            if (count_2 == 17) {
                break;
            }
            for (int j = i3; j < 54; j++) {
                cards[j] = cards[j + 1];
            }
        }
        ////三号
        System.out.println();
        System.out.println("三号拥有的牌：");
        out3:
        while (count_3 != 17) {
            int i4 = random.nextInt(54);
            if (cards[i4] == null) {
                continue out3;
            }
            System.out.print(" " + cards[i4]);
            count_3++;
            if (count_3 == 17) {
                break;
            }
            for (int j = i4; j < 54; j++) {
                cards[j] = cards[j + 1];
            }
        }
    }
}













