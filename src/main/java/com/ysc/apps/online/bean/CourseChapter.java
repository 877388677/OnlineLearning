package com.ysc.apps.online.bean;

public class CourseChapter {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.chapter
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private String chapter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.name
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.description
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.document
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private String document;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_chapter.course_id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    private Long courseId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.id
     *
     * @return the value of course_chapter.id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.id
     *
     * @param id the value for course_chapter.id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.chapter
     *
     * @return the value of course_chapter.chapter
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.chapter
     *
     * @param chapter the value for course_chapter.chapter
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.name
     *
     * @return the value of course_chapter.name
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.name
     *
     * @param name the value for course_chapter.name
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.description
     *
     * @return the value of course_chapter.description
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.description
     *
     * @param description the value for course_chapter.description
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.document
     *
     * @return the value of course_chapter.document
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public String getDocument() {
        return document;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.document
     *
     * @param document the value for course_chapter.document
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setDocument(String document) {
        this.document = document == null ? null : document.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_chapter.course_id
     *
     * @return the value of course_chapter.course_id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_chapter.course_id
     *
     * @param courseId the value for course_chapter.course_id
     *
     * @mbg.generated Fri May 03 09:37:56 CST 2019
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}