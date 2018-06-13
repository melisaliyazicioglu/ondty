package com.project.yasar.onduty;
import com.project.yasar.onduty.domain.Credential;
import com.project.yasar.onduty.domain.User;
import com.project.yasar.onduty.domain.UserType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain {
    public static void main(String[] args){
        User user =new User();
        user.setEmail("sdfsdf");
        user.setName("sdfsd");
        user.setSurname("sdfsd");
      Credential credential = new Credential(user,"admin","admin",UserType.MOBIL);

      SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      Session session = sessionFactory.openSession();
        session.save(user);
        session.save(credential);

        session.beginTransaction().commit();
    }
}
