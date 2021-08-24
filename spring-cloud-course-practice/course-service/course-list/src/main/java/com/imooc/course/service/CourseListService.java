package com.imooc.course.service;

import com.imooc.course.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程服务类
 */
@Service
public interface CourseListService {
    List<Course> getCourseList();
}
