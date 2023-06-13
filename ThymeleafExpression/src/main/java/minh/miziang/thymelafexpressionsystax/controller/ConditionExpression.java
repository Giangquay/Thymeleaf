package minh.miziang.thymelafexpressionsystax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import minh.miziang.thymelafexpressionsystax.domain.Address;
import minh.miziang.thymelafexpressionsystax.domain.Person;

@Controller
public class ConditionExpression {
	
	
	@GetMapping("/conditionExpression")
	public String conditionExpression(Model model)
	{
		Address addre = new Address();
		addre.setStreet("49 Viet Hung,Long Bien");
		addre.setZipCode("00101");
		Person person1 = new Person(1,"MGiang",addre);
		Person person2= new Person(2,"MGiang",null);
		model.addAttribute("person1",person1);
		model.addAttribute("person2",person2);
		model.addAttribute("gender", "M");
		return "conditionExpression";
	}
}
