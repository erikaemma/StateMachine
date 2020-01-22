package jp.ee.state.test.Events;

import jp.ee.state.StateMachine;

public class Run2WalkEvent extends BaseInputEvent {
    @Override
    public boolean event(StateMachine sourceStateMachine) {
        char c = super.getInput();
        if(c == 'Z') {
            return true;
        }
        return false;
    }
}
