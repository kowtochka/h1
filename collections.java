import java.util.ArrayList;
import java.util.List;

class Cache<T> {
    private int maxSize;
    private List<T> items;

    public Cache(int n) {
        this.maxSize = n;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
        if (items.size() > maxSize) {
            items.remove(0);
        }
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public boolean exists(T item) {
        return items.contains(item);
    }

    public T getFirst() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(0);
    }

    public T getLast() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public T getItemByIndex(int i) {
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    public void printCache() {
        System.out.println("Содержимое кэша: " + items);
    }
}
