/**
 * @ClassName ArrayGenerator
 * @Description TODO
 * @Author admin
 * @Date 2022/4/9 14:01
 **/
public class ArrayGenerator {

    private ArrayGenerator(){}

    public static Integer[] arrayGenerator(int n){

        Integer[] data = new Integer[n];

        for (int i = 0; i < n; i++) {
            data[i] = i;
        }
        return data;
    }
}
