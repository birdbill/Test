package com.imooc.price.service;

import com.imooc.price.entity.CoursePrice;
import org.springframework.stereotype.Service;

/**
 * 课程价格服务类
 */
@Service
public interface CoursePriceService {
    CoursePrice getCoursePrice(Integer courseId);
}
