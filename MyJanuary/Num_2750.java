import java.util.Arrays;
import java.util.Scanner;

public class Num_2750 { // Ŭ���� ���� 

	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        
		int n = s.nextInt(); // ������ ����
		
		int[] Array = new int[n]; // ������ ���� �迭
		
		for (int i = 0; i < n ; i++) { // for �� ����
			Array[i] = s.nextInt();
		} // for�� ��
        
		Arrays.sort(Array); // �迭�� ����� ���� ���� ���������� �������ִ� �޼ҵ�
		
		for(int a : Array) { // for�� ����
			System.out.println(a); // Array[0] -> �ּڰ�, Array[n - 1] -> �ִ밪
		} // for �� ���� 
	} // ���� Ŭ���� ����
} // Ŭ���� ����
