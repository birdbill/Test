package com.imooc.price.dao;


import com.imooc.price.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * 课程价格mapper类
 */
@Mapper
@Repository
public interface CoursePriceMapper {
    @Select("SELECT * FROM course_price WHERE course_id=#{courseId}")
    CoursePrice findCoursePrice(Integer courseId);
}
