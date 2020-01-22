package jp.ee.state;

import java.util.ArrayList;
import java.util.List;

final public class Transition {

    private StateMachine source, target;
    private List<AbstractEvent> trigger = new ArrayList<>();

    public Transition(StateMachine source, StateMachine target) {
        this.source = source;
        this.target = target;
    }

    public void addTrigger(AbstractEvent event) {
        this.trigger.add(event);
    }

    boolean trigger() {
        for(AbstractEvent event : trigger) {
            if(event.event(this.source))
                return true;
        }
        return false;
    }

    void pass() {
        for(AbstractEvent event : trigger) {
            event.clear(this.source);
        }
    }

    StateMachine getSource() {
        return this.source;
    }

    StateMachine getTarget() {
        return this.target;
    }
}
