package chapter10_2;

public class Rate2 implements RateInf{

    @Override
    public double taxRate(int gaku) {
        return gaku > 80 ? 0.12 : 0.04;
    }
}
