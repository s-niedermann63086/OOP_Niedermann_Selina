package oop_Niedermann_Selina;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    ListView<String> liMyList;
    
    ObservableList<String> myListModel = FXCollections.observableArrayList();
   
    TextField nettopreisInput = new TextField();
    TextField anzahlungInput = new TextField();
    ComboBox zinsCb = new ComboBox();
    ComboBox laufzeitCb = new ComboBox();
    TextField restwertInput = new TextField();
    Button berechnenBt = new Button();
    TextField rateInput = new TextField();
    TextField amortisationInput = new TextField();
    TextField zinskostenInput = new TextField();
    TextField newnameInput = new TextField();
    Button speichernBt = new Button();
    Button ladenBt = new Button();
    TextArea txtOutput = new TextArea();
    
    
    @FXML
    private void calculateButtonAction(ActionEvent event) {
    
    }
    
    public void initialize(URL url, ResourceBundle rb) {
    	 liMyList.setItems(myListModel);
    }    

}
