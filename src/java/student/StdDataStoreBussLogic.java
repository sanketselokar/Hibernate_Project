/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sanket
 */
public class StdDataStoreBussLogic 
{
    public void saveStudentDetails(int rno, String fname, String lname, String dob, String save)
    {
        Student student1 = new Student();
        if(save.equals("save"))
        {
            student1.setRollNo(rno);
            student1.setFname(fname);
            student1.setLname(lname);
            student1.setDob(dob);
        }
        else
        {
            student1.setRollNo(rno);
            student1.setFname(fname);
            student1.setLname(lname);
            student1.setDob(dob);
        }
        
        
        
//        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        
        SessionFactory  sf = con.buildSessionFactory(); 
        Session session =   sf.openSession();   
   
        session.beginTransaction();
        
        if(save.equals("save"))
        {
            session.save(student1);
        }
        else
        {
            session.update(student1);
        }
        
        session.getTransaction().commit();
        session.close();

    }
    
    public ArrayList<Student>  fetchStudentDetails()
    {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        
        SessionFactory  sf = con.buildSessionFactory(); 
        Session session =   sf.openSession(); 
        session.beginTransaction();
        
        Query q = session.createQuery("from Student");
        
        ArrayList<Student> students = (ArrayList<Student>) q.list();
        
//        for(Student s: students)
//        {
//            //System.out.println("Mahit");
//            System.out.println("Kayre: " + s);
//            
//        }
        System.out.println("Hello" + students);
        return students;
        
    }
    
    public void display(String fname)
    {
        System.out.println("Right hai:  " + fname);
    }
}
