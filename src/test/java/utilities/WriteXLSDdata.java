package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXLSDdata {
	public static void main(String[] args) throws IOException {
		WriteData(2, 2);
		System.out.print("File Created");
	}

	public static void WriteData(int totalrow, int totalcell) throws IOException {
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("User");
		
		 List<String[]> StudentMap = ObjectList();
		 
		for (int rowid = 0;rowid<StudentMap.size();rowid++) {
			Row row = sheet.createRow(rowid);
			String[] Student = StudentMap.get(rowid);
				for(int cellid=0; cellid < Student.length ;cellid++)
				row.createCell(cellid).setCellValue((String) Student[cellid]);
			}
		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\Vimlesh.xlsx");
		workbook.write(fileOut);
		fileOut.close();
	}

	public static List<String[]> ObjectList() {
		List<String[]> studentData = new ArrayList<String[]>();

		studentData.add(new String[] { "Roll No", "NAME", "Year" });
		studentData.add(new String[] { "128", "Aditya", "2nd year" });
		studentData.add(new String[] { "129", "Narayana", "2nd year" });
		studentData.add(new String[] { "130", "Mohan", "2nd year" });
		studentData.add(new String[] { "131", "Radha", "2nd year" });
		studentData.add(new String[] { "132", "Gopal", "2nd year" });
		return studentData;
	}
}