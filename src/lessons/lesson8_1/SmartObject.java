package lessons.lesson8_1;

import java.util.ArrayList;

public class SmartObject<T> {
    private ArrayList<Runnable> onUpdate = new ArrayList<>();
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        for (int i = 0; i<onUpdate.size();i++) {
            onUpdate.get(i).run();
        }
    }

    public void setOnUpdate(ArrayList<Runnable> onUpdate) {
        this.onUpdate = onUpdate;
    }

    public ArrayList<Runnable> getOnUpdate() {
        return onUpdate;
    }
}
