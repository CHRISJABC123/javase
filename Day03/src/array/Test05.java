package array;

/**
    冒泡排序
 */
public class Test05 {
    public static void main(String[] args) {
        int ints[]={2,1,4,3,9};
        //外层循环意思是比较多少轮  比较轮数=数组元素个数-1
        for (int i = 1; i < ints.length; i++) {
            System.out.println("====第"+i+"轮比较结果====");
            //内层循环意思是每轮元素的比较 每轮少比较i个元素
            for (int j = 0; j < ints.length-i; j++) {
                //从头开始两两比较交换元素
                if (ints[j]>ints[j+1]) {
                    int t= ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=t;
                }
                System.out.println(toStrings(ints));
            }
        }
        String s = toStrings(ints);
        System.out.println("排序过后数组中的元素为："+s);
    }
    private static String toStrings(int[] arr) {
        String string="[";
        for (int i = 0; i < arr.length; i++) {
            //每拿出一个元素，就和sting相加
            string+=arr[i];
            //最后一个元素后面不需要,
            if(i<arr.length-1){
                string+=",";
            }
        }
        //补全]
        return string+"]";
    }
}
