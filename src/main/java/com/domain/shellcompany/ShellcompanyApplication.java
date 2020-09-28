package com.domain.shellcompany;

import com.domain.shellcompany.models.Shell;
import com.domain.shellcompany.repositories.ShellRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShellcompanyApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ShellcompanyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner shellTest(ShellRepository shellRepository)
	{
		return (args) -> {
			shellRepository.save(
					new Shell(
							"test shell",
							42,
							"some manufacturer",
							"some model"));
			shellRepository.save(
					new Shell(
							"test shell1",
							84,
							"some manufacturer1",
							"some model1"));
			
			for (Shell s : shellRepository.findAll())
				System.out.println(s.toString());
			
			for (Shell s : shellRepository.findByName("test shell"))
				System.out.println(s.toString());
			
			Shell shell =
					shellRepository.findById(1L).isPresent() ? shellRepository.findById(1L).get() : null;
			try {
				System.out.println(shell.toString());
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
			
			shellRepository.deleteAll();
		};
	}
}
