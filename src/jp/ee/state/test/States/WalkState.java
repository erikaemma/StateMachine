package jp.ee.state.test.States;

import jp.ee.state.AbstractState;
import jp.ee.state.Entry;

public class WalkState extends AbstractState {

    public WalkState() {
        super.name = "walk";
    }

    public boolean lastInputLive = false;
    public char lastInput = '0';

    @Override
    public void work(Entry entry) {
        System.out.println("行走中");
    }
}
