/**
 * @ClassName TestDemo01
 * @Description TODO
 * @Author admin
 * @Date 2022/4/6 18:16
 **/
public class TestDemo01 extends Object {

    public static void main(String[] args) {



    }

    //线性查找法
    public static int searchArr(int[] array,int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;

    }

}
