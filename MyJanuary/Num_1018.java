import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Num_1018 { // Ŭ���� ����
	public static boolean[][] arr; // �迭
	public static int min = 64; // �ּҰ� (8*8)

	public static void main(String[] args) throws IOException { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
		arr = new boolean[n][m];
		
 
		// �迭 �Է� 
		for (int i = 0; i < n; i++) { // for�� ����
			String str = br.readLine();
			
			for (int j = 0; j < m; j++) { // ���� for�� ����
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;		// W�� ���� true 
				} 
				
				else {
					arr[i][j] = false;		// B�� ���� false
				}
			} // ���� for�� ��
		} // for�� �� 
 
		
		int n_row = n - 7;
		int m_col = m - 7;
 
		for (int i = 0; i < n_row; i++) { // for�� ����
			for (int j = 0; j < m_col; j++) { // ���� for�� ����
	
				find(i, j); // find Ŭ���� ȣ��
				
			} // ���� for�� ��
		} // for�� ��
		
		System.out.println(min); // min �� ���

	}
	
	public static void find(int x, int y) { // find Ŭ���� ����
		int end_x = x + 8; // x�� ��
		int end_y = y + 8; // y�� ��
		int count = 0;
 
		boolean TF = arr[x][y];	// ù ��° ĭ�� �� 
 
		for (int i = x; i < end_x; i++) { // for�� ����
			for (int j = y; j < end_y; j++) { // ���� for�� ����
				// �ùٸ� ���� �ƴҰ�� count 1 ���� 
				if (arr[i][j] != TF) {	
					count++;
				}
				
				/* 
				 * ���� ĭ�� ���� �ٲ�Ƿ�
				 * true��� false��, false ��� true ��
				 * ���� �����Ѵ�.
				 */
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		/*
		 *  ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
		 *  ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
		 *  ��ĥ �� ����(64 - count) �� �ּڰ��� count �� ���� 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * ���������� ��� �� �ּڰ����� ���� count ����
		 * �� ���� ��� �ּڰ��� ���� 
		 */
		min = Math.min(min, count);
	}

}
