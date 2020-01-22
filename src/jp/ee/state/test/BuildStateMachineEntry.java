package jp.ee.state.test;

import jp.ee.state.*;
import jp.ee.state.test.Events.*;
import jp.ee.state.test.States.*;

public class BuildStateMachineEntry {
    public static Entry build() {
        StateMachine idle = new StateMachine(new IdleState());
        StateMachine walk = new StateMachine(new WalkState());
        StateMachine run = new StateMachine(new RunState());

        Transition idle2walk = new Transition(idle, walk);
        idle2walk.addTrigger(new Idle2WalkEvent());
        idle.addTransition(idle2walk);

        Transition walk2idle = new Transition(walk, idle);
        walk2idle.addTrigger(new Walk2IdleEvent());
        walk.addTransition(walk2idle);

        Transition walk2run = new Transition(walk, run);
        walk2run.addTrigger(new Walk2RunEvent());
        walk.addTransition(walk2run);

        Transition run2walk = new Transition(run, walk);
        run2walk.addTrigger(new Run2WalkEvent());
        run.addTransition(run2walk);

        Transition idle2run = new Transition(idle, run);
        idle2run.addTrigger(new Idle2RunEvent());
        idle.addTransition(idle2run);

        return new Entry(idle);
    }
}
