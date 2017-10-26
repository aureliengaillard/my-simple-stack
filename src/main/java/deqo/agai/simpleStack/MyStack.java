package deqo.agai.simpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack implements SimpleStack {
    // Liste d'items
    private List<Item> items = new ArrayList();
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int getSize() {
        // Ce commentaire est affacté a l'exigence 1
        return this.items.size();
    }

    public void push(Item item) {
        this.items.add(item);
    }

    public Item peek() throws EmptyStackException {
        if (this.items.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return this.items.get(this.items.size() - 1);
        }
    }

    public Item pop() throws EmptyStackException {
        // Exigence 3
        if (this.items.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return this.items.remove(this.items.size() - 1);
        }
    }
}
