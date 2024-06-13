package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileQuiz02 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1.빠른 입력을 통해서 사용자로부터 입력을 받습니다
		 * 2.사용자가 "그만"을 입력할 때까지 입력 받아주면 됩니다
		 * 
		 * 3.입력받을 내용을 BufferedWriter를 이용해서 파일을 쓰세요 (파일명은 자유)
		 * 4.단, 사용자가 엔터를 칠때마다 데이터는 써져야합니다
		 */
		String path = "C:\\Users\\user\\Desktop\\source\\java\\upload\\hello5.txt";
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw =  new BufferedWriter(new FileWriter(path));;
		
		try {
			while(true) {
				System.out.print("입력 : ");
				String str = br.readLine();
				
				if(str.equals("그만")) {
					break;
				}
				bw.write(str + "\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
			bw.close();
		}
		
		
	}
}
