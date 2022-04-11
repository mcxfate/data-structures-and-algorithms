/**
 * @ClassName Student
 * @Description TODO
 * @Author admin
 * @Date 2022/4/11 15:48
 **/
public class Student implements Comparable<Student>{

    private String sno;
    private String name;
    private int score;

    public Student(String sno, String name, int score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {

//        if (this.score < o.getScore()){
//            return -1;
//        }
//        if (this.score > o.getScore()){
//            return 1;
//        }
//        if (this.score == o.getScore()){
//            return 0;
//        }

        return this.score - o.getScore();

    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
