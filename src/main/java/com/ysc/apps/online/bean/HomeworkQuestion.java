package com.ysc.apps.online.bean;

public class HomeworkQuestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column homework_question.id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column homework_question.question
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column homework_question.correct_answer
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    private String correctAnswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column homework_question.chapter_id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    private Long chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column homework_question.id
     *
     * @return the value of homework_question.id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column homework_question.id
     *
     * @param id the value for homework_question.id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column homework_question.question
     *
     * @return the value of homework_question.question
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column homework_question.question
     *
     * @param question the value for homework_question.question
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column homework_question.correct_answer
     *
     * @return the value of homework_question.correct_answer
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column homework_question.correct_answer
     *
     * @param correctAnswer the value for homework_question.correct_answer
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer == null ? null : correctAnswer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column homework_question.chapter_id
     *
     * @return the value of homework_question.chapter_id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column homework_question.chapter_id
     *
     * @param chapterId the value for homework_question.chapter_id
     *
     * @mbg.generated Tue Apr 30 19:34:09 CST 2019
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }
}