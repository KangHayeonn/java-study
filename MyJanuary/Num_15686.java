import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num_15686 { // Ŭ���� ����
	// n -> ������ ����, m -> ġŲ�� ������ �ּڰ�, ans -> ����
    static int n, m, ans = Integer.MAX_VALUE;
    static boolean[] check; // 
    static List<int[]> h, ck;// h -> ���� ��ǥ, ck -> ġŲ ���� ��ǥ
    
	public static void main(String[] args) { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
	    
	    Scanner sc = new Scanner(System.in);
	    
        n = sc.nextInt(); // ���� ���� (n x n)
        m = sc.nextInt(); // ġŲ�� ������ �ּڰ�

        h = new ArrayList<>(); // ���� ��ġ
        ck = new ArrayList<>(); // ġŲ���� ��ġ

        for (int i = 0; i < n; i++) { // for�� ����
            for (int j = 0; j < n; j++)
                switch (sc.nextInt()) { // switch �� ����
                    case 1:
                        h.add(new int[]{i, j});
                        break;
                    case 2:
                        ck.add(new int[]{i, j});
                        break;
                } // switch �� �� 
        } // for�� ��
        
        check = new boolean[ck.size()];
        
        comb(-1, 0);

        System.out.println(ans); // ���� ���
    } // ���� Ŭ���� ��

    static void comb(int idx, int cnt) { // comb Class ����
        if (cnt == m) {
            int dist = 0; // 

            for (int[] a : h) {
                int tmp = Integer.MAX_VALUE;
                for (int i = 0; i < check.length; i++) {
                    if (check[i])
                        tmp = Math.min(tmp, Math.abs(a[0] - ck.get(i)[0]) + Math.abs(a[1] - ck.get(i)[1]));
                }
                dist += tmp;
            }
            ans = Math.min(ans, dist);
            return;
        }

        for (int i = idx + 1; i < check.length; i++) { // for�� ����
        	check[i] = true;
            
            comb(i, cnt + 1);
            
            check[i] = false;
        } // for�� ��
	} // combo Class ��
} // Ŭ���� ��
