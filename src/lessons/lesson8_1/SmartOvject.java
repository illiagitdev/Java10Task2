package lessons.lesson8_1;

import java.util.ArrayList;

public class SmartOvject<T> {
    private ArrayList<Runnable> onUpdate = new ArrayList<>();
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        for (Runnable onUpdate : this.onUpdate
        ) {
            onUpdate.run();
        }
    }

    public void setOnUpdate(ArrayList<Runnable> onUpdate) {
        this.onUpdate = onUpdate;
    }

    public ArrayList<Runnable> getOnUpdate() {
        return onUpdate;
    }
}
