package chapter10_1;

import java.time.LocalDate;
import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        var list = List.of(
                new Student(10, "田中博", "tanaka@mail.jp",
                        2, LocalDate.of(2000, 1, 1)),
                new AuditingStudent(20, "木村健", "kimura@mail.jp",
                        3, 112),
                new Teacher(12, "岡田晃", "okada@mail.jp",
                        1, "https://server.jp/okada/")
        );

        for (Versionable v : list) {
            System.out.println(v.version());
        }
    }


}
