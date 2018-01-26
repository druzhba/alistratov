package ru.job4j.tracker;

import org.junit.Test;
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
}