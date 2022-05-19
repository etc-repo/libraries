package com.ptujavament;

import java.util.Scanner;

public class StartMenu {

	private int menuNum = 0, choiceNum = 0;
	private Reader connectUser;

	//메뉴 설정 넘버
	public void setNum(int num) {
		this.menuNum = num;
	}

	//선택 넘버
	public void setChoiceNum(int num) {
		this.choiceNum = num;
	}

	public int getNum() {
		return this.menuNum;
	}

	public int getChoiceNum() {
		return this.choiceNum;
	}

	public void init(Library library) {

		String[] titleArray = { "돈의 감각", "한번에 이해되는 아두이노", "안드로이드 앱 프로그래밍", "소프트웨어 공학", "딥러닝 정석", "프로그래머의 뇌" };
		String[] authorArray = { "김대영", "이아영", "장소영", "이미현", "정현수", "펠리너 헤르만스" };
		String[] publisherArray = { "한빛미디어", "생능", "이지스퍼블리싱", "길벗", "생능", "제이펍" };

		//Book(String title, String author, String publisher)
		for (int i = 0; i < 6; i++) {
			Book book = new Book(titleArray[i], authorArray[i], publisherArray[i]);
			library.registerBook(book);
		}

		/*//84번 라인에서 Reader로 한 명도 등록하지 않은 상태면 for문 접근 안함. 따라서 관리자 등록함
		Reader admin = new Reader("admin", "admin1234", "관리자", 22, "남자", "고양시", false);
		library.registerMember(admin);*/

	}

	public String scanString() {
		Scanner scanner = new Scanner(System.in);
		String scanString = scanner.nextLine();

		return scanString;
	}

	public int scanInt() {
		Scanner scanner = new Scanner(System.in);
		int scanint = scanner.nextInt();

		return scanint;
	}

	public void setConnectUser(Reader reader) {
		this.connectUser = reader;
	}

	public Reader getConnectUser() {
		return this.connectUser;
	}

	public boolean checkLogin(Library library) {

		boolean userExist = false;

		System.out.print("아이디: ");
		String loginID = scanString();

		System.out.print("비밀번호: ");
		String loginPW = scanString();

		for (Reader reader : library.getRisteredMember()) {
			if (loginID.equals(reader.getID()) && loginPW.equals(reader.getPW())) {
				System.out.println("Loign Success!");
				setConnectUser(reader);
				setNum(1);
				userExist = true;
			} else {
				System.out.println("도서관에 등록된 회원정보가 없습니다. 회원가입 하시길 바랍니다");
			}
		}
		System.out.println("11");

		return userExist;
	}

	public void registerUser(Library library) {

		System.out.print("아이디: ");
		String registID = scanString();

		System.out.print("비밀번호: ");
		String registPW = scanString();

		System.out.print("이름: ");
		String name = scanString();

		System.out.print("나이: ");
		int age = scanInt();

		System.out.print("성별: ");
		String gender = scanString();

		System.out.print("주소: ");
		String address = scanString();

		Reader user = new Reader(registID, registPW, name, age, gender, address, false);
		library.registerMember(user);

		//userInfo(library);

	}

	//유저 정보 비교
	public void userInfo(Library library) {

		int loginORregit = menu(3);

		switch (loginORregit) {
		//로그인
		case 1:
			boolean userExist = checkLogin(library);

			if (true) {
			}
			//로그인 실패 -> 다시 로그인 or 회원가입 선택 화면으로 redirect

			break;

		//회원가입
		case 2:
			registerUser(library);
			break;

		case 3:
			break;
		default:
			break;
		}

	}

	public int menu(int menuNumber) {
		System.out.println("\n" + "번호를 눌러 선택하세요");

		if (menuNumber == 0) {
			System.out.print("1.로그인/회원가입 2.사서 3.종료 ---> ");

		} else if (menuNumber == 1) {
			System.out.print("1.대출 2.반납 3.종료 ---> ");

		} else if (menuNumber == 2) {
			System.out.print("1.등록 2.해제 3.종료 ---> ");

		} else if (menuNumber == 3) {
			System.out.print("1.로그인 2.회원가입 3.종료 ---> ");
		}
		int choiceNum = scanInt();

		return choiceNum;
	}

	public void run() {
		Library library = new Library();
		init(library);
		while (true) {

			int menuNum = getNum();

			// 메뉴
			int choiceNum = menu(menuNum);
			System.out.println(choiceNum);

			switch (choiceNum) {
			case 1:
				//로그인 or 회원가입
				if (menuNum == 0) {
					userInfo(library);
					System.out.println("run() -> switch.case 1 -> if 안");
					break;
					//대출
				} else if (menuNum == 1) {
					System.out.print("대출할 책 제목을 쓰시오: ");
					String title = scanString();

					library.checkoutBook33(title, getConnectUser());

					/*for (Book book : library.getPresentBooks()) {
						if (title.equals(book.getTitle())) {
							library.checkoutBook(book, getConnectUser());
							System.out.println(book);
							getConnectUser().printReader();
						}
					
					}
					System.out.println("해당 책은 도서관에 등록되지 않았습니다");
					*/
					//등록
				} else if (menuNum == 2) {

				} else
					break;
				break;
			case 2:
				//사서
				if (menuNum == 0) {
					setNum(2);
					run();

					//반납
				} else if (menuNum == 1) {

					//해제
				} else if (menuNum == 2) {

				}

				break;
			case 3:
				break;
			default:
				break;
			}

		}
	}

}
