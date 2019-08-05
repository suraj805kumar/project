package com.ok.example.dp.behavioral.iterator;

import java.util.Arrays;
import java.util.List;


public class StringContainer implements Container<String> {

	private List<String> listString = Arrays.asList("String", "Keyword", "I/O", "JVM", "JDK", "JRE", "Collection",
			"Genrics");

	@Override
	public Iterator<String> createIterator() {
		return new StringIterator();
	}

	private class StringIterator implements Iterator<String> {

		private int position;

		@Override
		public boolean hasNext() {

			if (position < listString.size()) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return listString.get(position++);
			} else {
				return null;
			}
		}

	}

}
