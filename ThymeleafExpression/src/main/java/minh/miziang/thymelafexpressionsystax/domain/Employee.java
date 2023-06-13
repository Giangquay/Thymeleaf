package minh.miziang.thymelafexpressionsystax.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {
	
	@NotNull
	private Integer id;
	
	@NotBlank
	@Size(min = 2,max=18,message ="First Name must be between 2 and 18")
	private String firstName;
	private String lastName;
	
	@Valid
	private Address address;
}
