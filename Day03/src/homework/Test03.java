package homework;


/**
 定义方法,把整数数组的各个元素连接为一个字符串, 数组元素放在一对方括弧中,各个元素之间使用逗号分隔
 */
public class Test03 {
    public static void main(String[] args) {
        int arr[] ={11,222,333,444,555,666};
        String s = toStrings(arr);
        System.out.println(s);
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
