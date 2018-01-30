package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@ya.ru)
 * @version 1
 * @since 23.01.2018
 */
public class StartUITest {
	/**
	 * Дефолтный вывод на консоль.
	 */
	private final PrintStream stdout = System.out;
	/**
	 * Буфер для результата.
	 */
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	/**
	 * Метод устанавливает вывод в память.
	 */
	@Before
	public void loadOutput() {
		System.setOut(new PrintStream(this.out));
	}
	/**
	 * Метод устанавливает стандартный вывод.
	 */
	@After
	public void backOutput() {
		System.setOut(this.stdout);
	}
	/**
	 * Test add.
	 */
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[] {String.valueOf(1), "test1", "desc1", String.valueOf(0)});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll()[0].getName(), is("test1"));
	}
	/**
	 * Test replace.
	 */
	@Test
	public void whenUpdateThenTrackerHasUpdatedValue() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test1", "desc1"));
		Input input = new StubInput(new String[] {String.valueOf(3), item.getId(), "test2", "desc2", String.valueOf(0)});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test2"));
	}
	/**
	 * Test delete.
	 */
	@Test
	public void whenDeleteThenTrackerHasDeleteValue() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test1", "desc1"));
		Item item2 = tracker.add(new Item("test2", "desc2"));
		Item item3 = tracker.add(new Item("test3", "desc3"));
		Input input = new StubInput(new String[] {String.valueOf(4), item2.getId(), String.valueOf(0)});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll()[1].getName(), is("test3"));
	}
	/**
	 *Test findAll.
	 */
	@Test
	public void whenFindAllThenResultAll() {
		Tracker tracker = new Tracker();
		Item first = tracker.add(new Item("test1", "testDescription"));
		Item second = tracker.add(new Item("test2", "testDescription2"));
		Item three = tracker.add(new Item("test4", "testDescription4"));
		Input input = new StubInput(new String[] {String.valueOf(2), String.valueOf(0)});
		new StartUI(input, tracker).init();
		Item[] result = tracker.findAll();
		assertThat(result.length, is(3));
	}
	/**
	 *Test findById.
	 */
	@Test
	public void whenFindByIdThenResultItemSecond() {
		Tracker tracker = new Tracker();
		Item first = tracker.add(new Item("test1", "testDescription"));
		Item second = tracker.add(new Item("test2", "testDescription2"));
		Item three = tracker.add(new Item("test3", "testDescription3"));
		Input input = new StubInput(new String[] {String.valueOf(5), second.getId(), String.valueOf(0)});
		new StartUI(input, tracker).init();
		Item result = tracker.findById(second.getId());
		assertThat(tracker.findAll()[1], is(result));
	}
	/**
	 *Test findByName.
	 */
	@Test
	public void whenFindByNameTest2ThenReturnTwoItem() {
		Tracker tracker = new Tracker();
		Item first = tracker.add(new Item("test1", "testDescription"));
		Item second = tracker.add(new Item("test2", "testDescription2"));
		Item three = tracker.add(new Item("test3", "testDescription3"));
		Item four = tracker.add(new Item("test4", "testDescription4"));
		Item five = tracker.add(new Item("test2", "testDescription5"));
		Input input = new StubInput(new String[] {String.valueOf(6), "test2", String.valueOf(0)});
		new StartUI(input, tracker).init();
		Item[] result = tracker.findByName("test2");
		assertThat(second.getName(), is(result[1].getName()));
	}
}