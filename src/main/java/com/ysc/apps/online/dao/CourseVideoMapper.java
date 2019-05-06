package com.ysc.apps.online.dao;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.CourseVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseVideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    long countByExample(CourseVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int deleteByExample(CourseVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int insert(CourseVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int insertSelective(CourseVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    List<CourseVideo> selectByExample(CourseVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    CourseVideo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") CourseVideo record, @Param("example") CourseVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int updateByExample(@Param("record") CourseVideo record, @Param("example") CourseVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int updateByPrimaryKeySelective(CourseVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_video
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    int updateByPrimaryKey(CourseVideo record);
}