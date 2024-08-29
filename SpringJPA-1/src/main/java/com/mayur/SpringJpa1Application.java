package com.mayur;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.mayur.entity.User;
import com.mayur.repository.UserRepository;

@SpringBootApplication
public class SpringJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa1Application.class, args);
		UserRepository u=context.getBean(UserRepository.class);
		
//		List<User> user=u.getAllUsers();
		List<User> user=u.getAllUsersSQL();
		user.forEach(a->{
			System.out.println(a);
		});
		
//		List<User> findbyage=u.findByAge(30);
//		findbyage.forEach(user->{
//			System.out.println(user);
//		});
//		u.findByCountry("India");
//		User u1=new User(1,"Chikane","Male",120,"India");
//		User u2=new User(2,"Mayur","Male",85,"India");
//		User u3=new User(3,"Sakharam","Male",175,"USA");
//		u.saveAll(Arrays.asList(u1,u2,u3));
		
//		Optional<User> find= u.findById(1);
//		if(find.isPresent())
//		{
//			System.out.println(find.get());
//		}
		
//		Iterable<User> allById= u.findAllById(Arrays.asList(1,2,3));
//		allById.forEach(user->{
//			System.out.println(user);
//		});
		
//		Iterable<User> findall =u.findAll();
//		findall.forEach(user->{
//			System.out.println(user);
//		});
		
//		long i=u.count();
//		System.out.println("The records in table are"+i);
		
	}

}
