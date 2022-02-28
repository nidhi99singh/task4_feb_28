/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import organisation.Depart;
import organisation.Employee;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String [] args){
        
    
        Configuration con=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction(); 
    
         Scanner sc=new Scanner(System.in);
         Depart d=new Depart();
       /*    
        //insert in department table
            Depart d1=new Depart();
            d1.setDId(1001);
            d1.setDName("IT");
            d1.setCity("Gurgram");
            Depart d2=new Depart();
            d2.setDId(1002);
            d2.setDName("HR");
            d2.setCity("Delhi");
            Depart d3=new Depart();
            d3.setDId(1003);
            d3.setDName("Admin");
            d3.setCity("Noida");
            session.save(d1);
            session.save(d2);
            session.save(d3);
            t.commit();
            System.out.println("data inserted into department table successful");
  
        //insert data into Employee table 
            Employee e1=new Employee();
            e1.setEId(503);
            e1.setFName("Shreya");
            e1.setLName("Verma");
            e1.setAge(35);
            e1.setSaalry(50000);
            e1.setCity("mumbai");
  
            d.setDId(1003);
            e1.setDepart(d);
            
            session.persist(e1);
            t.commit();
     
    // fetch data from depart
        
        d=(Depart)session.get(Depart.class,1002);
        System.out.println("department dat:"+d);
  
    //fetch data from employee
        
        Employee e=new Employee();
        System.out.println("enter e_id:");    
         int eid=sc.nextInt();
        e=(Employee)session.get(Employee.class,eid);
        t.commit();
        System.out.println("Employee details;"+e);
       */
       
        Employee e1=new Employee();
        System.out.println("Enter Employee details:");
         System.out.println("Enter Emp id:");
         int e_id=sc.nextInt();
         System.out.println("Enter first name:");
         String fname=sc.next();
         System.out.println("enter Last name:");
         String lname=sc.next();
         System.out.println("Enter age:");
         int age=sc.nextInt();
         System.out.println("Enter salary:");
         int sal=sc.nextInt();
         System.out.println("city:");
         String city=sc.next();
         System.out.println("D_id:");
         int dep_id=sc.nextInt();
        e1.setEId(e_id);
        e1.setFName(fname);
        e1.setLName(lname);
        e1.setAge(age);
        e1.setSaalry(sal);
        e1.setCity(city);
        d.setDId(dep_id);
        e1.setDepart(d);
        session.save(e1);
        t.commit();
        System.out.println("insertion successful");
        /*
        //delete data        
        Employee e=(Employee)session.get(Employee.class,503);
        session.delete(e);
        t.commit();
        System.out.println("Deleted successfully");
        
        //Update data in Employee table
        Employee e=(Employee)session.get(Employee.class,501);   
        e.setLName("Sharma");
        session.update(e);
        t.commit();
        System.out.println("Updated successfully");
    */
   session.close();
    }    
}