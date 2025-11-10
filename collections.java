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

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Cache<T> ===\n");
        
        System.out.println("ТЕСТ 1: Cache<String> размером 3");
        Cache<String> stringCache = new Cache<>(3);
        
        stringCache.add("Яблоко");
        stringCache.add("Банан");
        stringCache.add("Апельсин");
        stringCache.printCache();
        
        stringCache.add("Виноград");
        System.out.println("После добавления 'Виноград':");
        stringCache.printCache();
        
        System.out.println("\nПроверка существования:");
        System.out.println("Есть ли 'Банан'? " + stringCache.exists("Банан"));
        System.out.println("Есть ли 'Яблоко'? " + stringCache.exists("Яблоко"));
        
        System.out.println("\nПервый и последний элементы:");
        System.out.println("Первый: " + stringCache.getFirst());
        System.out.println("Последний: " + stringCache.getLast());
        
        System.out.println("\nЭлементы по индексам:");
        System.out.println("Индекс 0: " + stringCache.getItemByIndex(0));
        System.out.println("Индекс 1: " + stringCache.getItemByIndex(1));
        System.out.println("Индекс 2: " + stringCache.getItemByIndex(2));
        System.out.println("Индекс 5: " + stringCache.getItemByIndex(5));
        
        System.out.println("\nТестирование удаления:");
        System.out.println("Удаляем 'Банан': " + stringCache.remove("Банан"));
        stringCache.printCache();
        System.out.println("Удаляем 'Несуществующий': " + stringCache.remove("Несуществующий"));
        
        System.out.println("\n\nТЕСТ 2: Cache<Integer> размером 4");
        Cache<Integer> numberCache = new Cache<>(4);
        
        numberCache.add(100);
        numberCache.add(200);
        numberCache.add(300);
        numberCache.add(400);
        numberCache.printCache();
        
        numberCache.add(500);
        System.out.println("После добавления 500:");
        numberCache.printCache();
        
        System.out.println("\nПроверка методов для чисел:");
        System.out.println("Первый: " + numberCache.getFirst());
        System.out.println("Последний: " + numberCache.getLast());
        System.out.println("Есть ли 300? " + numberCache.exists(300));
        System.out.println("Есть ли 100? " + numberCache.exists(100));
        
        System.out.println("\n\nТЕСТ 3: Граничные случаи");
        Cache<String> emptyCache = new Cache<>(2);
        
        System.out.println("Первый в пустом кэше: " + emptyCache.getFirst());
        System.out.println("Последний в пустом кэше: " + emptyCache.getLast());
        System.out.println("Элемент с индексом 0 в пустом кэше: " + emptyCache.getItemByIndex(0));
        
        emptyCache.add("Один");
        System.out.println("\nПосле добавления одного элемента:");
        emptyCache.printCache();
        System.out.println("Первый: " + emptyCache.getFirst());
        System.out.println("Последний: " + emptyCache.getLast());
        System.out.println("Первый == Последний? " + emptyCache.getFirst().equals(emptyCache.getLast()));
        System.out.println("\n=== ТЕСТИРОВАНИЕ ЗАВЕРШЕНО ===");
    }
}