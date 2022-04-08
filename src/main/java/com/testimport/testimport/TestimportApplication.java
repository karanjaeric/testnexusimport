package com.testimport.testimport;

import com.example.nexustest.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestimportApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestimportApplication.class, args);
                TestController testController=new TestController();
               String response= testController.testurl();
               System.out.println("response is "+response);
	}
        

}
