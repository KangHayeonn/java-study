/* import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Num_1181 { // Ŭ���� ����

	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(); // �ܾ��� ����
		String[] Array = new String[a]; // �ܾ ���� �迭
		
		s.nextLine();
		
		for(int i = 0 ; i < a ; i++) { // for�� ����
			Array[a] = s.nextLine();
		} // for�� ��
		
		Arrays.sort(Array, new Comparator<String>() { // ��ü Ÿ�� ���� (Comparator ���)
			@Override
			public int compare(String s1, String s2) { // compare ����
				if(s1.length() == s2.length()) { // �ܾ� ���̰� ���� ���
					return s1.compareTo(s2);
				}
				
				else { // �ܾ��� ���̰� ���� �ʴ� ���
					return s1.length() - s2.length();
				}
			}
		}); // �迭�� ����� ���� ���� ���������� �������ִ� �޼ҵ�
		
		System.out.println(Array[0]);
		
		for (int i = 1; i < a; i++) { // for�� ����
			if (!Array[i].equals(Array[i - 1])) { // �ߺ����� �ʴ� �ܾ ���
				System.out.println(Array[i]);
			}
		} // for�� ��
	} // ���� Ŭ���� ��
} // Ŭ���� �� */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
 
public class Num_1181 { // Ŭ���� ����
	public static void main(String[] args) { // ���� Ŭ���� ����
    
		Scanner s = new Scanner(System.in);
 
		int a = s.nextInt(); // ���� �ܾ��� ���� 
		String[] arr = new String[a]; // �ܾ ���� �迭
		
		s.nextLine();
 
		for (int i = 0; i < a; i++) { 
			arr[i] = s.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() { 
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) { // �ܾ� ���̰� ���� ��� 
					return s1.compareTo(s2);
				} 

				else { // �ܾ��� ���̰� ���� �ʴ� ���
					return s1.length() - s2.length();
				}
			}
		});
 
		System.out.println(arr[0]);
		
		for (int i = 1; i < a; i++) {
			// �ߺ����� �ʴ� �ܾ ���
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	} // ���� Ŭ���� ����
} //Ŭ���� ����