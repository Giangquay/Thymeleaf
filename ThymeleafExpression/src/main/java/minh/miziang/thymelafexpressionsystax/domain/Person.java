package minh.miziang.thymelafexpressionsystax.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


public class Person {
	
	private Integer id;
	private String name;
	private Address adress;

	public Address getAdress() {
		return adress;
	}

	public Person(Integer id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	public Person() {
		super();
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}	
