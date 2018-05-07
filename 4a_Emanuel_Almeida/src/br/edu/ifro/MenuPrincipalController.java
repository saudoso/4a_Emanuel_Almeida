/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

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
 * @author emanu
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txt1, txt2, result;
    
    @FXML
    private Button btn;

    @FXML
    private void soma(ActionEvent event){
         Double n1 = Double.parseDouble(txt1.getText());
         Double n2 = Double.parseDouble(txt2.getText());
         Double resultado = n1 + n2;
         
         result.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
