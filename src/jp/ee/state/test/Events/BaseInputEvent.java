package jp.ee.state.test.Events;

import jp.ee.state.AbstractEvent;

import java.util.Scanner;

public abstract class BaseInputEvent extends AbstractEvent {

    public char getInput() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            char c = scan.next().charAt(0);
            if(c >= 'a' && c <= 'z')
                c -= 32;
            return c;
        }
    }
}
