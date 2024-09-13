package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.entities.User;

public class App {
	public static void main(String[] args) {
		User user1 = new User();
		// ----insert------
//    	user1.setName("Nikhil");
//    	user1.setEmail("nikhil@gmail.com");
//    	user1.setPassword("nikhil123");
//    	user1.setGender("male");
//    	user1.setCity("pithoragarh");

		Configuration cfg = new Configuration();
		cfg.configure("/in/sp/config/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// --------insert method---------------

//        try {
//            session.save(user1);
//            transaction.commit();
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	
//        }
		
		
		//-------select---------
		try {
			User user =session.get(User.class, 1L);
			
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println(user.getGender());
			System.out.println(user.getCity());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
