package chapter10_2;

public class Rate1 implements RateInf{
    @Override
    public double taxRate(int gaku) {
        return gaku > 100 ? 0.1 : 0.05;
    }
}
