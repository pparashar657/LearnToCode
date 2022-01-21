package oops.abstractDemo;

public class Child1 extends Base {

    public Child1(int data) {
        super(data);
    }

    @Override
    void changeData(int val) {
        super.data += val;
    }
}
