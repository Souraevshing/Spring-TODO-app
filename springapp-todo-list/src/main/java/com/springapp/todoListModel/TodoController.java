package com.springapp.todoListModel;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	App app;
	
	@RequestMapping(value="/todos", method=RequestMethod.GET)
	public String showTodos(ModelMap model)
	{
		String name = (String) model.get("name");
		model.put("todo", app.getTodos(name));
		return "todos";
	}
	
	@RequestMapping(value="/addtodo", method=RequestMethod.GET)
	public String showAddTodos(ModelMap model)
	{
		//model.addAttribute("Test",new Todo(0,(String)model.get("name"),"desc",new Date(),"YES"));
		return "addtodo";
	}
	
	@RequestMapping(value="/todo/delete", method=RequestMethod.GET)
	public String deleteTodos(@RequestParam int id)
	{
		app.deleteTodo(id);
		return "redirect:/todos";
	}
	
	@RequestMapping(value="/todo/update", method=RequestMethod.GET)
	public String showUpdatedTodos(@RequestParam int id, ModelMap model)
	{
		Todo todo = app.retrieveSingleTodo(id);
		model.put("todo", todo);
		return "addtodo";
	}
	
	@RequestMapping(value="/todo/update", method=RequestMethod.POST)
	public String updateTodos(@Validated Todo todo, BindingResult result, ModelMap model)
	{
		todo.setName((String)model.get("name"));
		
		if(result.hasErrors())
			return "addtodo";
		app.updateTodo(todo);
		return "redirect:/todos";
	}
	
	@RequestMapping(value="/addtodo", method=RequestMethod.POST)
	public String addTodos(ModelMap model, @RequestParam String desc, @Validated Todo todo, BindingResult result)
	{
		if(result.hasErrors())
			return "addtodo";
		app.addTodo((String)model.get("name"),desc,new Date(),"YES");
		return "redirect:/todos";
	}
	
}
