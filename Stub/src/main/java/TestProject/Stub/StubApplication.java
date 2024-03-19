package TestProject.Stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StubApplication {

	public static void main(String[] args) {
		System.out.println("hi");
		SpringApplication.run(StubApplication.class, args);
	}

}
