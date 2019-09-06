package com.example.form;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.example.form.JTemplate;


@Component(value="sDao")
public class StudentDao {
	@Autowired
	 JTemplate jdbcTemplate;
	
	
	public JTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public void setJdbcTemplate(JTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createStudent(Student student,String[] str) {
		String query = "insert into stud(fname,lname,email,country,language,windows,linux,unix) values(?,?,?,?,?,?,?,?)";
		Object obj[] = { student.getFname(),student.getLname(),student.getEmail(),student.getCountry(),student.getLanguage(),str[0],str[1],str[2] };
		//System.out.println(jdbcTemplate.toString());
		jdbcTemplate.update(query, obj);
		System.out.println("done");
	}
	
	public List<Map<String, Object>> getAllStudents()
	{
		String query="select * from stud";
       
       List<Map<String, Object>> students =  jdbcTemplate.queryForList(query);
//       if (students!=null && !students.isEmpty()) {
//           
//           for (Map<String, Object> student : students) {
//                
//               for (Iterator<Map.Entry<String, Object>> it = student.entrySet().iterator(); it.hasNext();) {
//                   Map.Entry<String, Object> entry = it.next();
//                   String key = entry.getKey();
//                   Object value = entry.getValue();
//                   System.out.println(key + " = " + value);
//               }                
//           }
//            
//       }
       return students;
	}
	public void deleteStudent(int id)
	{
		String query="delete from from stud where id="+id;
		jdbcTemplate.update(query);

	}
	
//	public List<Student> findAllStudents() {
//        return this.jdbcTemplate.query("select * from stud", 
//         new ResultSetExtractor<List<Student>>() {
//            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
//                List<Student> list = new ArrayList<Student>();  
//                while(rs.next()){
//                    Student emp = new Student();
//                    emp.setFname(rs.getString("fname"));
//                    emp.setLname(rs.getString("lname"));
//                    emp.setEmail(rs.getString("email"));
//                    emp.setCountry(rs.getString("country"));
//                    emp.setLanguage(rs.getString("language"));
//                    emp.setWindows(rs.getString("windows"));
//                    emp.setLinux(rs.getString("linux"));
//                    emp.setUnix(rs.getString("unix"));
//                    list.add(emp);
//                }
//                return list;
//            }  
//        });
//    }
}
