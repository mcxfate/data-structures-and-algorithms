/**
 * @ClassName SortHelper
 * @Description TODO
 * @Author admin
 * @Date 2022/4/12 19:15
 **/
public class SortHelper {

    private SortHelper(){}

    public static<E extends Comparable<E>> boolean isSorted(String selectName,E[] data){

        if ("selection".equals(selectName)){
            for (int i = 0; i < data.length - 1 ; i++) {
                if (data[i+1].compareTo(data[i]) < 0){
                    return false;
                }
            }
        }
        return true;

    }


}
