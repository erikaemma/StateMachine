package jp.ee.state.test.Events;

import jp.ee.state.StateMachine;
import jp.ee.state.test.States.WalkState;

public class Walk2IdleEvent extends BaseInputEvent {
    @Override
    public boolean event(StateMachine sourceStateMachine) {
        WalkState source = (WalkState)sourceStateMachine.getState();
        if(!source.lastInputLive)
            source.lastInput = super.getInput();
        if(source.lastInput == 'W' || source.lastInput == 'S' || source.lastInput == 'A' || source.lastInput == 'D') {
            source.lastInputLive = false;
            return true;
        }
        source.lastInputLive = true;
        return false;
    }

    @Override
    public void clear(StateMachine sourceStateMachine) {
        ((WalkState)sourceStateMachine.getState()).lastInputLive = false;
    }
}
