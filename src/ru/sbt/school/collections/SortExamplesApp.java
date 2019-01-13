package ru.sbt.school.collections;

import ru.sbt.school.collections.entity.Person;
import ru.sbt.school.collections.dao.PersonLoader;
import ru.sbt.school.collections.util.PersonPrinter;
import ru.sbt.school.collections.sort.PersonSorter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * ������ ����������, ������������ ���������� � ������� ������������� ������� (natural ordering) � � ������� ������������.
 */
public class SortExamplesApp {
	public static void main(String[] args) {
		// ������� ��������� ���������������� ��������� TreeSet
		Collection<Person> personList = new TreeSet<>();

		//������ ������
		PersonLoader.init(personList);

		// ������� � ������� �������� ���������, ��� ������������� � ������������ ������� (������� Person.compareTo)
		System.out.println("Natural ordering (by id):");
		PersonPrinter.print(personList);

		// ������� � ������� ���������, ��������������� �� ���� age
		System.out.println("Ordering using a comparator (by age):");
		PersonPrinter.print(PersonSorter.getSortedByAge(personList));
		
	}
}
