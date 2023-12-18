package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 

public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query(value = "From Student " )
	public List<Student> getAllStudentHql();
	
	@Query(value = "select *from student", nativeQuery = true)
	public List<Student> getAllStudentSql();
	
	@Query(value = "From Student where course=:str")
	public List<Student> getAllStudentByCourse(String str);
	
	@Query(value ="From Student where course=:cname and age=:age")
	public List<Student> getAllStudentByCourseAndAge(String cname, Integer age);
}
