package pack_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date();
		String str = date.toLocaleString();
		System.out.println("표준시 : " + date.toString() + " = " + date); // Row data
		System.out.println("한국 현재시간 : " +str);
		System.out.println("날짜만 표기 : " + str.substring(0,12));
		System.out.println("시간만 표기 : " + str.substring(13));
		
		LocalDateTime time = LocalDateTime.now();
		int year = time.getYear();
		int month = time.getMonthValue();
		int day = time.getDayOfMonth();
		System.out.print("LocalDateTime 사용 : " + year + "-" + month + "-" + day);
		
		System.out.println("\n-------------\n");
		
		// 형식 적용
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		System.out.println(form);
		
		
	}

}
