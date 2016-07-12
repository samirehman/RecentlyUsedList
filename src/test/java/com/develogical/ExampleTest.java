package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {

	@Test 
	public void RecentlyUsedListEmptyWnenInitialize() {
		RecentlyUsedList list = new RecentlyUsedList();
		assertThat(list.countItem(), is(0));
	}

	@Test
	public void ItemAddedToRecetlyUsedList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("5");
		assertThat(list.countItem(), is(1));
	}

	@Test
	public void RetrieveItemFromList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("5");
		assertThat(list.retrieveItem(0), is("5"));
	}

	@Test
	public void MostRecentIsFirst() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("1");
		list.addItem("2");
		list.addItem("3");
		assertThat(list.retrieveItem(0), is("3"));
	}

	@Test
	public void ItemsAreUnique() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("1");
		list.addItem("2");
		list.addItem("3");
		list.addItem("2");
		assertThat(list.retrieveItem(0), is("2"));
		assertThat(list.countItem(), is(3));
	}
}
