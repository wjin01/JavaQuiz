package quiz20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 상혁이가 입사한 회사에서, 매일 오전 아침 7시에 연계사(회사)에서
		 * 날짜유형의 CSV파일을 매일 전송을 해줍니다.
		 * 
		 * ex) 2024_06_04_data.csv
		 * 주의할 점은 내일이되면 2024_06_05data.csv 이 됩니다
		 * 
		 * 그래서 상혁이는 아침마다 csv파일을 열어서 우리의 데이터베이스에 저장하는
		 * 프로그램코드를 생성해야 합니다.
		 * 
		 * 1.Buffered를 사용해서 오늘날짜패턴_data.csv 파일을 읽어서 한 줄에 하나씩 출력을 하세요
		 * 2.읽은 데이터는 , 구분자로 만들어져 있는데 , 기준으로 데이터를 분리해서  
		 * 	 getter / setter를 가지는 Data 클래스에 저장하고, 이 객체를 리스트에 저장하면 됩니다.
		 * 
		 * 힌트)
		 * Date, Data객체는 생성, ArrayList 사용
		 * 
		 */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String now = sdf.format(date);
		System.out.println(now);
		
		String path = "C:\\Users\\user\\Desktop\\source\\java\\upload\\" + now + "_data.csv";
		
		
		BufferedReader br = null;
		
		Data<String, Integer, String, String> list = new Data<>();
		
		try {
			
			br = new BufferedReader(new FileReader(path));
			
			String str;
			
			while((str = br.readLine()) != null) {
//				System.out.println(str);
				
				String[] arr = str.split(",");
				list.setAll(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]);
				System.out.println(list.getName() +" "+ list.getAge() +" "+ list.getEm() +" "+ list.getRg());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
