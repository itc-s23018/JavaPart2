package chapter8_1;

import java.time.LocalDate;

public class StudentMember  extends  GeneralMember {
    private LocalDate expireDate;

    public StudentMember(long id , String name, LocalDate expireDate){
        super(id, name);
        this.expireDate = expireDate;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expireDate);
    }

    public LocalDate getExpDate() {
        return expireDate;
    }

    public void setExpDate(LocalDate expireDateDate) {
        this.expireDate = expireDateDate;
    }
}
