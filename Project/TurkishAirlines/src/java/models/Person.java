package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash Radadiya
 */
public abstract class Person {
 
    String name;
    String email;
    
    
    public Person(String f,String e)
    {
        name = f;
        email = e;
    }
}
