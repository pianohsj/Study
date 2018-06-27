package com.springstudy.firstdemo.model;

public class Subject {

    private int id;
    private String name;
    private int professor_id;
    
    public Subject(int id, String name, int professor_id) {
        this.id = id;
        this.name = name;
        this.professor_id = professor_id;
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

	public int getProfessor_id() {
		return professor_id;
	}

	public void setProfessor_id(int professor_id) {
		this.professor_id = professor_id;
	}
    
}
