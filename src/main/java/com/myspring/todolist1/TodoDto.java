package com.myspring.todolist1;

public class TodoDto {

    private Long id;
    private String content;
    private Boolean done;

    public TodoDto(Long id, String content, Boolean done){
        this.id = id;
        this.content = content;
        this.done = done;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public Boolean getDone(){
        return done;
    }

    public void setDone(Boolean done){
        this.done = done;
    }
}