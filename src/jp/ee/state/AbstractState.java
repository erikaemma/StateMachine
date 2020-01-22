package jp.ee.state;

public abstract class AbstractState {
    protected String name = "default event";

    public String getName() {
        return this.name;
    }

    public boolean equals(AbstractState state) {
        return this.name.equals(state.getName());
    }

    public abstract void work(Entry entry);
}
