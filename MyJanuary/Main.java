/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class Queue{ // Queue Ŭ����
    public int[] queue; // �����͸� ���� ť ����
    public int f_pointer = 0; // ť�� ���� ����ų �Լ�
    public int b_pointer = -1; // ť�� �ڸ� ����ų �Լ�
	
	Queue(){ // �⺻ Ŭ����
		
	}
	
	Queue(int number){
		queue = new int[number];
	}
	
	// ������ ����
	public void push(int x) {
		queue[++b_pointer] = x;
	}
	
	// ������ ����
	public int  pop() {
		if (empty() == 0)
			return -1;
		else
			return queue[f_pointer++];
	}
	
	// ������ ����
	public int size() {
		return b_pointer - f_pointer + 1;
	}
	
	// ������ ����
	public int empty() {
		if (size()==0)
			return 1;
		else
			return 0;
	}
	

	// ���� ���� ������
	public int front() {
		if (empty() == 0)
			return -1;
		else
			return queue[f_pointer];
	}
	
	// ���� ���� ������
	public int back() {
		if (empty() == 0)
			return -1;
		else
			return queue[b_pointer];
	}
} // Queue Ŭ���� ����

public class Main { // Ŭ���� ����
    
	public static void main(String[] args) { // ���� Ŭ���� ����
	    Scanner s = new Scanner(System.in);
	    
		int number = s.nextInt(); // �������� ���� ���� Ȯ��
		
		Queue queue = new Queue(number);
		
		for(int i = 0 ; i < number ; i++){ // cnt ��ŭ �ݺ��� �� �ֵ��� for�� ���
		    String a = s.next();
		    
		    switch(a){ // switch-case�� ����
		    case "push":
		    	int x = s.nextInt();
				queue.push(x);
				break;
                
			case "pop":
				System.out.println(queue.pop());
				break;
                
			case "size":
				System.out.println(queue.size());
				break;
                
			case "empty":
				System.out.println(queue.empty());
				break;
                
			case "front":
				System.out.println(queue.front());
				break;
			
			case "back":
				System.out.println(queue.back());
				break;
		    } // switch-case�� ����
		} // for�� ����
	} //���� Ŭ���� ����
}//Ŭ���� ����

 
