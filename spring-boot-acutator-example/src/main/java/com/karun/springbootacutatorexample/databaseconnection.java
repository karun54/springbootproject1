package com.karun.springbootacutatorexample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.karun.springbootacutatorexample.model.Category;
import com.karun.springbootacutatorexample.model.Product;

@Component
public class databaseconnection {

	@Autowired
	private  SessionFactory sessionFactory;
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	private Session session=null;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public static void main(String[] args){
		
		
		//Connection con=null;
	//	try
	//	{
	//		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "root");
	//	if(con!=null)
		//{
		//	System.out.println("connection object"+con.toString());
		//	System.out.println("connected succesfully");
		//}
		//Statement stmt=con.createStatement(); 
	//String query = " insert into emp (id,name,age)" + " values (?, ?, ?)";
		//PreparedStatement preparedStmt = con.prepareStatement(query); 
	//	 preparedStmt.setInt (1,20);
	  //    preparedStmt.setString (2, "Rubble");
	   //   preparedStmt.setInt   (3, 50);
	  /// // execute the preparedstatement
	   //   preparedStmt.execute();
	//	}catch(Exception e){
	//		System.out.println("not connected");
	//	}
	//}
		
		
		databaseconnection db=new databaseconnection();
		SessionFactory se1=db.getSessionFactory();
		System.out.println("fac"+se1.toString());
		Session session=db.getSession();
		session = db.getSessionFactory().openSession();
		

Product p1=new Product();
p1.setProductId(11);
p1.setProductName("Ram");
p1.setDescription("hi");
p1.setPrice(23.4);
Product p2=new Product();
p2.setProductId(12);
p2.setProductName("Ram");
p2.setDescription("hi");
p2.setPrice(23.4);
List<Product> a1=new ArrayList<Product>();
a1.add(p1);
a1.add(p2);

Category c1=new Category();
c1.setCategoryId(101);
c1.setCategoryName("ram");
//c1.setProducts(a1);
session.save(c1);
session.save(p1);
session.save(p2);

session.close();




	}

}


