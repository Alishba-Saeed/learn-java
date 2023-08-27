class Student {
    int num;
    String name;
}

public class App {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[3];
        for(int i=0; i< students.length; i++) {
            students[i] = new Student();
            students[i].name = "student "+(i+1);
            students[i].num = (int)(Math.random()+i);
        }

        for (Student student:students) {
            System.out.println("Student name: "+student.name+" , num: "+student.num);
        }
    }
}
