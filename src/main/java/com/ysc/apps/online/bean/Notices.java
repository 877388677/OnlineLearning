package com.ysc.apps.online.bean;

public class Notices {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notices.id
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notices.noticeName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    private String noticename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notices.time
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notices.upName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    private String upname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notices.description
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notices.id
     *
     * @return the value of notices.id
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notices.id
     *
     * @param id the value for notices.id
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notices.noticeName
     *
     * @return the value of notices.noticeName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public String getNoticename() {
        return noticename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notices.noticeName
     *
     * @param noticename the value for notices.noticeName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public void setNoticename(String noticename) {
        this.noticename = noticename == null ? null : noticename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notices.time
     *
     * @return the value of notices.time
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notices.time
     *
     * @param time the value for notices.time
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notices.upName
     *
     * @return the value of notices.upName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public String getUpname() {
        return upname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notices.upName
     *
     * @param upname the value for notices.upName
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public void setUpname(String upname) {
        this.upname = upname == null ? null : upname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notices.description
     *
     * @return the value of notices.description
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notices.description
     *
     * @param description the value for notices.description
     *
     * @mbg.generated Sun Apr 28 20:57:34 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}