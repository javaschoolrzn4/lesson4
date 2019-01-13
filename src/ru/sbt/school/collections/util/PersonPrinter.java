package ru.sbt.school.collections.util;

import ru.sbt.school.collections.entity.Person;

import java.util.Collection;
import java.util.Iterator;

/**
 * ����� ��������� � �������.
 */
public class PersonPrinter {
	/**
	 * ����� ������� �������� ��������� ��������� <code>c</code> � ������� � ������� ���������.
	 *
	 * @param c ���������, �������� ������� ��������� � �������
	 */
	public static void print(Collection<Person> c){
		Iterator<Person> it = c.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getId() + " " + p.getAge() + " " + p.getName());
		}
		System.out.println();
	}
}
