import java.util.Scanner;

public class Main { // Ŭ���� ����
    public static int[] stack; // �����͸� ���� ���� ����
    public static int size = 0;
    
	public static void main(String[] args) { // ���� Ŭ���� ����
	    Scanner s = new Scanner(System.in);
	    StringBuilder sb = new StringBuilder();
	    
		int cnt = s.nextInt(); // �������� ���� ���� Ȯ��
		
		stack = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++){ // cnt ��ŭ �ݺ��� �� �ֵ��� for�� ���
		    String a = s.next();
		    
		    switch(a){ // switch-case�� ����
		    case "push":
				push(s.nextInt());
				break;
                
			case "pop":
				sb.append(pop()).append('\n');
				break;
                
			case "size":
				sb.append(size()).append('\n');
				break;
                
			case "empty":
				sb.append(empty()).append('\n');
				break;
                
			case "top":
				sb.append(top()).append('\n');
				break;
		    } // switch-case�� ����
		} // for�� ����
		System.out.println(sb);
	} //���� Ŭ���� ����
	
	// ������ ����
	public static void push(int X) {
		stack[size] = X;
		size++;
	}
    
    // ������ ����
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
    
    // ������ ����
	public static int size() {
		return size;
	}
	
	// ������ ����
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
    
    // ���� ���� ������
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
}//Ŭ���� ����