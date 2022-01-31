package project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cash {

	// ��ĳ��
	 Scanner scan = new Scanner(System.in);
	 
	 static Behind behind = new Behind();

	// ���� ����
	 int point = 50000; // ���� ȸ������ �����Ǵ� ����Ʈ
	 int total = 0; // �հ�
	 int price; // ��ȭǥ ����
	 int cash; // ����
	 int difference; // ����
	 int pcash; // ����
	 int dcash;

	// ���� ȸ��, ��ȸ�� ����Ʈ
	 Map<String, Integer> rCashGrade = new LinkedHashMap<>();
	 Map<String, Integer> nCashGrade = new LinkedHashMap<>();

	/**
	 * ���� ������
	 */
	protected  void ticketing() {

		System.out.println("=====================");
		System.out.println("1. ���� ȸ�� �����ϱ�");
		System.out.println("2. ��ȸ�� �����ϱ�");
		System.out.println();
		System.out.print("��ȣ�� �Է����ּ���: ");
		try {
			int userNo = scan.nextInt();
			if (userNo == 1) {
				redGrade();
			}

			else if (userNo == 2) {
				notGrade();
			} else {
				System.out.println("�ȳ� ���� ���� ��ȣ�Դϴ�");
				System.out.println("�ٽ� ó������ ���ư��ϴ�");
				behind.category();
			}
		} catch (NullPointerException e) {
			System.out.println("�����߻�");
		}

	}

	/**
	 * ��ȸ��
	 */
	public  void notUCash() {

		nCashGrade.put("����", 12000);
		nCashGrade.put("û�ҳ�", 9000);
		nCashGrade.put("���", 5000);
		nCashGrade.put("���", 5000);

		nCashGrade.forEach((k, v) -> System.out.println(k + ", " + v));
	}

	/**
	 * ����ȸ��
	 */
	public  void redUCash() {

		rCashGrade.put("����", 9000);
		rCashGrade.put("û�ҳ�", 5000);
		rCashGrade.put("���", 3000);
		rCashGrade.put("���", 3000);

		rCashGrade.forEach((k, v) -> System.out.println(k + ", " + v));

	}

	/**
	 * ��ȸ�� ����
	 */
	public  void notGrade() {
		System.out.println("=====================");
		System.out.println("========��ȸ��========");
		notUCash();
		System.out.println("*, ���� ȸ�� �����ϱ�");
		System.out.println("\n������ ���ɴ븦 ���ڷ� �Է����ּ���");
		System.out.print("���ɴ� �Է�: ");

		String age = scan.next();

		switch (age) {
		case "����":

			int price = nCashGrade.get("����");
			nCheckout(price);
			break;
		case "û�ҳ�":

			price = nCashGrade.get("û�ҳ�");
			nCheckout(price);
			break;
		case "���":

			price = nCashGrade.get("���");
			nCheckout(price);
			break;
		case "���":

			price = nCashGrade.get("���");
			nCheckout(price);
			break;
		case "*":

			behind.joinU();
			break;
		default:
			System.out.println("=====================");
			System.out.println("�߸� �Է��Ͽ� �ٽ� ���� �������� ���ư��ϴ�");
			ticketing();

		}
	}

	/**
	 * ���� ȸ�� ����
	 */
	public  void redGrade() {
		System.out.println("=====================");
		System.out.println("=========����=========");
		redUCash();
		System.out.println("\n������ ���ɴ븦 ���ڷ� �Է����ּ���");
		System.out.print("���ɴ� �Է�: ");

		String age = scan.next();

		switch (age) {
		case "����":

			int price = rCashGrade.get("����");
			rCheckout(price);
			break;
		case "û�ҳ�":

			price = rCashGrade.get("û�ҳ�");
			rCheckout(price);
			break;
		case "���":

			price = rCashGrade.get("���");
			rCheckout(price);
			break;
		case "���":

			price = rCashGrade.get("���");
			rCheckout(price);
			break;
		default:
			System.out.println("=====================");
			System.out.println("�߸� �Է��Ͽ� �ٽ� ���� �������� ���ư��ϴ�");
			ticketing();

		}

	}

	/**
	 * ��ȸ�� ����â
	 */
	public  void nCheckout(int price) {

		System.out.printf("�����Ͻ� �ݾ��� %d�� �Դϴ�.\n", price);
		System.out.println("���� ����� �������ֽʽÿ�");
		System.out.println("1 : ����");
		System.out.println("2 : ī��");
		System.out.print("���� -> ");

		int payment = scan.nextInt();

		switch (payment) {
		case 1:

			paymentOnCash(price);
			break;
		case 2:

			paymentOnCard(price);
			break;
		default:

			System.out.println("������ ������ϴ�. \n�ٽ� �����մϴ�");
			behind.category();
			break;
		}
	}

	/**
	 * ���� ȸ�� ����â
	 */
	public  void rCheckout(int price) {

		System.out.printf("�����Ͻ� �ݾ��� %d�� �Դϴ�.\n", price);
		System.out.println("���� ����� �������ֽʽÿ�");
		System.out.println("1 : ����");
		System.out.println("2 : ī��");
		System.out.println("3 : ����Ʈ");
		System.out.print(" ���� -> ");

		int payment = scan.nextInt();

		switch (payment) {
		case 1:

			paymentOnCash(price);
			break;
		case 2:

			paymentOnCard(price);
			break;
		case 3:

			paymentOnPoint(price);
			break;

		default:

			System.out.println("������ ������ϴ�. \n �ٽ� �����մϴ�");
			behind.category();
			break;
		}
	}

	/**
	 * ���� �����ϱ�
	 */
	public  void paymentOnCash(int price) {

		System.out.println("=====================");
		System.out.printf("�����Ͻ� ������ �Է����ּ��� : ");

		cash = scan.nextInt();

		if (cash >= price) {

			System.out.println("=====================");
			System.out.printf("%d���� �����ϼ̽��ϴ�. �Ž������� %d�� �Դϴ�.\n", cash, cash - price);
			System.out.println("����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
		} else {

			System.out.println("=====================");
			System.out.printf("%d���� ���ڶ��ϴ� \n", price - cash);
			System.out.println("ó������ ���ư��ϴ�");

			behind.category();
		}

	}

	/**
	 * ����Ʈ �����ϱ�
	 */
	public  void paymentOnPoint(int price) {

		System.out.println("=====================");
		System.out.printf("���� �ݾ� : %d�� \n", price);
		System.out.printf("���� �����ϰ� ��� ����Ʈ : %d\n\n", point);

		System.out.printf("����Ͻ� ����Ʈ�� �Է����ּ��� : ");

		pcash = scan.nextInt(); // �Է���(������) ����Ʈ �ݾ�
		if (pcash > price) {
			System.out.println("=====================");
			System.out.println("����Ʈ�� �ʰ��ؼ� �����ϼ̽��ϴ�;) ");
			System.out.println("��üâ���� �ٽ� ���ư��ϴ�");
			ticketing();
		} else if (pcash == price) {

			System.out.println("=====================");
			System.out.printf("%d����Ʈ�� ����ϼ̽��ϴ�:) \n���� ����Ʈ�� %d�� �Դϴ�.\n", pcash, point - pcash);
			System.out.println("��ſ� ���� �ǽʽÿ�;) ");
		} else {

			System.out.println("=====================");
			System.out.printf("%d���� �������� �� �����ϼž� �մϴ� \n", pcash - price);
			System.out.print("\n���� ����â���� �̵��մϴ�");
			dcash = pcash - price;
			differencePayment(-dcash);
		}

	}

	/**
	 * ī�� ���
	 */
	public  void paymentOnCard(int price) {

		System.out.println("=====================");
		System.out.println("�������� �߱��Ͻðڳ���?(y/n)");
		System.out.printf("���� -> ");

		String isNeedRecipt = scan.next();

		switch (isNeedRecipt) {
		case "y":

			System.out.println("=====================");
			System.out.println("������ �߱��� �Ϸ�Ǿ����ϴ�;)");
			System.out.println("��ſ� ���� �ǽʽÿ�;)");
			break;
		case "n":

			System.out.println("=====================");
			System.out.println("����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
			System.out.println("��ſ� ���� �ǽʽÿ�;)");
			break;
		default:

			System.out.println("=====================");
			System.out.println("������ ������ϴ�. ���α׷��� �����մϴ�.");

			System.exit(0);
			break;
		}
	}

	/**
	 * ���� ���� �����ϱ�
	 */
	public  void differencePayment(int dcash) {

		System.out.printf("\n�����Ͻ� ������ �Է����ּ��� : ");

		int difference = scan.nextInt();
		// ����Ʈ�� ������ �Ա��ϰ� ��� �������� �ݾ� = �߰��� �Ա��� ���� - ����Ʈ ������ ������� ���� �ݾ�
		total = difference - dcash;

		if (difference < -total) {
			System.out.println("=====================");
			System.out.println("�ݾ��� �����Ͽ� ������ �����߽��ϴ�;) ");
			System.out.println("=====================");

			System.out.println("���ʵ� �ٽ� ó������ ���ư��ϴ�.");

			try {
				Thread.sleep(2000);
				behind.category();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (difference > -total) {
			System.out.printf("�Ž������� %d�� �Դϴ�",  difference - dcash);
			System.out.println("\n��ſ� �����ǽʽÿ�:) ");
		} else {

			System.out.println("=====================");
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
	}

}
