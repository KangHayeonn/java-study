import java.util.Scanner;
import java.util.Arrays;

public class Num_11651 { // ���� Ŭ���� ����

	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // ��ǥ�� ���� 
		
		int[][] Array = new int[n][2]; // ��ǥ�� ���� �迭
		
		for(int i = 0; i < n; i++) { // for �� ����
			Array[i][0] = s.nextInt();
			
			Array[i][1] = s.nextInt();
		} // for �� ��
		
		Arrays.sort(Array, (s1, s2) -> {
			if(s1[1] == s2[1]) {
				return Integer.compare(s1[0], s2[0]);
			} 
			
			else {
				return Integer.compare(s1[1], s2[1]);
			}
		});
		
		for(int i = 0; i < n; i++) { // for�� ����
			System.out.println(Array[i][0] + " " + Array[i][1]);
		} // for�� ��
	} // ���� Ŭ���� ����
} // ���� Ŭ���� ��
