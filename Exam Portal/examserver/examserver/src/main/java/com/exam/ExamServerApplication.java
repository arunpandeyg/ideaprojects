package com.exam;

import com.exam.entities.Role;
import com.exam.entities.User;
import com.exam.entities.UserRole;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {
	@Autowired
	private final UserService userService;

	public ExamServerApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Exam Server ..");


		/*User user = new User();
		user.setUserName("arun2023");
		user.setPassword("arun");
		user.setFirstName("Arun ");
		user.setLastName("Pandey");
		user.setEmail("arunpandeyom@gmail.com");
		user.setPhone("9810013821");
		user.setProfile("templates/me.jpg");
		Role role = new Role();
		role.setRoleId(121L);
		role.setRoleName("ADMIN");
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.printf(user1.getUserName());*/

	}
}
