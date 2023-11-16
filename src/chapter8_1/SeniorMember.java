package chapter8_1;

import java.time.LocalDate;

public class SeniorMember  extends  GeneralMember {
    private LocalDate hirthday;

    public SeniorMember(long id, String name, LocalDate hirthday) {
        super(id, name);
        this.hirthday = hirthday;
    }

    public LocalDate getHirthday() {
        return hirthday;
    }

    public void setHirthday(LocalDate hirthday) {
        this.hirthday = hirthday;
    }
}
