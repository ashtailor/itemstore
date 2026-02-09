package com.project.modal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

public class Items 
{
	Integer id;
	@NotBlank(message = "Item name is required")
	String name;
	
	@NotBlank(message = "Descrption is required")
	String description;
	
	@NotNull(message = "Price is required")
	@Min(value = 1, message = "Price must be greater than 0")
	Integer price;
	
	@NotBlank(message = "Category is required")
	String category;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category=" + category + "]";
	}
	public Items(Integer id, String name, String description, Integer price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
