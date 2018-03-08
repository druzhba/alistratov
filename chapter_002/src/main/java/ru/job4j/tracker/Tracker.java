package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Class Tracker.
 * @author Anton Listratov
 * @version 1
 * @since 13.01.2018
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель для новой заявки.
     */
    private int position = 0;
    /**
     * Генератор случайного числа.
     */
    private static final Random RN = new Random();
    /**
     * Метод реализирующий добавление заявки в хранилеще.
     * @param item новая заявка
     * @return заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальных полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     * @return уникальный ключ
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
    /**
     * Метод заменяет одну заявку на другую.
     * @param id уникальный ключ
     * @param item новая заявка
     */
    public void replace(String id, Item item) {
        for (int j = 0; j != this.position; j++) {
            if (this.items[j] != null && this.items[j].getId().equals(id)) {
                this.items[j] = item;
                break;
            }
        }
    }
    /**
     * Метод заменяет одну заявку на другую.
     * @param fresh новая заявка
     */
    public void edit(Item fresh) {
        for (int j = 0; j != items.length; j++) {
            Item item = items[j];
            if (item != null && item.getId().equals(fresh.getId())) {
                this.items[j] = fresh;
                break;
            }
        }
    }
    /**
     * Метод удаляет заявку.
     * @param id уникальный ключ
     */
    public void delete(String id) {
        for (int j = 0; j != this.position; j++) {
            if (this.items[j] != null && this.items[j].getId().equals(id)) {
                System.arraycopy(this.items, j + 1, this.items, j, this.items.length - 1 - j);
                this.position--;
                break;
            }
        }
    }

    /**
     * Метод показывает все заявки.
     * @return все заявки
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i != this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    /**
     * Метод находит все заявки по имени.
     * @param key имя заявки
     * @return найденные заявки
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int next = 0;
        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result[next++] = item;
            }
        }
        result = Arrays.copyOf(result, next);
        return result;
    }

    /**
     * Метод находит заявку по уникальному ключу.
     * @param id уникальный ключ
     * @return заявку
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
