package ru.sbt.school.collections.sort.comparators;

import ru.sbt.school.collections.entity.Person;

import java.util.Comparator;

/**
 * ����������, �������� ������� ��������� �������� <code>Person</code> �� ���� <code>age</code>.
 */
public class AgeComparator implements Comparator<Person> {
	@Override public int compare(Person o1, Person o2) {
		// TODO: �������� ������������, ���������� �� Integer.compare
		return o1.getAge() - o2.getAge();
	}
}
