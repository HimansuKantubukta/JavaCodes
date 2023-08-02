package com.hsu.jdbcDemo;

import java.util.Scanner;

import com.hsu.jdbcDemo.service.BookService;

public class App
{
	public static void main(String[] args)
	{
		BookService bookService=new BookService();
		Scanner sc=new Scanner(System.in);
		int opt=0;
		do
		{
			System.out.println("1. Add Book");
			System.out.println("2. Show All Books");
			System.out.println("3. Show Books By Category");
			System.out.println("4. Show Book By Title");
			System.out.println("5.Delete Book By Title");
			System.out.println("6.E X I T");
			System.out.println("Enter your option  : -");
			opt =sc.nextInt();
		
			switch(opt)
			{
			case 1:
				bookService.addBook();
				break;
			case 2:
				bookService.showAllBooks();
				break;
			case 3:
				bookService.showBookByCategory();
				break;
			case 4:
				bookService.showBookByTitle();
				break;
			case 5:
				bookService.deleteBookByTitle();
				break;
			case 6:
				System.out.println("you are quitting menu");
				break;
			default:
				System.out.println("not a correct option");
			}
			
			}while(opt!=6);
		}
		
	}

			
	

		
	













//access the particular element present  and update it



//try
//{
//	con= DriverManager.getConnection(url, "root", "Ravindra@123");
//
//    pst = con.prepareStatement("select * from employee where empid=?");
//    
//    pst.setInt(1, 102);
//    
//    rs = pst.executeQuery();
//
//   if(rs.next())
//
//        System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
//	    
//   
//   pst.setInt(1, 104);
//   
//   rs = pst.executeQuery();
//
//  if(rs.next())
//
//       System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
//	    
//}
//catch(SQLException ex)
//{
//	ex.printStackTrace();
//}
//finally
//{
//	try
//	{
//		if(rs!=null) rs.close();
//		if(pst!=null) pst.close();
//		if(con!=null) con.close();
//	}
//	catch(SQLException ex)
//    {
//    	ex.printStackTrace();
//    }
//}
//
//
//}
//}

    	
    	
    	
    	
    	// counting columns
    	
    	
//public static void main( String[] args )
//{
//	Connection con=null;
//	PreparedStatement pst=null;
//	ResultSet rs=null;
//	ResultSetMetaData rsmd=null;
//	//Class.forName("com.mysql.cj.jdbc.Driver");
//
//    String url="jdbc:mysql://localhost:3306/prolifics";
//    try
//    {
//    	con= DriverManager.getConnection(url, "root", "Ravindra@123");
//
//        pst = con.prepareStatement("select * from employee ");
//        
//        rs = pst.executeQuery();
//        
//        rsmd=rs.getMetaData();
//        
//        
//        int count=rsmd.getColumnCount();
//        for(int i=1;i<=count;i++)
//        	System.out.print(rsmd.getColumnName(i)+"   ");
//        System.out.println();
//       while(rs.next())
//       {
//    	   for(int i=1;i<=count;i++)
//    		   System.out.print(rs.getString(i)+"   ");
//    	   System.out.println();
//       }
//
//           
//    	    
//       
//       
//   	    
//    }
//    catch(SQLException ex)
//    {
//    	ex.printStackTrace();
//    }
//    finally
//    {
//    	try
//    	{
//    		if(rs!=null) rs.close();
//    		if(pst!=null) pst.close();
//    		if(con!=null) con.close();
//    	}
//    	catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//    }
//
//    
//}
//}
  	
//    	
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//inserting the rows in a database  	
    	
    	
    	
    	
//public static void main( String[] args )
//{
//	Connection con=null;
//	PreparedStatement pst=null;
//	ResultSet rs=null;
//    String url="jdbc:mysql://localhost:3306/prolifics";
//    try
//    {
//    	con= DriverManager.getConnection(url, "root", "Ravindra@123");
//
//        pst = con.prepareStatement("insert into employee values(?,?,?,?) ");
//        
//        pst.setInt(1, 106);
//        pst.setString(2, "Mahesh");
//        pst.setDouble(3, 6000.87);
//        pst.setInt(4, 40);
//        
//        
//        int count=pst.executeUpdate();
//        
//       	System.out.print(count+"Rows inserted");
//        
//        	
//        	
//        	pst.setInt(1, 107);
//            pst.setString(2, "Ramesh");
//            pst.setDouble(3, 7000.57);
//            pst.setInt(4, 50);
//            
//            
//           count=pst.executeUpdate();
//           
//            
//            	System.out.print(count+"Rows inserted");
//            	
//   
//   	    
//    }
//    catch(SQLException ex)
//    {
//    	ex.printStackTrace();
//    }
//    finally
//    {
//    	try
//    	{
//    		if(rs!=null) rs.close();
//    		if(pst!=null) pst.close();
//    		if(con!=null) con.close();
//    	}
//    	catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//    }
//
//    
//}
//}




//connecting java app to database first prog..


//public static void main( String[] args )
//{
//	String url="jdbc:mysql://localhost:3306/prolifics";
//	try(Connection con= DriverManager.getConnection(url, "root", "Ravindra@123");
//	    PreparedStatement pst = con.prepareStatement("select * from employee");
//        ResultSet rs = pst.executeQuery())
//			{
//	
//	            while(rs.next())
//	
//	                System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
//	        	    
//	        }
//	        catch(SQLException ex)
//	        {
//	        	ex.printStackTrace();
//	        }
//}
//}




// connecting java app to database simplest way



//package com.hsu.jdbcDemo;
//
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Connection con=null;
//    	PreparedStatement pst=null;
//    	ResultSet rs=null;
//    	//Class.forName("com.mysql.cj.jdbc.Driver");
//
//        String url="jdbc:mysql://localhost:3306/prolifics";
//        try
//        {
//        	con= DriverManager.getConnection(url, "root", "Ravindra@123");
//
//            pst = con.prepareStatement("select * from employee");
//
//            rs = pst.executeQuery();
//
//            while(rs.next())
//
//                System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
//        	    
//        }
//        catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//        finally
//        {
//        	try
//        	{
//        		if(rs!=null) rs.close();
//        		if(pst!=null) pst.close();
//        		if(con!=null) con.close();
//        	}
//        	catch(SQLException ex)
//            {
//            	ex.printStackTrace();
//            }
//        }
//
//        
//    }
//}



//inserting and deleting in one prog...




//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Connection con=null;
//    	PreparedStatement pst=null;
//    	PreparedStatement pst2=null;
//        String url="jdbc:mysql://localhost:3306/prolifics";
//        try
//        {
//        	con= DriverManager.getConnection(url, "root", "Ravindra@123");
//        	con.setAutoCommit(false);
//            pst = con.prepareStatement("delete from employee");
//            int count=pst.executeUpdate();
//            con.commit();
//          	System.out.print(count+ "deleted rows");
//            pst2=con.prepareStatement("insert into department values(?,?,?)");
//            pst2.setInt(1, 50);
//            pst2.setString(2, "Finance");
//            pst2.setString(3, "Mumbai");
//            count=pst.executeUpdate();
//            System.out.print(count+ "rows inserted");
//            con.rollback();
//        	    
//           
//           
//       	    
//        }
//        catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//        finally
//        {
//        	try
//        	{
//        		
//        		if(pst!=null) pst.close();
//        		if(con!=null) con.close();
//        	}
//        	catch(SQLException ex)
//            {
//            	ex.printStackTrace();
//            }
//        }
//
//        
//    }
//}
//
//    




















//Scrollable



//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Connection con=null;
//    	PreparedStatement pst=null;
//    	ResultSet rs=null;
//        String url="jdbc:mysql://localhost:3306/prolifics";
//        try
//        {
//           con= DriverManager.getConnection(url, "root", "Ravindra@123");
//        	
//           pst = con.prepareStatement("select * from department",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);;
//            rs=pst.executeQuery();
//            while(rs.next())
//            	System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3));
//            System.out.println("----------------------------------------");
//        	    
//            while(rs.previous())
//            	System.out.println(rs.getString(1)+"   "+rs.getString(2)+"  "+rs.getString(3));
//            
//        	    
//           
//       	    
//        }
//        catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//        finally
//        {
//        	try
//        	{
//        		
//        		if(pst!=null) pst.close();
//        		if(con!=null) con.close();
//        	}
//        	catch(SQLException ex)
//            {
//            	ex.printStackTrace();
//            }
//        }
//
//        
//    }
//}

















//updatable



//public static void main( String[] args )
//{
//	Connection con=null;
//	PreparedStatement pst=null;
//	ResultSet rs=null;
//    String url="jdbc:mysql://localhost:3306/prolifics";
//    try
//    {
//       con= DriverManager.getConnection(url, "root", "Ravindra@123");
//    	
//        pst = con.prepareStatement("select deptno,deptname,location  from department",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//        rs=pst.executeQuery();
//        rs.moveToInsertRow();
//        rs.updateInt(1,60);
//        rs.updateString(2, "developer");
//        rs.updateString(3,"pune");
//        rs.insertRow();
////        if(rs.rowInserted())
////        {
////        	System.out.println("1 row is inserted");
////        	
////        }
//    	    
//       
//   	    
//    }
//    catch(SQLException ex)
//    {
//    	ex.printStackTrace();
//    }
//    finally
//    {
//    	try
//    	{
//    		
//    		if(pst!=null) pst.close();
//    		if(con!=null) con.close();
//    	}
//    	catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//    }
//
//    
//}
//}




//delete a row 



//public static void main( String[] args )
//{
//	Connection con=null;
//	PreparedStatement pst=null;
//	ResultSet rs=null;
//    String url="jdbc:mysql://localhost:3306/prolifics";
//    try
//    {
//        con= DriverManager.getConnection(url, "root", "Ravindra@123");
//    	
//        pst = con.prepareStatement("select deptno,deptname,location  from department",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//        rs=pst.executeQuery();
//        rs.absolute(6);
//        rs.deleteRow();
//       
//    	    
//       
//   	    
//    }
//    catch(SQLException ex)
//    {
//    	ex.printStackTrace();
//    }
//    finally
//    {
//    	try
//    	{
//    		
//    		if(pst!=null) pst.close();
//    		if(con!=null) con.close();
//    	}
//    	catch(SQLException ex)
//        {
//        	ex.printStackTrace();
//        }
//    }
//
//    
//}
//}







