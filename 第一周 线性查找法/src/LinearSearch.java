/**
 * @ClassName LinearSearch
 * @Description TODO
 * @Author admin
 * @Date 2022/4/7 10:20
 **/
public class LinearSearch {


    private LinearSearch(){}

    public static void main(String[] args) {

        int n = 10000000;
        Integer[] data = ArrayGenerator.arrayGenerator(n);
        long startTime = System.currentTimeMillis();
        long startDate = System.nanoTime();
        System.out.println(startTime);

        for (int i = 0; i < 100; i++) {
            linearSearch(data,n);
        }

        long endTime = System.currentTimeMillis();
        long endDate = System.nanoTime();
        System.out.println(endTime);
        double time = (endTime-startTime) / 1000.0;

        System.out.println(n+" runs  : "+time+" ms");
        System.out.println((endDate- startDate) / 1000000000.0);

    }

    public static <E> int linearSearch(E[] array,E target){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

}
