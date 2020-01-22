package jp.ee.state.test.States;

import jp.ee.state.AbstractState;
import jp.ee.state.Entry;

public class IdleState extends AbstractState {

    public IdleState() {
        super.name = "idle";
    }

    public boolean lastInputLive = false;
    public char lastInput = '0';

    @Override
    public void work(Entry entry) {
        System.out.println("站立中");
    }
}
