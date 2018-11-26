package com.usa.stores.model;


public class Store {
	private String name;
	private String description;
	private String type;
	
	
	public Store(){
		super();
	}
	
	public Store(String name, String description, String type) {
		this.name=name;
		this.description=description;
		this.type =type;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return new StringBuilder().append("Name :").append(name).append("Description :").append(description).append("Type :").append(type).toString();
	}
	
}
