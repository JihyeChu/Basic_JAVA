import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		String[] name = {"�Ѻ���", "�մٿ�", "������"};
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%s�� ������ �з��Ͻÿ� : ", name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s�� ������ �з��Ͻÿ� : ", name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s�� ������ �з��Ͻÿ� : ", name[2]);
		score[2] = sc.nextInt();
		
		System.out.printf("%s ����: %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s ����: %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s ����: %.2f\n", name[2], (double)score[2]);
		
		double avg = (double)(score[0]+score[1]+score[2])/3;
		
		System.out.printf("��� : %.2f", avg);
		
		sc.close();
	}

}
