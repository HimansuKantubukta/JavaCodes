package com.lvg.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lvg.hibernate.dao.EmployeeDAO;
import com.lvg.hibernate.entity.Address;
import com.lvg.hibernate.entity.Employee;
import com.lvg.hibernate.entity.Person;
import com.lvg.hibernate.util.HibernateUtil;

public class App 
{
    public static void main(String[] args)
    {
        SessionFactory factory=HibernateUtil.buildSessionFactory();
        Session session =factory.openSession();
        Person p=session.get(Person.class,787);
       
        if(p!=null)
        {
        	System.out.println(p.getSsn()+" "+p.getPersonName()+"  "+p.getPersonAge()+"  "+p.getGender());
        	System.out.println(p.getAddress().getHouseNo()+"  "+p.getAddress().getStreetName());
        	System.out.println(p.getAddress().getCityName()+"  "+p.getAddress().getStateName());
         }
    Address a = session.get(Address.class,7001);
    if(a!=null)
    {
    	System.out.println(a.getHouseNo()+"  "+a.getStreetName());
    	System.out.println(a.getCityName()+" "+a.getStateName());
    	System.out.println(a.getPerson().getSsn()+"    "+a.getPerson().getPersonName());
    	System.out.println(a.getPerson().getPersonAge()+"  "+a.getPerson().getGender());
    	
    	
   
    	
        
        
    }
        session.close();
        HibernateUtil.shutdown();
        
        
    }
}



//if(e!=null)
//	System.out.println(e.getEmployeeName()+" "+e.getSalary()+" "+e.getDepartmentNo());
//else
//	System.out.println("Employee with id 102 does not exist");
//session.close();
//HibernateUtil.shutdown();





//if(e!=null)
//	e.setEmployeeName("Babu Raja");
//System.out.println("is Session Dirty "+session.isDirty());
//trans.commit();
//System.out.println("is Session Dirty "+session.isDirty());
//session.close();
//HibernateUtil.shutdown();



//SessionFactory factory=HibernateUtil.buildSessionFactory();
//Session session =factory.openSession();
//Transaction trans =session.beginTransaction();
//Employee e =new Employee();
//e.setEmployeeId(110);
//session.delete(e);
//trans.commit();
//session.close();
//HibernateUtil.shutdown();




//SessionFactory factory=HibernateUtil.buildSessionFactory();
//Session session =factory.openSession();
//Transaction trans =session.beginTransaction();
//Employee e =session.get(Employee.class,102);
//if(e!=null)
//	session.delete(e);
//else
//	System.out.println("Employee with id 102 does not exist");
//
//trans.commit();
//session.close();
//HibernateUtil.shutdown();










//public class App 
//{
//    public static void main(String[] args)
//    {
//        SessionFactory factory=HibernateUtil.buildSessionFactory();
//        Session session =factory.openSession();
//        Person p=session.get(Person.class,787);
//       
//        if(p!=null)
//        	System.out.println(p.getSsn()+" "+p.getPersonName()+"  "+p.getPersonAge()+"  "+p.getGender());
//        	System.out.println(p.getAddress().getHouseNo()+"  "+p.getAddress().getStreetName());
//        	System.out.println(p.getAddress().getCityName()+"  "+p.getAddress().getStateName());
//        
//        
//        
//        
//        
//        HibernateUtil.shutdown();
//        
//        
//    }
//}
//
