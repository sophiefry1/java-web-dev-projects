import java.util.ArrayList;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

    public Student(String sophie, int i, int i1, double v) {
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }
    public void  setName(String name) {
       this.name = name;
       }
       public void setStudentId(int studentId) {
               this.studentId = studentId;
       }
       public void setGpa(double gpa) {
               this.gpa = gpa;
       }
       public void setNumberOfCredits(int numberOfCredits) {
               this.numberOfCredits = numberOfCredits;
       }
       public String getName() {
               return name;
       }
       public int getStudentId(){
               return studentId;
       }
       public int getNumberOfCredits(){
               return numberOfCredits;
       }
       public double getGpa(){
               return gpa;

       }

}

