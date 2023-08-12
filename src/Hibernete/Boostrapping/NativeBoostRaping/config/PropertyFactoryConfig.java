package Hibernete.Boostrapping.NativeBoostRaping.config;

import Hibernete.Boostrapping.NativeBoostRaping.Entity.Customer;
import Hibernete.Boostrapping.NativeBoostRaping.Entity.Iteam;
import Hibernete.Boostrapping.NativeBoostRaping.Entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.IOException;
import java.util.Properties;

public class PropertyFactoryConfig {

     private static PropertyFactoryConfig factoryConfig;

     private PropertyFactoryConfig(){

     }

     public static PropertyFactoryConfig getInstance(){
          return (null==factoryConfig) ? factoryConfig=new PropertyFactoryConfig() : factoryConfig;
     }

     public Session getSession(){
          Properties properties = new Properties();
          try {
               properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.Properties"));
          } catch (IOException e) {
               e.printStackTrace();
          }

          StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                  .applySettings(properties)
                  .build();

          Metadata metadata= new MetadataSources(serviceRegistry).addAnnotatedClass(Customer.class).addAnnotatedClass(Iteam.class).getMetadataBuilder()
                  .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();

          SessionFactory sessionFactory = metadata.buildSessionFactory();

          return sessionFactory.openSession();
     }
}
