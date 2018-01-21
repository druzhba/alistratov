package ru.job4j.tracker;
/**
 * Class Item.
 * @author Anton Listratov
 * @version 1
 * @since 13.01.2018
 */
public class Item {
    /**
     * Уникальный ключ.
     */
    private String id;
    /**
     * Имя заявки.
     */
    private String name;
    /**
     * Описание заявки.
     */
    private String description;
    /**
     * Время создания заявки.
     */
    private long create;

    /**
     * Создание заявки.
     * @param name имя заявки
     * @param description описание заявки
     * @param create время создания заявки
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Установка уникального ключа.
     * @param id ключ
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Возвращение уникального ключа.
     * @return уникальный ключ
     */
    public String getId() {
        return this.id;
    }

    /**
     * Возвращает имя заявки.
     * @return имя заявки
     */
    public String getName() {
        return this.name;
    }
}
