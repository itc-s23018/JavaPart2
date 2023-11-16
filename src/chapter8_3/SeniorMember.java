package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class SeniorMember extends GeneralMember {
    private LocalDate hirthday;

    public SeniorMember(long id, String name, LocalDate hirthday) {
        super(id, name);
        this.hirthday = hirthday;
    }

    @Override
    public int membershipFee() {
        return 700;
    }

    public LocalDate getHirthday() {
        return hirthday;
    }

    public void setHirthday(LocalDate hirthday) {
        this.hirthday = hirthday;
    }
}
