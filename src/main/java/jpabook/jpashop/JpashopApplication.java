package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("Hello World");
		String data = hello.getData();
		System.out.println("data = " + data);
		Hello hello2 = new Hello();
		hello2.setData("안녕하세요");
		String data2 = hello2.getData();
		System.out.println("data2 = " + data2);
		SpringApplication.run(JpashopApplication.class, args);
	}

}
