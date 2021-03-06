package basic.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String error_msg, MemberVO memberVO) {
		super(error_msg);
		File f = new File("log.txt");
		
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write("아래와 같은 로그인 시도가 있었음\n");
			fw.write(memberVO.toString() + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
