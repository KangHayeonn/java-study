import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Num_7568 { // Ŭ���� ����

	public static void main(String[] args) throws IOException { // ���� Ŭ���� ����
		// TODO Auto-generated method stub 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
 
		int[][] arr = new int[n][2];// ������, Ű ���� �迭
 
		String[] sp;  // split() ���
		
		for(int i = 0; i < n; i++) { // for�� ����
			sp = br.readLine().split(" ");			// ���ڿ� �и�
			
			arr[i][0] = Integer.parseInt(sp[0]);	// [i][0] : ������ 
			arr[i][1] = Integer.parseInt(sp[1]);	// [i][1] : Ű 
			
		} // for�� ��
		
				
		for(int i = 0; i < n; i++) { // for�� ����
			int rank = 1; // ����
			
			for(int j = 0; j < n; j++) { // ���� for�� ����
				if(i == j) 
					continue;
				
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			} // ���� for�� ��
 
			System.out.print(rank + " ");
		} // for�� ��
	} // ���� Ŭ���� ��
} // Ŭ���� ��
