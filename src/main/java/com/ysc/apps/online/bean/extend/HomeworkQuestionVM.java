package com.ysc.apps.online.bean.extend;

import java.util.List;

import com.ysc.apps.online.bean.CourseChapter;
import com.ysc.apps.online.bean.HomeworkAnswer;

public class HomeworkQuestionVM {
	
	private Long id;
	private String question;
	private String correctAnswer;
	private Long chapterId;
	
	private CourseChapter chapter;    //多对一
	private List<HomeworkAnswer> answer;    //一对多
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

<<<<<<< Updated upstream
	public Long getChapterId() {
		return chapterId;
=======

	public Long getChapter_id() {
		return chapter_id;
>>>>>>> Stashed changes
	}
	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}
	public CourseChapter getChapter() {
		return chapter;
	}
	public void setChapter(CourseChapter chapter) {
		this.chapter = chapter;
	}
	public List<HomeworkAnswer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<HomeworkAnswer> answer) {
		this.answer = answer;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	

}
