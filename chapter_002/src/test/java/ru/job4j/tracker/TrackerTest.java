package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@ya.ru)
 * @version 1
 * @since 13.01.2018
 */
public class TrackerTest {
	/**
	*Test add.
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.findAll()[0], is(item));
	}
	/**
	*Test replace.
	*/
	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription", 123L);
		tracker.add(previous);
		Item next = new Item("test2", "testDescription2", 1234L);
		next.setId(previous.getId());
		tracker.replace(previous.getId(), next);
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}
	/**
	 *Test delete.
	 */
	@Test
	public void whenDeleteThrithThenReplaceFourth() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", 123L);
		tracker.add(first);
		Item second = new Item("test2", "testDescription2", 1234L);
		tracker.add(second);
		Item threeDelete = new Item("test3", "testDescription3", 1234L);
		tracker.add(threeDelete);
		Item fourThree = new Item("test4", "testDescription4", 1234L);
		tracker.add(fourThree);
		Item five = new Item("test5", "testDescription5", 1234L);
		tracker.add(five);
		tracker.delete(threeDelete.getId());
		assertThat(tracker.findAll()[2].getName(), is("test4"));
	}
	/**
	 *Test findAll.
	 */
	@Test
	public void whenFindAllThenResultThree() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", 123L);
		tracker.add(first);
		Item second = new Item("test2", "testDescription2", 1234L);
		tracker.add(second);
		Item three = new Item("test3", "testDescription3", 1234L);
		tracker.add(three);
		Item[] result = tracker.findAll();
		assertThat(result.length, is(3));
	}
    /**
     *Test findById.
     */
    @Test
    public void whenFindByIdThenResultItemSecond() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item three = new Item("test3", "testDescription3", 1234L);
        tracker.add(three);
        Item result = tracker.findById(second.getId());
        assertThat(tracker.findAll()[1], is(result));
    }
    /**
     *Test findByName.
     */
    @Test
    public void whenFindByNameTest2ThenReturnTwoItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item three = new Item("test3", "testDescription3", 1234L);
        tracker.add(three);
        Item four = new Item("test2", "testDescription4", 1234L);
        tracker.add(four);
        Item five = new Item("test5", "testDescription5", 1234L);
        tracker.add(five);
        Item[] result = tracker.findByName("test2");
        assertThat(second.getName(), is(result[1].getName()));
    }
}
