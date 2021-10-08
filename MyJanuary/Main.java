import java.io.*;
import java.util.*;

public class Main { // Ŭ���� ����
	   static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	   static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   static StringBuilder sb=new StringBuilder();
	   
	   static int N; // ������ ����
	   
	   static int heap[] = new int[100001]; // 100001�� �Ѿ�� �ʵ��� ������.
	   
	   static int top = 0; // root Ʈ��
	   
	   public static void main(String args[]) throws Exception { // ���� Ŭ���� ����
		   N=Integer.parseInt(br.readLine());
		   
		   for(int i = 0; i < N; i++) { // for�� ����
			   int num=Integer.parseInt(br.readLine());
			   
			   if(num == 0) { 
				   if(top==0) sb.append(0+"\n");
				   else sb.append(pop()+"\n");
			   }
			   else {
				   push(num);
			   }
		   } // for�� ��
		   System.out.println(sb);
	   } // ���� Ŭ���� ��
	   
	   // �������� ��
	   static void swap(int a, int b) {
		   int temp=heap[a];
		   heap[a]=heap[b];
		   heap[b]=temp;
	   }
	   
	   // ������ �Է�
	   static void push(int n) {
		   heap[++top]=n;
		   
		   int i = top;
		   
		   while(i > 1 && heap[i/2] < heap[i]) {
			   swap(i, i/2);
			   i/=2;
		   }
	   }
	   
	   // �������� ����
	   static int pop() {
		   int result=heap[1];

		   heap[1]=heap[top];
		   heap[top--]=0;
		   for(int i = 1; i * 2 <=top;) { // for�� ����
			   if(heap[i]>heap[i*2]&&heap[i]>heap[i*2+1]) break;
			   else if(heap[i*2]>heap[i*2+1]) {
				   swap(i, i*2);
				   i=i*2;
			   }
			   else {
				   swap(i, i*2+1);
				   i=i*2+1;
			   }
		   } // for�� ��
		   return result;
	   }
	} // Ŭ���� ��
