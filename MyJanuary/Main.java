import java.util.Arrays;
import java.util.Scanner;
 
public class Main { // Ŭ���� ����
	public static void main(String[] args) { // ���� Ŭ���� ����
    
		Scanner s = new Scanner(System.in);
        
		int n = s.nextInt(); // ������ ����
		
		int[] Array = new int[n]; // ������ ���� �迭
        
		for (int i = 0; i < n ; i++) { // for �� ����
			Array[i] = s.nextInt();
		} // for�� ��
        
		s.close();
		Arrays.sort(Array); // �迭�� ����� ���� ���� ���������� �������ִ� �޼ҵ�
		System.out.print(Array[0] + " " + Array[n - 1]); // Array[0] -> �ּڰ�, Array[n - 1] -> �ִ밪
	} // ���� Ŭ���� ��
} // Ŭ���� ��