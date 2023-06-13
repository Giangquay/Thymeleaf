package minh.miziang.thymelafexpressionsystax.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import minh.miziang.thymelafexpressionsystax.domain.Address;
import minh.miziang.thymelafexpressionsystax.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IterationExpression {
	
	@GetMapping("/iterationExpression")
	public String interationExpression(Model model)
	{
		Address addr= new Address(null, null, null);
		List<Person> list = Arrays.asList(
		new Person(11,"Mgiang",new Address("LongBien","01", "004")),
		new Person(22,"DChien",new Address("Thanh Tri","01","004")),
		new Person(33,"NCo",new Address("Hai Ba Trung","01","003")),
		new Person(44,"TDat",new Address("Ba Dinh","01","002")));
		model.addAttribute("people",list);
		return "iterationExpression";
	}
}
