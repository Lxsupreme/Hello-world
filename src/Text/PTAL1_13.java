package Text;

import java.util.Scanner;

public class PTAL1_13 {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
        // write your code here
        //��1+2!+3!+4!+������50!=��
        //����̨����׳˵����ֵ��
//���������
        long temp = 1;
        long sum = 0;
//ѭ����������
        for (int i = 0; i < a; i++) {//�������
            for (int k = 1; k <= i + 1; k++) {//���ƽ׳�
                temp = temp * k;//��ÿ�����ݽ׳�
            }
            sum = sum + temp;//���
//������ʱ����temp
            temp = 1;
        }
        System.out.println(sum);//������
    }


}
