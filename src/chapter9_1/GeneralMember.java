package chapter9_1;

public class GeneralMember extends Member{

    public GeneralMember(long id, String name) {
        super(id, name);
    }

    @Override
    protected int fee() {
        return 1000;
    }
}
