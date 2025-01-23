package com.example.webService;

import com.example.webService.entities.Student;
import com.example.webService.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public WebServiceApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	studentRepository.save(new Student("HICHAM", "GLIA"));
//		studentRepository.save(new Student("AMINA", "BOUJNAN"));

//    	studentRepository.findAll().forEach(et -> {
// 		System.out.println(et.toString());
// 	});

//		System.out.println(studentRepository.findById(1L));
//		}
// 		studentRepository.save(new Student(null, "AAAA", "BBBB"));
// 	studentRepository.deleteById(3L);
//			studentRepository.findByFIRST_NAME_STUDENT("HICHAM")
//		.forEach(et -> {
//			System.out.println(et.toString());
//		});

}}
