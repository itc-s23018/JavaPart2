package chapter10_1;

import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {

        Attendale at1 = new Student(10, "田中博", "tanaka@mail.jp",
                2, LocalDate.of(2000, 1, 1));

        Attendale at2 = new AuditingStudent(20, "木村健", "kimura@mail.jp",
                3, 112);

        if (at1 instanceof Student) {
            System.out.println("student");
        }
        if (at1 instanceof Attendale) {
            System.out.println("attendable");
        }
        if(at1 instanceof AuditingStudent) {
            System.out.println("AuditingStudent");
        }
    }
}
