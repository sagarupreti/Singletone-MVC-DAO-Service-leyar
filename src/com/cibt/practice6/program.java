/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6;

import com.cibt.practice6.dao.CourseDAO;
import com.cibt.practice6.dao.impl.CourseDAOChooser;
import com.cibt.practice6.dao.impl.CourseDAODBImpl;
import com.cibt.practice6.dao.impl.CourseDAOFactory;
import com.cibt.practice6.dao.impl.CourseDAOImpl;
import com.cibt.practice6.entity.Course;
import java.util.Scanner;
/**
 *
 * @author ideapad-520S
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new CourseController( 
             CourseDAOFactory.get(CourseDAOChooser.DB),
                    new Scanner(System.in))
                .process();
                
                
        
        
    }
       
      
}
    

 