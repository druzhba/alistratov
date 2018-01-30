package ru.job4j.tracker;

/**
 * Class StartUI.
 * @author Anton Listratov
 * @since 21.01.2018
 * @version 1
 */

public class StartUI {
    /**
     * Константа для добавления.
     */
    private static final int ADD = 1;
    /**
     * Константа для показа всех заявок.
     */
    private static final int SHOW = 2;
    /**
     * Константа для редактирования.
     */
    private static final int EDIT = 3;
    /**
     * Константа для удаления заявки.
     */
    private static final int DELETE = 4;
    /**
     * Константа для поиска по ID.
     */
    private static final int FINDID = 5;
    /**
     * Константа для поиска по имени.
     */
    private static final int FINDNAME = 6;
    /**
     * Константа для выхода.
     */
    private static final int EXIT = 0;
/**
 * Получение данных от пользователя.
 */
    private final Input input;
/**
 * Хранилище заявок.
 */
    private static Tracker tracker;
/**
 * Конструктор инициализирующий поля.
 * @param input ввод данных
 * @param tracker хранилище заявок
 */
    public StartUI(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
    }
    /**
     * Основной цикл программы.
     */
    public void init() {
        boolean exit = true;
        while (exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD == Integer.valueOf(answer)) {
                this.createItem();
            } else if (SHOW == Integer.valueOf(answer)) {
                this.showAll();
            } else if (EDIT == Integer.valueOf(answer)) {
                this.edit();
            } else if (DELETE == Integer.valueOf(answer)) {
                this.del();
            } else if (FINDID == Integer.valueOf(answer)) {
                this.findId();
            } else if (FINDNAME == Integer.valueOf(answer)) {
                this.findName();
            } else if (EXIT == Integer.valueOf(answer)) {
                exit = false;
            }
        }
    }
    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    public void createItem() {
        System.out.println("---------- Добавление новой заявки ----------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("---------- Новая заявка с ID : " + item.getId() + " ----------");
    }
    /**
     * Метод показывает все заявки.
     */
    public void showAll() {
        System.out.println("---------- Список всех заявок ----------");
        Item[] items = this.tracker.findAll();
        for (Item item : items) {
            System.out.println("Заявка ID : " + item.getId() + " Имя заявки : " + item.getName()
                    + " Описание заявки : " + item.getDescription());
        }
    }
    /**
     * Метод реализует редактирование заявки.
     */
    public void edit() {
        System.out.println("---------- Редактирование заявки ----------");
        String idNumber = this.input.ask("Введите id редактируемой заявки : ");
        String nameNew = this.input.ask("Введите имя новой заявки : ");
        String descNew = this.input.ask("Введите описание новой заявки : ");
        Item item = new Item(nameNew, descNew);
        item.setId(idNumber);
        this.tracker.replace(idNumber, item);
        System.out.println("---------- Заявка изменена ---------");
    }
    /**
     * Метод реализует удаление заявки.
     */
    public void del() {
        System.out.println("--------- Удаление заявки ----------");
        String idNumber = this.input.ask("Введите id заявки : ");
        this.tracker.delete(idNumber);
        System.out.println("--------- Заявка с ID : " + idNumber + " удалена ----------");

    }
    /**
     * Метод реализует поис по ID.
     */
    public void findId() {
        System.out.println("--------- Поиск заявки по ID ---------");
        String idNumber = this.input.ask("Введите ID заявки : ");
        Item item = this.tracker.findById(idNumber);
        System.out.println("Заявка ID : " + item.getId() + " Имя заявки : " + item.getName()
                + " Описание заявки : " + item.getDescription());
    }
    /**
     * Метод реализует поиск по имени.
     */
    public void findName() {
        System.out.println("--------- Поиск заявок по имени ----------");
        String name = this.input.ask("Введите имя заявки : ");
        Item[] items = this.tracker.findByName(name);
        for (Item item : items) {
            System.out.println("Заявка ID : " + item.getId() + " Имя заявки : " + item.getName()
                    + " Описание заявки : " + item.getDescription());
        }
    }
    /**
     * Метод показывает меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("1. Добавление новой заявки");
        System.out.println("2. Показать все заявки");
        System.out.println("3. Редактировать заявку");
        System.out.println("4. Удалить заявку");
        System.out.println("5. Поиск заявки по ID");
        System.out.println("6. Поиск заявки по имени");
        System.out.println("0. Выход");
    }

    /**
     * Запуск программы.
     * @param args аргументы
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
