/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6.dao.impl;

import com.cibt.practice6.dao.CourseDAO;
import com.cibt.practice6.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ideapad-520S
 */
public class CourseDAOImpl implements CourseDAO {
    private List<Course> courseList=new ArrayList<>();
    

    @Override
    public boolean insert(Course course) {
     return courseList.add(course);
        
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public List<Course> search(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
