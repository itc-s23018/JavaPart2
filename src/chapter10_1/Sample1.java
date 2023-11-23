package chapter10_1;

import java.time.LocalDate;

public class Sample1 {
    public static void main(String[] args) {

        Student Student = new Student(10, "田中博", "tanaka@mail.jp", 2,
                LocalDate.of(2000, 1, 1));

        if(Student instanceof Student) {
            System.out.println("Student型です");
        }

        if(Student instanceof  Attendale) {
            System.out.println("Attendale型です");
        }
    }
}
