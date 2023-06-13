package minh.miziang.thymelafexpressionsystax.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@NotBlank
	@Size(min = 2,max=18,message ="First Name must be between 2 and 18")
	private String street;
	
	@Size(min = 2,max = 2, message="State only allows 2 characters")
	private String state;
	private String zipCode;
	
	


	
}
