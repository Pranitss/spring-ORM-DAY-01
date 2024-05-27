import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.asterisc.in.pack.model.Employee;
import com.asterisc.in.pack.model.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		
		   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		     
		   EmployeeDao db=(EmployeeDao) context.getBean("d");
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.print("Enter Name : ");
		   String name=sc.nextLine();
		   System.out.print("Enter Salary : ");
		   double salary=Double.parseDouble(sc.nextLine());
		   
		   
		   Employee e=new Employee(name, salary);
		
		  // db.inserted(e);
		   db.inserted(e);
		   System.out.println("Data Inserted");
		   
		   
		   System.out.print("Enter eid : ");
		   int eid=Integer.parseInt(sc.nextLine());
		   
		   Employee e1=new Employee();
		   
		   e1.setEid(eid);
		   
		   db.delete(e1);
		   
		   System.out.println("Data Deleted");
	}

}
