package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;

@SpringBootApplication
public class BootjpademoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpademoApplication.class, args);
		UserRepo userRepository  =  context.getBean(UserRepo.class);
		/* -------------------save muliple user in dadabase---------------------------- */
		/*
		 * User obj1 = new User(); obj1.setName("sudhir"); obj1.setCity("cuttack");
		 * obj1.setStatus("java Developer"); User obj2 = new User();
		 * obj2.setName("sonu"); obj2.setCity("jajpur");
		 * obj2.setStatus("Python Developer");
		 * 
		 * List<User> users= List.of(obj1,obj2); Iterable<User>result
		 * =userRepository.saveAll(users); result.forEach(user->{
		 * System.out.println(user); });
		 */
		/*-----------------update the database-------------------*/
		/*
		 * Optional<User> optional=userRepository.findById(6); User user=optional.get();
		 * user.setName("akash"); User result = userRepository.save(user);
		 * System.out.println(result); ------------------delete all
		 * user-----------------------
		 */
		Iterable<User> alluser =userRepository.findAll();
		alluser.forEach(user->{
			System.out.println("delete  "+user);
			userRepository.deleteAll(alluser);
		});
	    
		
		
		
		
	}

}
