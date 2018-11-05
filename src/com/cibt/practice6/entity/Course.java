/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6.entity;

/**
 *
 * @author ideapad-520S
 */
public class Course {
    private int id;
    private String name;
    private String code;
    private boolean status;
    
    public Course(){
    }

    public Course(int id, String name, String code, boolean status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", code=" + code + ", status=" + status + '}';
    }
    
        public Course clone(){
            return new Course(id, name, code, status);
        }
    
}
