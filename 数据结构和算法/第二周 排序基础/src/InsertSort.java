/**
 * @ClassName InsertSort
 * @Description TODO
 * @Author admin
 * @Date 2022/4/12 23:40
 **/
public class InsertSort {

    public InsertSort(){}

    public static void main(String[] args) {

        Integer[] data = ArrayGenerator.arrayGenerator(20);
        for(Integer n : data){
            System.out.print(n+" ");
        }
        System.out.println();
        insertSort01(data);
        for(Integer n : data){
            System.out.print(n+" ");
        }
        System.out.println();
        
    }
    
    
    public static void insertSort01(Integer[] data){

        int count = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = i ; j > 0; j--) {
                if (data[j-1] > data[j]){
                    Integer temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                    count++;
                }
            }

        }
        System.out.println(count);
        
    }
    

}
