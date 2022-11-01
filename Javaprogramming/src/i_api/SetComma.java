package i_api;
import java.util.Scanner;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마를 붙여 출력해주세요
		// 1,234,567
		System.out.println("숫자 입력>");
		String num = ScanUtil.nextLine();
		String com = "";

		int count = 0;
		for (int i = num.length() - 1; i >= 0; i--) {
			com = num.charAt(i) + com;
			count++;
			if (count % 3 == 0 && count != num.length()) {
				com = "," + com;
			}
		}

		System.out.println(com);

	}
}
