/**
 * @ClassName Sort
 * @Description TODO
 * @Author admin
 * @Date 2022/4/9 15:12
 **/
public class SelectionSort {

    private SelectionSort(){}

    public static void main(String[] args) {

        Integer[] data = ArrayGenerator.arrayGenerator(20);
        for (Integer value : data){
            System.out.print(value+" ");
        }

        selectSort04(data);
        System.out.println();
        for (Integer value : data){
            System.out.print(value+" ");
        }
        System.out.println();
        Student[] students = {new Student("001","test01",49),
                                new Student("002","test01",60),
                                new Student("003","test01",23)};
        selectSort04(students);
        for (Student student:students){
            System.out.println(student);
        }



    }

    public static void selectSort01(Integer[] data){
        int temp;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {

                if (data[j] < data[i]){
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return;
    }

    public static void selectSort02(Integer[] data){

        for (int i = 0; i < data.length; i++) {

            int minIndex = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            swap(data,minIndex,i);
        }

    }

    public static<E> void swap(E[] data,int i,int j ){

        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static <E extends Comparable<E>> void selectSort03(E[] data){

        for (int i = 0; i < data.length; i++) {

            int minIndex = i;
            for (int j = i; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(data,minIndex,i);

        }

    }

    public static <E extends Comparable<E>> void selectSort04(E[] data){

        for (int i = data.length - 1; i >= 0 ; i--) {

            int maxIndex = i;
            for (int j = i; j >= 0; j--) {

                if (data[j].compareTo(data[maxIndex]) > 0){
                    maxIndex = j;
                }

            }
            swap(data,i,maxIndex);
        }

    }


}
