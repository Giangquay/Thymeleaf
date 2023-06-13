package minh.miziang.thymelafexpressionsystax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import minh.miziang.thymelafexpressionsystax.domain.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping({"/them","/add"})
	public String getEmployee(@ModelAttribute("emp") Employee emp)
	{
		return "empForm";
	}
	
	@PostMapping("/addEmp")
	public String addEmplyee(@Valid @ModelAttribute("emp") Employee emp,
	BindingResult result,RedirectAttributes ra)
	{
		if(result.hasErrors())
		{
			return "empForm";
		}
		ra.addFlashAttribute("savedEmployee",emp);
		return "redirect:/detail";
	}
	
	@GetMapping("/detail")
	public String detail()
	{
		return "empDetail";
	}

}
