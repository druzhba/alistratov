package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @since 03.12.2017
 * @version 1
*/
public class ArrayDuplicateTest {
/**
 * Test remove.
*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	    ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
	    String[] stringArray = {"Привет", "Мир", "Привет", "Супер", "Мир"};
	    String[] result = arrayDuplicate.remove(stringArray);
	    String[] expected = {"Привет", "Мир", "Супер"};
	    assertThat(result, is(expected));
	}
}