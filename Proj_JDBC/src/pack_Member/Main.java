package pack_Member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String txt = "원하는 번호를 선택한 후 입력해주세요.(번호만 입력 후 엔터)";
		
		Scanner scanner = new Scanner(System.in);

		String uid = null;
		String upw = null;
		String uName = null;
		String uAddr = null;
		
		
		while (true) {
			System.out.println(txt);
			System.out.println("1. 로그인 2. 회원가입 3. 전체 회원목록");
			System.out.print("번호 선택 : ");
			int code = scanner.nextInt();
			
			// 유효성검사
			switch (code) {
			case 1: 
				System.out.print("아이디를 입력해주세요.");
				uid = scanner.next();
				System.out.print("비밀번호를 입력해주세요");
				upw = scanner.next();
				
				Login login = new Login(uid, upw);
				login.mtd_Login();
								
				// 커스텀 클래스로 전달
				break;
				
			case 2:
				
				System.out.println("[회원가입]");
				System.out.print("아이디를 입력해주세요.");
				uid = scanner.next();
				System.out.print("비밀번호를 입력해주세요");
				upw = scanner.next();
				System.out.print("이름을 입력해주세요");
				uName = scanner.next();
				System.out.print("주소를 입력해주세요.");
				uAddr = scanner.next();
				
				Join join = new Join(uid,upw, uName, uAddr);
				join.mtd_Join();
				
				break;
				
			case 3:
				
				MemberList memberList = new MemberList();
				memberList.mtd_List();
				break;
			
		default:
			System.out.println("번호를 정확하게 입력해주세요.\n");
			break;
		}

			if(code == 1 || code == 2 || code == 3) break; 
						
		}
		
		scanner.close();
		
	}

}
