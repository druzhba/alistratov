package ru.job4j.tracker;

/**
 * Внешний class EditItem.
 */
class EditItem implements UserAction {
    /**
     * Метод возвращающий ключ.
     * @return ключ
     */
    public int key() {
        return 3;
    }
    /**
     * Метод редактирование заявки в хранилеще.
     * @param input данные от пользователя
     * @param tracker хранилище заявок
     */
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please, enter the task's id: ");
        String name = input.ask("Please, enter the task's name: ");
        String desc = input.ask("Please, enter the task's desc: ");
        Item task = new Item(name, desc);
        task.setId(id);
        tracker.edit(task);
    }
    /**
     * Метод отображающий информацию.
     * @return информация
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Edit the new item. ");
    }
}
/**
 * Внешний class FindNameItem.
 */
class FindNameItem implements UserAction {
    /**
     * Метод возвращающий ключ.
     * @return ключ
     */
    public int key() {
        return 6;
    }
    /**
     * Метод поиска заявок по имени в хранилеще.
     * @param input данные от пользователя
     * @param tracker хранилище заявок
     */
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Please, enter the task's name: ");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getId() + " : " + item.getName());
        }
    }
    /**
     * Метод отображающий информацию.
     * @return информация
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Find items by name. ");
    }
}
/**
 * Class MenuTracker.
 * @author Anton Listratov
 * @since 05.03.2018
 * @version 1
 */
public class MenuTracker {
    /**
     * Хранилище заявок.
     */
    private Tracker tracker;
    /**
     * Получение данных от пользователя.
     */
    private Input input;
    /**
     * Действия пользователя.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     * Конструктор инициализирующий поля.
     * @param input ввод данных
     * @param tracker хранилище заявок
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Метод выполнения ключа.
     */
    public void fillActions() {
        this.actions[0] = new Exit();
        this.actions[1] = new AddItem();
        this.actions[2] = new MenuTracker.ShowItems();
        this.actions[3] = new EditItem();
        this.actions[4] = new DeleteItem();
        this.actions[5] = new MenuTracker.FindIdItem();
        this.actions[6] = new FindNameItem();
    }
    /**
     * Метод принимающий ключ.
     * @param key ключ
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * Метод показывающий информацию.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Внутренний  class AddItem.
     */
    private class AddItem implements UserAction {
        /**
         * Метод возвращающий ключ.
         * @return ключ
         */
        public int key() {
            return 1;
        }
        /**
         * Метод добавления заявки в хранилеще.
         * @param input данные от пользователя
         * @param tracker хранилище заявок
         */
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name : ");
            String desc = input.ask("Please, enter the task's desc : ");
            tracker.add(new Item(name, desc));
        }
        /**
         * Метод отображающий информацию.
         * @return информация
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }
    /**
     * Внутренний статический class showItems.
     */
      private static class ShowItems implements UserAction {
          /**
           * Метод возвращающий ключ.
           * @return ключ
           */
          public int key() {
              return 2;
          }
          /**
           * Метод получения всех заявок заявки в хранилеще.
           * @param input данные от пользователя
           * @param tracker хранилище заявок
           */
          public void execute(Input input, Tracker tracker) {
              for (Item item : tracker.findAll()) {
                  System.out.println(String.format("%s. %s", item.getId(), item.getName()));
              }
          }
          /**
           * Метод отображающий информацию.
           * @return информация
           */
          public String info() {
              return String.format("%s. %s", this.key(), "Show all items");
          }
    }
    /**
     * Внутренний class DeleteItem.
     */
    private class DeleteItem implements UserAction {
        /**
         * Метод возвращающий ключ.
         * @return ключ
         */
        public int key() {
            return 4;
        }
        /**
         * Метод удаления заявки.
         * @param input данные от пользователя
         * @param tracker хранилище заявок
         */
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            tracker.delete(id);
        }
        /**
         * Метод отображающий информацию.
         * @return информация
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }
    /**
     * Внутренний статический class DeleteItem.
     */
    private static class FindIdItem implements UserAction {
        /**
         * Метод возвращающий ключ.
         * @return ключ
         */
        public int key() {
            return 5;
        }
        /**
         * Метод удаления заявки.
         * @param input данные от пользователя
         * @param tracker хранилище заявок
         */
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            Item item = tracker.findById(id);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }
        /**
         * Метод отображающий информацию.
         * @return информация
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id.");
        }
    }
    /**
     * Внутренний class Exit.
     */
    private class Exit implements UserAction {
        /**
         * Метод возвращающий ключ.
         * @return ключ
         */
        public int key() {
            return 0;
        }
        /**
         * Метод удаления заявки.
         * @param input данные от пользователя
         * @param tracker хранилище заявок
         */
        public void execute(Input input, Tracker tracker) {

        }
        /**
         * Метод отображающий информацию.
         * @return информация
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Exit.");
        }
    }
  }
