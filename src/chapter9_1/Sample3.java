package chapter9_1;

import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {
        Member m1 = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));


        if(m1 instanceof StudentMember stm ){
            System.out.println("期限日=" + stm.getExpDate());
        }


        //追加の検証
        Object o = new GeneralMember(200, "木村一郎");

        if (o instanceof Member m2){
            System.out.println("名前=" + m2.getName());
        }
    }
}