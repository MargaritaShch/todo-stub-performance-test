package com.example.todostub;


public class Task {
    //поля задачи
    private Long id;
    private String title;
    private String description;
    private String status;

    //для использования ReauestBody для создания объекта json
    public Task(){}

    public Task(Long id, String title, String description , String status){
        this.id = id; //id задачи
        this.title = title; //заголовок задачи
        this.description = description; //описиание задачи
        this.status = status;//статус выполнения задачи
        
    }
    //геттер - поулчить занчение
    public Long getId(){
        return id;
    }
    //сеттер - записать занчение
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
