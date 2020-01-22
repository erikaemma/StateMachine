package jp.ee.state.test.States;

import jp.ee.state.AbstractState;
import jp.ee.state.Entry;

public class RunState extends AbstractState {

    public RunState() {
        super.name = "run";
    }

    @Override
    public void work(Entry entry) {
        System.out.println("跑步中");
    }
}
