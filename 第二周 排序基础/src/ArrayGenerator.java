import java.util.Random;

/**
 * @ClassName ArrayGenerator
 * @Description TODO
 * @Author admin
 * @Date 2022/4/9 15:18
 **/
public class ArrayGenerator {


    private ArrayGenerator() {
    }

    public static Integer[] arrayGenerator(int n) {

        Integer[] data = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt(100);
        }
        return data;
    }


}
