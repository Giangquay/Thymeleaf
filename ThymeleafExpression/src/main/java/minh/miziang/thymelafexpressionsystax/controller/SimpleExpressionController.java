package minh.miziang.thymelafexpressionsystax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import minh.miziang.thymelafexpressionsystax.domain.Address;
import minh.miziang.thymelafexpressionsystax.domain.Person;

@Controller
public class SimpleExpressionController {
	
	@GetMapping("/simpleExpression")
	public String simpleExpression(Model model)
	{
		Address addre = new Address();
		addre.setStreet("49 Viet Hung,Long Bien");
		addre.setZipCode("00101");
		Person per = new Person();
		per.setId(1);
		per.setName("MGiang");
		per.setAdress(addre);
		model.addAttribute("person",per);
		return "simpleExpression";
	}
}
