import java.util.Scanner;

public class Num_1427 { // Ŭ���� ����

	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // �����ϰ��� �ϴ� ��
		int[] Array = new int[10]; // 10�ڸ�(1,000,000,000) ���� ���� ��
		
		while(n != 0) { // �����ϰ��� �ϴ� ���� 0�� �ƴ� ������
			Array[n % 10]++;
			
			n/= 10;
		}
		
		for (int i = 9; i >= 0 ; i--) { // for �� ����
			while(Array[i]-- > 0) {
				System.out.print(i);
			}
		} // for�� ��
	} // ���� Ŭ���� ��

}// Ŭ���� ��
