/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6.dao.impl;

import com.cibt.practice6.dao.CourseDAO;

/**
 *
 * @author ideapad-520S
 */
public class CourseDAOFactory {
    public static CourseDAO get(String name){
      if(name.equals("list")){
        return new CourseDAOImpl();
      }else if(name.equals("db")){
          return new CourseDAODBImpl();
          
      }
      return null;
    }
}

      

    

    
     
