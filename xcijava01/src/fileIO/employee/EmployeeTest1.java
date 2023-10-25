package fileIO.employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest1 {
	public static void main(String[] args) {
		
		Employee emp = new Employee(100, "황수연", 10000000, "개발부");
		
		try(FileOutputStream fos = new FileOutputStream("src/fileIO/employee/employee.txt");
			ObjectOutputStream	oos = new ObjectOutputStream(fos)){
			oos.writeObject(emp);
			System.out.println("파일 작성 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
