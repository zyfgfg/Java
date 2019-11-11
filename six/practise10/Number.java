package six.practise10;

/**1."23 9 -4 18 100 7"   中间是 空格
要求这串数字按照从小到大排序并生成一个数值有序的字符串
思路：将每个数字依次提取出来到一个数组中去，排序后变成一个新字符串，最后输出出来*/
import java.util.Arrays;

public class Number {
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



