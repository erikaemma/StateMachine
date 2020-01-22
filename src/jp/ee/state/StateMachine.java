package jp.ee.state;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {

    private AbstractState state;
    private List<Transition> transitions = new ArrayList<>();

    public StateMachine(AbstractState state) {
        this.state = state;
    }

    public void addTransition(Transition transition) {
        this.transitions.add(transition);
    }

    StateMachine work(Entry entry) {
        this.state.work(entry);
        Transition last = null;
        for(Transition transition : transitions) {
            if(transition.getSource() == this) {
                last = transition;
                if(transition.trigger())
                    return transition.getTarget();
            }
        }
        last.pass();
        return this;
    }

    public String getName() {
        return this.state.getName();
    }

    public AbstractState getState() {
        return this.state;
    }
}
