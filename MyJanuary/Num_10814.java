import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Num_10814 { // Ŭ���� ���� 
	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
		   
		Scanner s = new Scanner(System.in);
		 
		int a = s.nextInt(); // ���� �ܾ��� ���� 
        String[][] arr = new String[a][2]; // �ܾ ���� �迭
		 
		for (int i = 0; i < a; i++) { // for�� ����
					arr[i][0] = s.next(); // ����
					arr[i][1] = s.next(); // �̸�
		} // for�� ��		
		
		Arrays.sort(arr, new Comparator<String[]>() { 
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		        }
        	});
		
		for(int i = 0; i < a; i++) { // for�� ����
			System.out.println(arr[i][0] + " " + arr[i][1]);
		} // for�� ��
	} // ���� Ŭ���� ��
} // Ŭ���� �� 
