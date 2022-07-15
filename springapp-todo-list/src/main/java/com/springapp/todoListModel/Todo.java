package com.springapp.todoListModel;

import java.util.Date;
import java.util.Objects;

public class Todo {
	
	public Todo()
	{
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
//		Todo other = (Todo) obj;
//		return Objects.equals(date, other.date) && Objects.equals(description, other.description) && id == other.id
//				&& Objects.equals(isFilled, other.isFilled) && Objects.equals(name, other.name);
		Todo other = (Todo) obj;
		if(id != other.id)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, description, id, isFilled, name);
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", isFilled="
				+ isFilled + "]";
	}
	public Todo(int id, String name, String description, Date date, String isFilled) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.isFilled = isFilled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIsFilled() {
		return isFilled;
	}
	public void setIsFilled(String isFilled) {
		this.isFilled = isFilled;
	}
	private int id;
	private String name;
	private String description;
	private Date date;
	private String isFilled;
	
}
