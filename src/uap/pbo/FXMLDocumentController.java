/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap.pbo;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Windosw
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField textUkuran;
    @FXML
    private TextField textHarga;
    @FXML
    private ComboBox<String> textWarna;
    @FXML
    private ComboBox<String> textMerk;
    @FXML
    private Button tombolCari;
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> inputWarna = observableArrayList();
        ObservableList<String> inputMerk = observableArrayList();

        // Tambahkan input warna
        inputWarna.add("Merah");
        inputWarna.add("Hitam");
        inputWarna.add("Putih");
        // dst

        // Tambahkan input merk
        inputMerk.add("Nike");
        inputMerk.add("Adidas");
        inputMerk.add("Converse");
        // dst

        textWarna.setItems(inputWarna);
        textMerk.setItems(inputMerk);
    }    

    @FXML
    private void CariBarang(ActionEvent event) {
        int ukuran = Integer.parseInt(textUkuran.getText());
        String warna = textWarna.getValue();
        String merk = textMerk.getValue();

        Connection conn = koneksi.getKoneksi();

        try{
            String query = "SELECT Harga FROM `tabel sepatu` WHERE Merk='"+merk+"' AND Ukuran="+ukuran+" AND Warna='"+warna+"'";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                int harga = rs.getInt("Harga");
                
                SepatuHandler sepatu = new SepatuHandler(merk, warna, ukuran, harga);
                
                textHarga.setText(Integer.toString(sepatu.getHarga()));
            }else{
                textHarga.setText("Not Found!");
            }
        }catch(Exception ex){
            System.out.println("Error : " + ex);
        }
    }
    
}