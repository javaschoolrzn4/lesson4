package ru.sbt.school.collections.sort;

import ru.sbt.school.collections.entity.Person;
import ru.sbt.school.collections.sort.comparators.AgeComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ����� ������������� ����������� ������ ��� ���������� ��������� <code>Person</code> �� ��������� �����.
 */
public class PersonSorter {
	/**
	 * ����� ��������� ��������� ��������� �� ���� age.
	 *
	 * @param c �������� ���������, ������� ����� �������������
	 * @return ���������, ��������������� �� ���� age
	 */
	public static Collection<Person> getSortedByAge(Collection<Person> c) {
		// ������� ������ �� ������ ���������� � ����� ���������
		List<Person> result = new ArrayList<>(c);

		// ��������� ������
		Collections.sort(result, new AgeComparator());

		// ���������� ��������� - ��������������� ������
		return result;
	}
}
