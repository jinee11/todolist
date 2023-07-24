package com.myspring.todolist1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }


    @RequestMapping("/todo")
    public String todo(Model model){
        List<TodoDto> todoDtoList = this.todoService.readAll();
        model.addAttribute("todoList", todoDtoList);
        return "todo";
        
    }

    @RequestMapping("/")
    public String home(){
        return "redirect:/todo";
    }

    @RequestMapping("/todo/create") //생성
    public String create(@RequestParam("todo-desc") String content){
        todoService.createToDo(content);
        return "redirect:/todo";
    }

    @RequestMapping("/todo/{id}/update") //수정
    public String update(@PathVariable("id") Long id){
        todoService.updateTodo(id);
        return "redirect:/todo";
    }

    @RequestMapping("/todo/{id}/delete") //삭제
    public String delete(@PathVariable("id") Long id){
        todoService.deleteToDo(id);
        return "redirect:/todo";
    }
}
