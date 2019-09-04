import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.fsd.SEP_04_HB_BiD.Factory.Factory;
import com.ibm.fsd.SEP_04_HB_BiD.entity.Student;
import com.ibm.fsd.SEP_04_HB_BiD.entity.StudentDetail;

public class Main {
	
	public static void main(String[] args) {
		SessionFactory factory = Factory.getSessionFactory();
		Session s = factory.openSession();

		
		Student st =new Student("Raghav", "neer@gg.com", "A+");
		StudentDetail sd = new StudentDetail("IBM","Root");
		st.setStudentDetail(sd);
		s.getTransaction().begin();
     int a = (int) s.save(st);
     if(a>0)
    	 System.out.println("Inserted one row!");
	
	StudentDetail del = s.get(StudentDetail.class, 2);
//	s.delete(del);
//	s.getTransaction().commit();
	System.out.println("deleted!");
	
	StudentDetail get = s.get(StudentDetail.class, 6);
	Student gets = get.getStudent();
	System.out.println(get+"\n"+gets);
	

	   
	}

}
