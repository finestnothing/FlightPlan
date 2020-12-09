package edu.csc131.FlightPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class FlightPlanApplication {



	public static void main(String[] args) {
		SpringApplication.run(FlightPlanApplication.class, args);
	}

}
