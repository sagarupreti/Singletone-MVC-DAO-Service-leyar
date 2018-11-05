/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6.dao;

import com.cibt.practice6.entity.Course;
import java.util.List;

/**
 *
 * @author ideapad-520S
 */
public interface CourseDAO {
    boolean insert(Course course);
    boolean delete(int id);
    boolean update(Course course);
    Course getById(int id);
    List<Course> getAll();
    List<Course> search(String name);
}
 