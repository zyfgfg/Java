package nine.practise01;

import java.util.Arrays;

/**现在有学生类和学科类   学生类属性: 学生编号  学生姓名，学科类的属性:学科编号   学科名   学科成绩

 规定如下:   学科有 语文  数学  英语  物理 化学

 现在有n个学生，每个学生的每个学科都有成绩

 a.现在要显示所有学生的所有的学科信息

 b.根据每个学生的总成绩和进行降序排序

 c.找出数学成绩前五的人的所有人信息和学科信息

 d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分*/

public class StringAPI {
    private static final String SPACE = " ";

    public static void main(String args[]) {
        String numStr = "5 3 4 8 6 2 1 7 9";
        String newNumStr = mySort(numStr);
        System.out.println("排序前:" + numStr);
        System.out.println("排序后:" + newNumStr);
    }

    private static String mySort(String numStr) {
        //以空格为分界切割整个字符串成为几个小字符串
        String[] strArrs = numStr.split(SPACE);
        //获得被转化成了的int数组
        int[] numArr = getNumArr(strArrs);
        Arrays.sort(numArr);
        //将数组中的数字拼接成一个字符串
        return toString(numArr);
    }

    //将int型数组中的数字拼接成一个字符串
    private static String toString(int[] numArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numArr.length; i++)
        {
            if (i != numArr.length-1)
                sb.append(Integer.toString(numArr[i]) + " ");
            else
                sb.append(Integer.toString(numArr[i]));
        }
        return sb.toString();
    }
    //将字符串数组的值全部转化为数字存到int型数组中去
    private static int[] getNumArr(String[] strArrs) {
        int[] arr = new int[strArrs.length];
        for (int i = 0; i < strArrs.length; i++)
        {
            arr[i] = Integer.parseInt(strArrs[i]);
        }
        return arr;
    }

}



