package project;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Behind {
	
	//��ĳ�� ����
	 Scanner scan = new Scanner(System.in);
	 
	 static Cash cash = new Cash();
	
	// id
	public String id;
	// password
	public String password;
	// point
	public int point;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ���� ī�װ�
	 */
	public void category() {
		System.out.println("=====================");
		System.out.println("******|�ڹٿ�ȭ��|******");
		System.out.println("1. ��ȭ�� ����");
		System.out.println("2. ���� �����ϱ�");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ȸ�� ����");

		System.out.print("\n��ȣ�� ���� ���ּ���:) :");

		try {
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				date();
				break;

			case 2:
				timeTable();
				break;

			case 3:
				notice();
				break;

			case 4:
				joinU();
				break;

			case 99:
				hidden();
				break;

			default:
				System.out.println("�������� �ʴ� ��ȣ�Դϴ� ;) ");
				category();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("�νĵ��� ���Ͽ� ����Ǿ����ϴ�;) ");

		}

	}

	/**
	 * 1. ��ȭ�� ����
	 */
	private void date() {
		System.out.println("=====================");
		System.out.println("��ȭ����" + "\n" + "11�� 12�Ϻ��� 13�ϱ��� ����˴ϴ�");
		System.out.println("\n \n");
		System.out.println("00. ���ư���");

		// ���� ó��
		try {
			int enter = scan.nextInt();
			if (enter == 00) {
				category();
			} else {
				System.out.println("����Ǿ����ϴ�. \\n�̿����ּż� �����մϴ� :) ");
				System.exit(0);
			}
		} catch (InputMismatchException e) {
			System.out.println("����Ǿ����ϴ�. \n�̿����ּż� �����մϴ� :) ");
		}
	}

	/*
	 * 2. ���� �����ϱ�
	 */
	public void timeTable() {

		System.out.println("=====================");
		System.out.println("[ ���� ]");
		System.out.println("11�� (12��/ 13��)\n\n");
		System.out.print("��¥�� �Է��ϼ���: ");

		String dday = scan.next();
		switch (dday) {
		case "12��":

			first();
			break;
		case "12":

			first();
			break;
		case "13��":

			second();
			break;
		case "13":

			second();
			break;
		default:

			System.out.println("�ƽ��Ե� �� ���� ������ �ƴմϴ�. ");
			System.exit(0);
			break;
		}

	}

	/**
	 * 2. ���� �����ϱ� -> ��ȭ ����
	 */
	 Map<Integer, String> first = new TreeMap<>();
	 Map<Integer, String> second = new TreeMap<>();

	/**
	 * 11�� 12�� �� ��ȭ
	 */
	public  void first() {

		first.put(1, "�ϰ� ���� ������");
		first.put(2, "������");
		first.put(3, "�ô�(saw)");
		first.put(4, "�ɾ� ����ȸ");

		System.out.println("=====================");
		System.out.println("======|11��12��|======");
		first.forEach((n, t) -> System.out.println(n + "�� " + t));
		System.out.print("\n\n���ϴ� ��ȭ ��ȣ�� �Է����ּ���=> ");

		// ���� �Է½� ����ó��
		try {
			int userNo = scan.nextInt();

			if (4 >= userNo) {
				cash.ticketing();
			} else {
				System.out.println("�ƽ��Ե� ��ü������ �غ����� ���� ��ȭ�Դϴ�.");
			}
		} catch (InputMismatchException e) {
			System.out.println();
		}
	}

	/**
	 * 11�� 13�� ��ȭ
	 */
	public  void second() {

		second.put(1, "���� �ϰ� ���� ����");
		second.put(2, "���ڸ�");
		second.put(3, "���Ҵ�(saw)");
		second.put(4, "�ɾ� �ɴ�ȸ");

		System.out.println("=====================");
		System.out.println("======|11��13��|======");
		second.forEach((n, t) -> System.out.println(n + "�� " + t));

		System.out.print("\n\n���ϴ� ��ȭ ��ȣ�� �Է����ּ���=> ");

		// ���� �Է½� ����ó��
		try {
			int userNo = scan.nextInt();

			if (4 >= userNo) {
				cash.ticketing();
			} else {
				System.out.println("�ƽ��Ե� ��ü������ �غ����� ���� ��ȭ�Դϴ�.");
			}
		} catch (InputMismatchException e) {
			System.out.println();
		}

	}

	/**
	 * 3. ���� ������
	 */
	private  void notice() {
		System.out.println("=====================");
		System.out.println("========<����>========");
		System.out.println("������ �������� ã�ƺ�����");

		System.out.println("\n \n");
		try {
			Thread.sleep(2000);
			System.out.println("��Ʈ�� ��ڽ��ϱ�?(y/n) ");
			String hint = scan.next();
			switch (hint) {
			case "y":
				System.out.println("���� �������� �Ʒ� ���ڸ� �Է����ּ���");
				System.out.println("\n����ȸ�� ��� ���� \n(������) 1000 \n(���ϱ�) \"_\"�� �ô� + \"_\"�� ���Ҵ�");
				System.out.println("\n \n");

				System.out.println("00. ���ư���");

				// ���� ó��
				try {
					int back = scan.nextInt();
					if (back == 00) {
						category();
					}
				} catch (InputMismatchException e) {
					System.out.println("�̿����ּż� �����մϴ� :) ");
				}
				break;
			case "n":
				System.out.println("00. ���ư���");

				// ���� ó��
				try {
					int back = scan.nextInt();
					if (back == 00) {
						category();
					}
				} catch (InputMismatchException e) {
					System.out.println("�̿����ּż� �����մϴ� :) ");
				}

				break;
			default:
				System.out.println("00. ���ư���");

				// ���� ó��
				try {
					int back = scan.nextInt();
					if (back == 00) {
						category();
					}
				} catch (InputMismatchException e) {
					System.out.println("�̿����ּż� �����մϴ� :) ");
				}

			}

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	/**
	 * ����ȸ�� �����ϱ�
	 */
	public  void joinU() {
		Behind behind = new Behind();
		
		System.out.println("=====================");
		System.out.println("���� ȸ�� ����â�Դϴ�");

		String id = input(1);
		@SuppressWarnings("unused")
		String password = input(2);

		System.out.printf("%s�� ȸ�� ���� �Ϸ�ƽ��ϴ� \n", id);

		/**
		 * ������ ��Ű��
		 */
		try {
			Thread.sleep(500);
			System.out.printf("*%s�� �ݰ����ϴ� ;) \n", id);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			Thread.sleep(1000);
			System.out.println("*50000����Ʈ�� ���� �Ǿ����ϴ�");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println();
		System.out.println("00, ��ȭ ���� ����ϱ�");
		System.out.println("11, ó������ ���ư���");

		try {
			int and = scan.nextInt();
			if (and == 00) {
				cash.redUCash();
			} else if (and == 11) {
				behind.category();
			}
		} catch (InputMismatchException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ� ó������ ���ư��ϴ�:) ");
			behind.category();
		}

	}

	private  String input(int join) {

		String result = null;

		switch (join) {
		case 1:
			while (true) {
				System.out.println("���ϴ� ���̵� �Է����ּ���");

				result = scan.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("���� ���� �����ּ���");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {

				System.out.println("���Ͻô� ��й�ȣ�� �Է����ּ���!");
				result = scan.nextLine();

				System.out.println("�ٽ� �ѹ� �� �Է����ּ���");
				String passwordCheck = scan.nextLine();

				if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
					System.out.println("��й�ȣ �Ǵ� ��й�ȣ Ȯ���� �����Դϴ�!");
				} else if (!result.equals(passwordCheck)) {
					System.out.println("��й�ȣ�� ��й�ȣ Ȯ���� ��ġ���� �ʽ��ϴ�!");
				} else {
					break;
				}
			}
			break;
		case 3:
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���!");
				result = scan.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("��й�ȣ�� �����Դϴ�!");
				} else {
					break;
				}
			}
			break;
		}

		return result;
	}
	

	/**
	 * 99. �̽��� ���� ������
	 */
	public  void hidden() {

		System.out.println("=====================");
		System.out.println("������ �������� �����ϼ̽��ϴ�");
		System.out.println("=====<�ε� �Ǹ�>======");
		System.out.println("[��ſ��� �������� ��ȭ �� ��ȸ�� �־������ϴ�]");

		System.out.println("\n \n");
		System.out.println("���� ��ȭ�� �Է����ּ���: ");
		String title = scan.next();

		System.out.printf("%s �½��ϱ�?(y/n)? ", title);

		String answer = scan.next();

		switch (answer) {
		case "y":
			System.out.println("=====================");
			peemang(title);

			break;
		case "n":
			System.out.println("=====================");
			System.out.println("�ٽ� �Է����ּ���");
			hidden();
			break;
		default:
			category();
		}

	}

	/**
	 * �̽��� ����-��ȭ ���
	 */
	private  void peemang(String title) {

		System.out.println("0������ 100������ �� �� �ֽ��ϴ�");
		System.out.println("��ȭ�� ���غ����� :) ");
		int score = scan.nextInt();
		String result;

		if (score < 101) {
			if (score >= 80) {
				result = "����";
			} else if (score > 10) {
				result = "�����";
			} else {
				result = "����";
			}

			System.out.println("�����մϴ� ��а���;)");
			System.out.println("����� �򰡿� �����Ͽ�");
			System.out.println("�α��α��α�");

			try {
				Thread.sleep(2000);
				System.out.printf("%s�� %s �Ǹ��Դϴ�:) ", title, result);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			System.out.println("�Ѱ�ġ�� �Ѿ����ϴ�..) ");
			System.out.println("�ٽ� ó������ ���ư��ϴ� ");
			category();
		}

	}


	/**
	 * 
	 */
	protected String grade;
	protected int price;
	protected int remainingStock;
	private String cashGrade;

	public void setCashGrade(String cashGrade) {
		this.cashGrade = cashGrade;
	};

	public String getCashGrade() {
		return this.cashGrade;
	};

	public String getGrade() {
		return this.grade;
	}

	public int getPrice() {
		return this.price;
	}

	public int getRemainingStock() {
		return this.remainingStock;
	}

	public void deductRemainingStock() {
		this.remainingStock--;

	}
}
