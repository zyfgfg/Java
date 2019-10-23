package banyuan.cn.cn;

public class practise01 {


    public static void main(String[] args) {
        int i = 0;
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int[] newArr = new int[12];
        for (int x : oldArr) {
            if (x != 0) {
                newArr[i++] = x;
            }
        }
        oldArr = new int[12];
        for (int j = 0; j < i; j++) {
            oldArr[j] = newArr[j];
        }
        for (int m : newArr) {
            System.out.print(m);
        }
        System.out.print("\n");
        for (int start=0,end=newArr.length-1;start<end;start++,end--) {

            int temp = newArr[start];
            newArr[start] = newArr[end];
             newArr[end]=temp;

        }
        for (int m : newArr) {
            System.out.print(m);
        }
        System.out.print("\n");


        int max=newArr[0];
        for(int y=0;y<12;y++){
            if(newArr[y]>max){
                max=newArr[y];

            }}
            int min=newArr[0];
        for(int z=0;z<12;z++){
            if(newArr[z]<min){
                min=newArr[z];

            }
        }
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);

    }
}

