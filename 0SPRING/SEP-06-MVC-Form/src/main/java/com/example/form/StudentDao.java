package com.example.form;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public void getStudent(int id)
	{
		String query="select * from student";
       
       List<Map<String, Object>> students =  jdbcTemplate.queryForList(query);
       if (students!=null && !students.isEmpty()) {
           
           for (Map<String, Object> student : students) {
                
               for (Iterator<Map.Entry<String, Object>> it = student.entrySet().iterator(); it.hasNext();) {
                   Map.Entry<String, Object> entry = it.next();
                   String key = entry.getKey();
                   Object value = entry.getValue();
                   System.out.println(key + " = " + value);
               }
                
               System.out.println();
                
           }
            
       }
		System.out.println("done");
	}
}
