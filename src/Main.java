import java.util.*;

public class Main {

    private static final int COLLECTION_SIZE = 10000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        addRandomValuesToTail(linkedList);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция добавления %s случайных значений в %s заняла %s мс", COLLECTION_SIZE,  "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        addRandomValuesToTail(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция добавления %s случайных значений в %s заняла %s мс", COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция вставки %s случайных значений в середину списка в %s заняла %s мс", COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция вставки %s случайных значений в середину списка в %s заняла %s мс", COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция получения %s случайных значений из середины списка в %s заняла %s мс", COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция получения %s случайных значений из середины списка в %s заняла %s мс", COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromTail(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция удаления %s элементов из конца списка в %s заняла %s мс", COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromTail(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция удаления %s элементов из конца списка в %s заняла %s мс", COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция удаления %s элементов из середины списка в %s заняла %s мс", COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Операция удаления %s элементов из середины списка в %s заняла %s мс", COLLECTION_SIZE, "ArrayList", endTime - startTime));
    }

    private static void deleteValuesFromCenter(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < COLLECTION_SIZE/2; i++) {
            iterator.next();
        }

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

    private static void deleteValuesFromTail(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.remove(list.size() - 1);
        }
    }

    private static void getValuesWithRandomIndex(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            String value = list.get(generateRandomIndex());
        }
    }

    private static int generateRandomIndex() {
        return random.nextInt(COLLECTION_SIZE);
    }

    private static void addRandomValuesToCenter(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < COLLECTION_SIZE/2; i++) {
            iterator.next();
        }

        for (int i = 0; i < COLLECTION_SIZE; i++) {
            iterator.add(generateRandomValue());
        }
    }

    private static void addRandomValuesToTail(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.add(generateRandomValue());
        }
    }

    private static String generateRandomValue() {
        return UUID.randomUUID().toString();
    }
}