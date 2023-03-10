package HashMapConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	enum Lang {
		JAVA, JAVASCRIPT, PYTHON, CSHARP, RUBY

	}

	public static void main(String args[]) {

		// Created new enumset using all enumValues using "allof" method

		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);

		// Created empty enumSet 
		EnumSet<Lang> langs1 = EnumSet.noneOf(Lang.class);
		System.out.println(langs1);

		// created range (e1,e2), it will display mentioned range values only.
		EnumSet<Lang> langs2 = EnumSet.range(Lang.JAVA, Lang.CSHARP);
		System.out.println(langs2);

		// It will create new enumSet of value PYTHON only
		EnumSet<Lang> langs3 = EnumSet.of(Lang.PYTHON);
		System.out.println(langs3);

		// It will create new enum set of two values only i.e. Java & Python
		EnumSet<Lang> langs4 = EnumSet.of(Lang.PYTHON, Lang.JAVA);
		System.out.println(langs4);

		// add and addAll() method
		EnumSet<Lang> langs5 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> langs6 = EnumSet.noneOf(Lang.class);
		langs6.add(Lang.JAVASCRIPT); // Adding one element to Empty Enumset
		System.out.println(langs6);
		System.out.println("******************");

		langs6.addAll(langs5); // Adding langs5 elements to langs6 element list
		System.out.println(langs6);
		System.out.println("************");

		// How to iterate Enumset : using Iterator
		EnumSet<Lang> fullangs = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullangs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

			System.out.println("-----------------");

			//remove and removeall method, will return True is enumset element get removed
			
			EnumSet<Lang> remlangs = EnumSet.allOf(Lang.class);
			System.out.println(remlangs);

			boolean p = remlangs.remove(Lang.RUBY);
			System.out.println(p);
			System.out.println(remlangs);

			System.out.println("------------");

			boolean q = remlangs.removeAll(remlangs);
			System.out.println(q);
			System.out.println(remlangs);
		}

	}

}