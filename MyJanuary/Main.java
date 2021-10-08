public class Main { // Ŭ���� ����
    public static void main(String[] args) { // ���� Ŭ���� ����
        int[] f = new int[10001]; // �迭 ���� (<= 10,000) 
        
        for (int i = 1; i <= 10000; i++) { // for�� ����
            if(d(i) < 10001){ // ���� �ѹ��� 10,001 ���� ������
                f[d(i)] = 1;
            }
        } // for�� ��
        for (int i = 1; i <= 10000; i++) { // for�� ����
            if(f[i] != 1){ // �迭�� ������ 1�� �ƴ϶�� 
                System.out.println(i); // ���
            }
        }// for�� ��
    } // ���� Ŭ���� ��
    
    public static int d(int i) {
        int sum = i; // ���� ���� ��
        if (i >= 10000) { sum += i / 10000; i %= 10000; } // ù° �ڸ���
        if (i >= 1000) { sum += i / 1000; i %= 1000; } // ��° �ڸ���
        if (i >= 100) { sum += i / 100; i %= 100; } // ��° �ڸ���
        if (i >= 10) { sum += i / 10; i %= 10; } // ��° �ڸ���
        
        return sum += i;
    }
} // Ŭ���� ��