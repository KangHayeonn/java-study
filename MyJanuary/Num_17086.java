import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num_17086 { // Ŭ���� ����
    static int n, m; // n -> ��, m -> ��
    static int[][] map; // �࿭�� ���� �迭(����)
    static boolean[][] visit; 
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}, dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int ans; // ����

	public static void main(String[] args) throws IOException { // ���� Ŭ���� ����
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
     
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) { // for�� ����
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        } // for�� ��

        for (int i = 0; i < n; i++) { /// for�� ����
            for (int j = 0; j < m; j++) { // ���� for�� ����
            	
                if (map[i][j] == 0) {
                    shark(i, j); // shark Ŭ���� ȣ��
                    
                }
                
            } // ���� for�� ��
        } // for�� ��

        System.out.println(ans);
    }

    static void shark(int x, int y) { // shark Ŭ���� ����
        for (boolean[] arr : visit) Arrays.fill(arr, false);

        Queue<int[]> q = new LinkedList<>();
         
        visit[x][y] = true;
        
        q.add(new int[]{x, y});
        
        int cnt = 0;

        while (!q.isEmpty()) { // q�� �ִ� ����
            int size = q.size();

            for (int s = 0; s < size; s++) { // for�� ����
                int[] now = q.poll();

                if (map[now[0]][now[1]] == 1) {
                    ans = Math.max(ans, cnt);

                    return;
                }

                for (int d = 0; d < 8; d++) { // ���� for�� ����
                    int nx = now[0] + dx[d], ny = now[1] + dy[d];

                    if (!isRange(nx, ny) || visit[nx][ny]) 
                    	continue;

                    visit[nx][ny] = true;
                    
                    q.add(new int[]{nx, ny});
                } // ���� for�� ��
            } // for�� ��

            cnt++;
        } // shark Ŭ���� ��
	} // ���� Ŭ���� ��
    
    static boolean isRange(int x, int y) { // isRange Ŭ���� ����
        return x >= 0 && x < n && y >= 0 && y < m;
    } // isRange Ŭ���� ��
} // Ŭ���� ��
