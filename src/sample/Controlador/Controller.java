package sample.Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sample.Mainnn.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ScrollPane spscroll;

    @FXML
    private Label lblplaca;

    @FXML
    private Label lblLetras;

    @FXML
    private Label lblnumeros;

    @FXML
    private TextField txtfletras;

    @FXML
    private TextField txtfnumeros;

    @FXML
    private Label lbl7combustible;

    @FXML
    private Label lbl6linea;

    @FXML
    private Label lblmarca;

    @FXML
    private Label lbl;

    @FXML
    private TextField txtflinea;

    @FXML
    private TextField txtColores;

    @FXML
    private TextField txtfmarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtCilindrada;

    @FXML
    private TextField txtCapacidad;

    @FXML
    private CheckBox optblin1;

    @FXML
    private CheckBox optblin2;

    @FXML
    private CheckBox optdesblind1;

    @FXML
    private TextField txtPotencia;

    @FXML
    private DatePicker dateFechaBlindaje;

    @FXML
    private DatePicker dateFechaDesmonteBlind;

    @FXML
    private ComboBox<String> cmbcombustible;

    @FXML
    private Label lbltramitesolicitado;

    @FXML
    private ComboBox<String> cmbtramitesolicitado;

    @FXML
    private TextField txtfcodigocarrocieria;

    @FXML
    private TextField txtftipocarroceria;

    @FXML
    private TextField txtnumeromotor;

    @FXML
    private CheckBox optionnummotorsi;

    @FXML
    private CheckBox optionnummotorno;

    @FXML
    private TextField txtfnumerochasis;

    @FXML
    private CheckBox optionchasissi;

    @FXML
    private CheckBox optionchasisno;

    @FXML
    private TextField txtnumerodeserie;

    @FXML
    private CheckBox optregrabadonumseriesi;

    @FXML
    private CheckBox optregrabadonumserieno;

    @FXML
    private TextField txtfvehoculonumVIN;

    @FXML
    private ChoiceBox<String> cmbimportacion;

    @FXML
    private ChoiceBox<String> cmbremate;

    @FXML
    private TextField txtciudadimportacion;

    @FXML
    private TextField txtcodigoimportacion;

    @FXML
    private TextField txtnumerodocumentoimportacion;

    @FXML
    private DatePicker dateimportacion;

    @FXML
    private ComboBox<String> cmbdatosalerta;

    @FXML
    private ComboBox<String> cmbtiposervicio;

    @FXML
    private TextField txtnombreempresavinc;

    @FXML
    private TextField txtnitempresavinc;

    @FXML
    private TextField txtfobservaciones;

    @FXML
    private Label lblclasevehiculo;

    @FXML
    private ComboBox<String> cmbclasevehiculo;

    @FXML
    private TextField txtprimerapellido;

    @FXML
    private TextField txtsegundoapellido;

    @FXML
    private TextField txtnombres;

    @FXML
    private ComboBox<String> cmbtipodoc;

    @FXML
    private TextField txtnumerodocumento;

    @FXML
    private TextField txtdireccionpropietario;

    @FXML
    private TextField txtciudadpropietario;

    @FXML
    private TextField txttelefonopropietario;

    @FXML
    private TextField txtafirmapropietario;

    @FXML
    private TextField txtprimerapellidocomp;

    @FXML
    private TextField txtsegundoapellidocomp;

    @FXML
    private TextField txtnombrescomp;

    @FXML
    private ComboBox<String> cmbtipodoccomp;

    @FXML
    private TextField txtdocumentocomp;

    @FXML
    private TextField txtdireccioncomp;

    @FXML
    private TextField txtciudadcomp;

    @FXML
    private TextField txttelcomp;

    @FXML
    private TextField txtfirmacomp;

    @FXML
    private Label lblformulario;

    @FXML
    private Label lblrna;

    @FXML
    private Label lblmintransporte;

    @FXML
    private Label lblsim;

    @FXML
    private Label lblciudad;

    @FXML
    private Label lblbogota;

    @FXML
    private Label lblcodigo;

    @FXML
    private Label lblcodciudad;

    @FXML
    private Label lblfechatramite;

    @FXML
    private Label lbldia;

    @FXML
    private Label lblmes;

    @FXML
    private Label lblano;

    @FXML
    private DatePicker datefechatramite;

    @FXML
    private Label lblorgtran;

    @FXML
    private Button btnenviar;

    @FXML
    private TextField txtfresblind;

    @FXML
    private TextField txtfresdesblin;

    @FXML
    private TextField txtacta;

    @FXML
    private TextField txtdecimp;

    @FXML
    private TextField txtmanifiesto;

    @Override
    public void initialize(URL location, ResourceBundle Resourse) {

        cmbcombustible.getItems().addAll("Gas","Diesel","Gasolina");
        cmbtramitesolicitado.getItems().addAll("Matricula","Cambio Color","Cambio Servicio","Levantar Prenda","Venta");
        cmbclasevehiculo.getItems().addAll("Bus","Automovil","Camioneta","campero","volqueta","cuatrimoto","mototriciclo","motocarro","moto","tractocamion","buset<");
        cmbtipodoc.getItems().addAll("Cedula","Tarjeta","Pasaporte");
        cmbtipodoccomp.getItems().addAll("Cedula","Tarjeta","Pasaporte");
        cmbdatosalerta.getItems().addAll("Hurto","Choque","Ninguno");
        cmbtiposervicio.getItems().addAll("Uber");
    }


    @FXML
    void envio(ActionEvent event) throws IOException {

        Carroceria carro=new Carroceria(Integer.parseInt(txtfcodigocarrocieria.getText()),txtftipocarroceria.getText());
        Blindaje blind=new Blindaje(optblin1.isSelected() ? 1 : 0 ,Integer.parseInt(txtfresblind.getText()), dateFechaBlindaje.getValue().toString(), optdesblind1.isSelected() ? 1 : 0, Integer.parseInt(txtfresdesblin.getText()),dateFechaDesmonteBlind.getValue().toString());
        OrganizmoDeTransito org=new OrganizmoDeTransito("Servicios Integrales para la Movilidad SIM","Bogota", 11001, datefechatramite.getValue().toString());
        Placa pla=new Placa(txtfletras.getText(),Integer.parseInt(txtfcodigocarrocieria.getText()));


        ImportacionRemate imprem=new ImportacionRemate(Integer.parseInt(txtmanifiesto.getText()), Integer.parseInt(txtdecimp.getText()), txtacta.getText(), "Servicios Integrales para la Movilidad SIM", txtciudadimportacion.getText(),txtcodigoimportacion.getText(), Integer.parseInt(txtnumerodocumentoimportacion.getText()), dateimportacion.getValue().toString());

        Persona per=new Persona(1,txtprimerapellido.getText(),txtsegundoapellido.getText(),txtnombres.getText(), cmbtipodoc.getValue(), txtnumerodocumento.getText(), txtdireccionpropietario.getText(), txtciudadpropietario.getText(), Integer.parseInt(txttelefonopropietario.getText()), txtafirmapropietario.getText());
        Vehiculo veh=new Vehiculo( pla, txtflinea.getText(), txtfmarca.getText(), txtColores.getText(),Integer.parseInt(txtModelo.getText()),Integer.parseInt(txtCilindrada.getText()),cmbclasevehiculo.getValue() ,cmbcombustible.getValue(),cmbtiposervicio.getValue(),txtPotencia.getText(),cmbdatosalerta.getValue(), carro, txtnombreempresavinc.getText(),txtnitempresavinc.getText(), blind,imprem);

        String comprador=txtprimerapellidocomp.getText();
        FileWriter fWriter = new FileWriter ("output.txt",true);
        PrintWriter pWriter=new PrintWriter(fWriter);

        if(!comprador.equals("")) {
            Persona per2 = new Persona(2, txtprimerapellidocomp.getText(), txtsegundoapellidocomp.getText(), txtnombrescomp.getText(), cmbtipodoccomp.getValue(), txtdocumentocomp.getText(), txtdireccioncomp.getText(), txtciudadcomp.getText(), Integer.parseInt(txttelcomp.getText()), txtfirmacomp.getText());
            TramiteSolicitado tram0=new TramiteSolicitado(0,cmbtramitesolicitado.getValue(),veh, per,per2, org);
            //System.out.println(tram0.toString());
    
            pWriter.println("****************************");
            SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
            Date date =new Date((System.currentTimeMillis()));
            pWriter.print(formatter.format(date)+" ");
            pWriter.println(tram0);
            pWriter.println("**********END*********");
            pWriter.close();
        }
        else {
            TramiteSolicitado tram0 = new TramiteSolicitado(0, cmbtramitesolicitado.getValue(), veh, per, org);
            //System.out.println(tram0.toString());

            pWriter.println("****************************");
            SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
            Date date =new Date((System.currentTimeMillis()));
            pWriter.print(formatter.format(date)+" ");
            pWriter.println(tram0);
            pWriter.println("**********END*********");
            pWriter.close();
        }
    }

}
