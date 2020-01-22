package jp.ee.state;

public abstract class AbstractEvent {
    public abstract boolean event(StateMachine sourceStateMachine);

    public void clear(StateMachine sourceStateMachine) {
        return;
    }
}
