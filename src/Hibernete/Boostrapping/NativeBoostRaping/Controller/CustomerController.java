package Hibernete.Boostrapping.NativeBoostRaping.Controller;

import Hibernete.Boostrapping.NativeBoostRaping.Entity.Customer;
import Hibernete.Boostrapping.NativeBoostRaping.config.PropertyFactoryConfig;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class CustomerController {

    public TextField cstId;
    public TextField cstAd;
    public TextField cstName1;
    public TextField csSly;
    public AnchorPane root;

//    @FXML
//    void initialize(){
//        getAll();
//    }
//
//    private void getAll() {
//        Session session = PropertyFactoryConfig.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<Customer> query = criteriaBuilder.createQuery(Customer.class);
//        query.from(Customer.class);
//        List<Customer> resultList = session.createQuery(query).getResultList();
//
//        for(Customer customer : resultList){
//            System.out.println(customer);
//        }
//
//    }


    public void btnSaveOnAction(ActionEvent actionEvent) {

        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setName(cstName1.getText());
        customer.setId(Integer.parseInt(cstId.getText()));
        customer.setAddress(csSly.getText());

        session.save(customer);
        transaction.commit();
        session.close();
    }


    public void btnUpdateOnAction(ActionEvent actionEvent) {

        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, Integer.parseInt(cstId.getText()));

        customer.setName(cstName1.getText());
        customer.setId(Integer.parseInt(cstId.getText()));
        customer.setAddress(csSly.getText());

        session.update(customer);
        transaction.commit();
        session.close();
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,Integer.parseInt(cstId.getText()));
        session.delete(customer);

        transaction.commit();
        session.close();


    }


    public void btnSearchOnAction(ActionEvent actionEvent) {
    }

    public void btnBack(MouseEvent mouseEvent) throws IOException {
        
        URL resource = this.getClass().getResource("/Hibernete/Boostrapping/NativeBoostRaping/View/Resources/Home.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.root.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        Platform.runLater(() -> primaryStage.sizeToScene());
    }
}
