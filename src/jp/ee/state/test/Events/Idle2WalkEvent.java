package jp.ee.state.test.Events;

import jp.ee.state.StateMachine;
import jp.ee.state.test.States.IdleState;

public class Idle2WalkEvent extends BaseInputEvent {
    @Override
    public boolean event(StateMachine sourceStateMachine) {
        IdleState source = (IdleState)sourceStateMachine.getState();
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
        ((IdleState)sourceStateMachine.getState()).lastInputLive = false;
    }
}
