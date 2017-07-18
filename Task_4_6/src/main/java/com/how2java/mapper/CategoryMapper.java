package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.pojo.Student;

import java.util.List;

public interface CategoryMapper {
    int add(Category category);
    List<Category> getAll();
    List<Category> list();
    List<Student> getPp();

}