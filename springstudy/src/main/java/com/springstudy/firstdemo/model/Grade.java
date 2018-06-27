package com.springstudy.firstdemo.model;

public class Grade {

    private String score;
    private int student_id;
    private int subject_id;

    public Grade(String score, int student_id, int subject_id) {
        this.score = score;
        this.student_id = student_id;
        this.subject_id = subject_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

}
