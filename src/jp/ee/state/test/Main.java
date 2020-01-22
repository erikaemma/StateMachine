package jp.ee.state.test;

import jp.ee.state.Entry;

public class Main {
    public static void main(String[] args) {
        Entry c = BuildStateMachineEntry.build();
        while(true) {
            c.work();
        }
    }
}
