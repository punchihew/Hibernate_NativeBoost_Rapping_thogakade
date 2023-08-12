package Hibernete.Boostrapping.NativeBoostRaping.Controller;

import Hibernete.Boostrapping.NativeBoostRaping.Entity.Customer;
import Hibernete.Boostrapping.NativeBoostRaping.Entity.Iteam;
import Hibernete.Boostrapping.NativeBoostRaping.config.PropertyFactoryConfig;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.net.URL;

public class IteamController {


    public TextField txtItemUnit;
    public TextField txtItemDes;
    public TextField txtItemCode;
    public TextField txtQty;
    public AnchorPane root;

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

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Iteam iteam = session.get(Iteam.class,Integer.parseInt(txtItemCode.getText()));


        session.delete(iteam);
        transaction.commit();
        session.close();
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Iteam iteam = session.get(Iteam.class, Integer.parseInt(txtItemCode.getText()));

        iteam.setName(txtItemDes.getText());
        iteam.setId(Integer.parseInt(txtItemCode.getText()));
        iteam.setPrice(Double.parseDouble(txtItemUnit.getText()));
        iteam.setQty(Integer.parseInt(txtQty.getText()));

        session.update(iteam);
        transaction.commit();
        session.close();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {

        Session session = PropertyFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Iteam iteam = new Iteam();
        iteam.setId(Integer.parseInt(txtItemCode.getText()));
        iteam.setName(txtItemDes.getText());
        iteam.setQty(Integer.parseInt(txtQty.getText()));
        iteam.setPrice(Double.parseDouble(txtItemUnit.getText()));

        session.save(iteam);
        transaction.commit();
        session.close();

    }
}
