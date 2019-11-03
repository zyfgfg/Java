package eight.practise01;
/**
        1:需求：请设计一个方法，可以实现获取任意范围内的随机数。
*/

import java.util.Random;
public class Random_1 {
    public static void main(String[] args) {
        Random random=new Random();
        int s = random.nextInt();
        System.out.println(s);

    }}
