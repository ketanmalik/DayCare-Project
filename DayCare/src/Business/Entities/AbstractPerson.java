/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

/**
 *
 * @author ketanmalik
 */
public abstract class AbstractPerson {

    public int id;
    public String name;
    public int age;

    public abstract int getId();
    
    public abstract void setId();
    
    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getAge();

    public abstract void setAge(int age);
}
