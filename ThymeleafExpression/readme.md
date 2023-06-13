
## Send data to view .html

1. Variable Expression <br>
`model.addAttribute("person",per);`
`th:text="${person.id}`
2. Selection Variable <br>

 	**`th:object="${person}`**
 	
	`th:text="*{id}"`
	`th:text="*{name}"`
	
	`th:text="*{adress.street}"`
	`th:text="*{adress.zipCode}"`
	
3. Message Expression <br>
	*.properties`channel.name=Minh Ziang`
		`channel.desc=Thymeleaf Standard Expression Systax`
		<br>
		
	`<h2>Message Expression</h2>`<br>
	`<p th:text="#{channel.name}"></p>`<br>
	`<p th:text="#{channel.desc}"></p>`<br>
	
4. Thymeleaf forEach <br>

	`th:each="ds,prod : ${dulieu_truyen}"`
	`${ds.field} trong class`
	`prod.index,prod.count,prod.size,...`
5. Validate <br>
	
	@NotNull
	private Integer id;
	@NotBlank
	@Size(min = 2,max=18,message ="First Name must be between 2 and 18")
	private String firstName; 
	
`<span th:if="${#fields.hasErrors('id')}" th:errors="*{id}" th:errorclass="error"></span>`