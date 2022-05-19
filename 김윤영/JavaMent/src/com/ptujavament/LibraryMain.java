package com.ptujavament;

/*
# 책 관리 시스템
- 도서관 비슷 (책 빌리기, 책 반납하기, 
책 등록하기, 책 비등록과정)
- 구조: 객체지향 중점 (함수랑 자료가 모인 객체들의 상호작용)
> 예. 도서관, 책, 저자, 독자
- 구현: 처음에만 같이, 나중에는 알아서

*/

public class LibraryMain {
	public static void main(String[] args) {

		//로그인은 지금 구현하기에는 시간 부족하니, 회원/사서로 선택할 수 있게 하기
		//회원은 대출과 반납을 할 수 있고, 사서는 책을 생성해서 등록 및 등록 해제를 할 수 있다. 

		StartMenu menu = new StartMenu();
		menu.run();

	}
}