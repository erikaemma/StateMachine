package jp.ee.state;

final public class Entry {

    protected StateMachine entryStateMachine;
    protected StateMachine currentStateMachine;

    public Entry(StateMachine currentStateMachine)
    {
        this.entryStateMachine = currentStateMachine;
        this.currentStateMachine = currentStateMachine;
    }

    public void work() {
        this.currentStateMachine = this.currentStateMachine.work(this);
    }

    public void reset() {
        this.currentStateMachine = this.entryStateMachine;
    }

}
