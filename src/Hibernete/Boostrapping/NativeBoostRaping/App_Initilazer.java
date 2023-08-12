package Hibernete.Boostrapping.NativeBoostRaping;

import Hibernete.Boostrapping.NativeBoostRaping.Entity.Customer;
import Hibernete.Boostrapping.NativeBoostRaping.Entity.Order;
import Hibernete.Boostrapping.NativeBoostRaping.config.PropertyFactoryConfig;
import com.mysql.cj.Session;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javax.transaction.Transaction;
import java.io.IOException;

public class App_Initilazer extends Application {

////         save
//        Session session = PropertyFactoryConfig.getInstance().getSession();
//
//        Order orderDetails = new Order();
//
//        orderDetails.setOid("kiripiti");
//        orderDetails.setOrderDate("I001");
//        orderDetails.setQty(2);
//        orderDetails.setUnitPrice(100.00);
//
//
//        Transaction transaction = session.beginTransaction();
//        session.save(orderDetails);
//        transaction.commit();
//        session.close();

//        Customer customer = new Customer();
//        customer.setId(5);
//        customer.setName("Navishka");
//        customer.setAddress("Matara");
//        customer.setSalary(100000.00);
    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(this.getClass().getResource("/Hibernete/Boostrapping/NativeBoostRaping/View/Resources/Home.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Java FX POS");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
//    public static void main(String[] args) {
//
//
//        // save
//        Session session =  PropertyFactoryConfig.getInstance().getSession();
//
////        Iteam iteam = new Iteam();
////
////        iteam.setId(3);
////        iteam.setName("Navishka");
////        iteam.setQty(2);
////
////
////        Transaction transaction = session.beginTransaction();
////        session.save(iteam);
////        transaction.commit();
////        session.close();
//
//        Customer customer = new Customer();
//        customer.setId(5);
//        customer.setName("Navishka");
//        customer.setAddress("Matara");
//        customer.setSalary(100000.00);
//
//
//        Transaction transaction = session.beginTransaction();
//          session.save(customer);
//          transaction.commit();
//          session.close();
//
//          //update
////        Session session1 = SessionFactoryConfig.getInstance().getSession();
////        Transaction transaction1 = session1.beginTransaction();
////
////         Customer customer = session1.get(Customer.class,1);
////                 customer.setAddress("Matara");
////                 customer.setName("Punchihewa");
////                 session1.update(customer);
////                 transaction1.commit();
////                 session1.close();
//
////         Session session2 = SessionFactoryConfig.getInstance().getSession();
////         Transaction transaction = session2.beginTransaction();
////         Customer customer1 = session2.get(Customer.class,1);
////         session2.delete(customer1);
////         transaction.commit();
////         session2.close();
//
//
//
//    }
//}

          //update
//        Session session1 = SessionFactoryConfig.getInstance().getSession();
//        Transaction transaction1 = session1.beginTransaction();
//         Customer customer = session1.get(Customer.class,1);
//                 customer.setAddress("Matara");
//                 customer.setName("Punchihewa");
//                 session1.update(customer);
//                 transaction1.commit();
//                 session1.close();

           //delete
//         Session session2 = SessionFactoryConfig.getInstance().getSession();
//         Transaction transaction = session2.beginTransaction();
//         Customer customer1 = session2.get(Customer.class,1);
//         session2.delete(customer1);
//         transaction.commit();
//         session2.close();






