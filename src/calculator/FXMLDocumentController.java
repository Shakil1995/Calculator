/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author seu
 */
public class FXMLDocumentController implements Initializable {
  private  double CarentNumer;
  private String carrentOparetion;
  
    @FXML
    private TextField displayfield;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonAction(ActionEvent event) {
        
    String digit = ( (Button)event.getSource()).getText();
     String oldText=displayfield.getText();
     String newText=oldText+digit;
     displayfield.setText(newText);
        
    } 

    @FXML
    private void TextFieldAction(ActionEvent event) {
          String CurrentText=displayfield.getText();
       CarentNumer= Double.parseDouble(CurrentText);
         displayfield.setText("");
          carrentOparetion =((Button)event.getSource()).getText();
    
    
    }

    @FXML
    private void EqualOparetion(ActionEvent event) {
        String newText=displayfield.getText();
        double newNumber= Double.parseDouble(newText);
       
        switch(carrentOparetion){
case"+":    
     CarentNumer=CarentNumer+newNumber;
     break;
     case"-":    
     CarentNumer=CarentNumer-newNumber;
     break;
     case"*":    
     CarentNumer=CarentNumer*newNumber;
     break;
     case"/":    
     CarentNumer=CarentNumer/newNumber;
     break;
      }
     displayfield.setText(""+CarentNumer);
         }
   

    @FXML
    private void OparetionAll(ActionEvent event) {
          String CurrentText=displayfield.getText();
 

 
 CarentNumer= Double.parseDouble(CurrentText);
      
       displayfield.setText("");
       carrentOparetion=((Button)event.getSource()).getText();
    }

    @FXML
    private void ClearActionButton(ActionEvent event) {
        
  displayfield.setText("");
       
        
    }

   
}
