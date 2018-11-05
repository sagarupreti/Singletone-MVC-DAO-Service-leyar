/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6;

import com.cibt.practice6.dao.CourseDAO;
import com.cibt.practice6.entity.Course;
import java.util.Scanner;

/**
 *
 * @author ideapad-520S
 */
public class CourseController {

    private CourseDAO courseDAO;
    private Scanner input;

    public CourseController(CourseDAO courseDAO, Scanner input) {
        this.courseDAO = courseDAO;
        this.input = input;

    }

    public void menu() {
        System.out.println("1.Add Course");
        System.out.println("1.Search By Id");
        System.out.println("1. Show all");
        System.out.println("6. Exit");
        System.out.println("Enter your choice");
    }

    private void addview() {
        Course course = new Course();
        System.out.println("Enter Id");
        course.setId(input.nextInt());
        System.out.println("Enter Name:");
        course.setName(input.next());
        System.out.println("Enter Code:");
        course.setCode(input.next());
        System.out.println("Enter Status:");
        course.setStatus(input.nextBoolean());

        courseDAO.insert(course);
    }

    private void showAllView() {
        for (Course c : courseDAO.getAll()) {
            System.out.println(c);
        }
    }
    public void process(){
        while(true){
        menu();
            int choice=input.nextInt();
            switch(choice){
                case 1:
                     addview();
                    break;
                case 3:
                   showAllView();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            
    }
}
