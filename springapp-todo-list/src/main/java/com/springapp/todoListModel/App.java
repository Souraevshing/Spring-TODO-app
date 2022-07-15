package com.springapp.todoListModel;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class App {

	public static List<Todo> todos = new ArrayList<>();
	private static int count = 3;
	
	static {
		todos.add(new Todo(1,"admin","Learn MERN Stack",new Date(),"YES"));
		todos.add(new Todo(2,"admin","Learn Spring Boot",new Date(),"NO"));
		todos.add(new Todo(3,"admin","PUBG",new Date(),"NO"));
	}
	
	public List<Todo>getTodos(String name)
	{
		List<Todo>newTodos = new ArrayList<Todo>();
		for(Todo todo : todos) {
			if(todo.getName().equals(name))
				newTodos.add(todo);
		}
		return newTodos;
	}
	
	public void updateTodo(Todo todo)
	{
		todos.remove(todo);
		todos.add(todo);
	}
	
	public Todo retrieveSingleTodo(int id)
	{
		//List<Todo>newTodos = new ArrayList<Todo>();
		for(Todo todo : todos) {
			if(todo.getId()==id)
				return todo;
		}
		return null;
	}
	
	public void addTodo(String name,String desc,Date date,String isFilled)
	{
		todos.add(new Todo(++count,name,desc,date,isFilled));
	}
	
	public void deleteTodo(int id)
	{
		Iterator<Todo>iterator = todos.iterator();
		while(iterator.hasNext())
		{
			Todo todo = iterator.next();
			if(todo.getId()==id)
				iterator.remove();
		}
	}
	
}
