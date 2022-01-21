package oops.abstractDemo;

public class Child2 extends Base{

    public Child2(int data) {
        super(data);
    }

    @Override
    void changeData(int val) {
        super.data *= val;
    }
}
