package arrays;

import java.util.Arrays;

public class MyArray {
	
	/**
	 * �� ����� �����������
	 * ��������
	 * "������� � �������� ������ ����
	 * � �� ���� ����� - ��� ������� �����
	 * ������ ����������� �������� � ����
	 * ������� ������� �������� ���"
	 *
	 * ������, ���������� ����� ������
	 * ���� ����� ������ ����, �� �������
	 * <p>����� ������ %������% ������ �����</p>
	 * ���������� ���������� ����, ������� �����
	 * ������������ �����
	 *
	 * ���� ����������� ��������� ����� ��������� ����������
	 *
	 * �������� java MyArray %�����������%,
	 * ���� ����� UI Itellij Idea
	 *
	 * */
	public static void main(String args[]) {
		
		String st;
		String outputText = "";
		for (int i = 0; i < args.length; ++i){
			st = args[i];
			String defaultText = String.format("����� ������ %s ������ ����� ", st);
			outputText = String.format("����� ������ %s ������ ����� ", st);
			if (st.length() % 2 == 0){
				outputText += "��� ";
			}
			if (st.length() % 3 == 0){
				outputText += "��� ";
			}
			System.out.println(outputText.equals(defaultText) ? "kek" : outputText);
		}
		Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		
	}
}
