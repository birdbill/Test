package com.imooc.price.controller;



import com.imooc.price.entity.CoursePrice;
import com.imooc.price.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *  课程价格controller
 */
@RestController
public class CoursePriceController {

    @Autowired
    CoursePriceService coursePriceService;
    @GetMapping("/price")
    public Integer coursesList(Integer courseId){
       CoursePrice coursePrice=coursePriceService.getCoursePrice(courseId);
       return coursePrice.getPrice();
    }
}
