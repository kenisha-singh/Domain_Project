package com.lumen.model;
import java.util.ArrayList;
import java.util.List;

public class TodoDtls {
   private int id; 
   private String todo;
   private String status;
   private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTodo() {
	return todo;
}
public void setTodo(String todo) {
	this.todo = todo;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "TodoDtls [id=" + id + ", todo=" + todo + ", status=" + status + ", name=" + name + "]";
}
}
   
