package jp.co.ricoh.cotos.living.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jp.co.ricoh.cotos.living.security.WebSecurityConfig;

@SpringBootApplication
@Import(WebSecurityConfig.class)
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class);
	}
}
