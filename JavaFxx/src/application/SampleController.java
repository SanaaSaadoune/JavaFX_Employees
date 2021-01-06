package application;




import com.config.app.ConnectDB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.sql.PreparedStatement;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import com.javafxx.models.*;

public class SampleController implements Initializable {
	
	
	Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
	
    @FXML
    private Button btn1;

    @FXML
    private Button btn4;

    @FXML
    private Button btn3;

    @FXML
    private Button btn2;

    @FXML
    private TextField anomEm;

    @FXML
    private TextField aprenomEm;

    @FXML
    private TextField aageEm;

    @FXML
    private TextField adateEm;

    @FXML
    private TextField aheuresEm;

    @FXML
    private TextField unomEm;

    @FXML
    private TextField uprenomEm;

    @FXML
    private TextField uageEm;

    @FXML
    private TextField udateEm;

    @FXML
    private TextField uheuresEm;

    @FXML
    private TextField uidEm;

    @FXML
    private TextField dlidEm;

    @FXML
    private Button addEm;

    @FXML
    private Button updateEm;

    @FXML
    private Button deleteEm;

    @FXML
    private CheckBox arisqueEm;

    @FXML
    private CheckBox urisqueEm;
    
    @FXML
    private TextField anomEp;

    @FXML
    private TextField aprenomEp;

    @FXML
    private TextField aageEp;

    @FXML
    private TextField adateEp;

    @FXML
    private TextField aunitiesEp;

    @FXML
    private TextField unomEp;

    @FXML
    private TextField uprenomEp;

    @FXML
    private TextField uageEp;

    @FXML
    private TextField udateEp;

    @FXML
    private TextField uunitiesEp;

    @FXML
    private TextField uidEp;

    @FXML
    private TextField dlidEp;

    @FXML
    private Button addEp;

    @FXML
    private Button updateEp;

    @FXML
    private Button deleteEp;

    @FXML
    private CheckBox arisqueEp;

    @FXML
    private CheckBox urisqueEp;
    
    @FXML
    private TextField anomEr;

    @FXML
    private TextField aprenomEr;

    @FXML
    private TextField aageEr;

    @FXML
    private TextField adateEr;

    @FXML
    private TextField aaffairesEr;

    @FXML
    private TextField unomEr;

    @FXML
    private TextField uprenomEr;

    @FXML
    private TextField uageEr;

    @FXML
    private TextField udateEr;

    @FXML
    private TextField uaffairesEr;

    @FXML
    private TextField uidEr;

    @FXML
    private TextField dlidEr;

    @FXML
    private Button addEr;

    @FXML
    private Button updateEr;

    @FXML
    private Button deleteEr;

    @FXML
    private TextField anomEv;

    @FXML
    private TextField aprenomEv;

    @FXML
    private TextField aageEv;

    @FXML
    private TextField adateEv;

    @FXML
    private TextField aaffairesEv;

    @FXML
    private TextField unomEv;

    @FXML
    private TextField uprenomEv;

    @FXML
    private TextField uageEv;

    @FXML
    private TextField udateEv;

    @FXML
    private TextField uaffairesEv;

    @FXML
    private TextField uidEv;

    @FXML
    private TextField dlidEv;

    @FXML
    private Button addEv;

    @FXML
    private Button updateEv;

    @FXML
    private Button deleteEv;
    
    @FXML
    private TableView<EmployeManutention> tableEm;

    @FXML
    private TableColumn<EmployeManutention, Integer> colIdEm;

    @FXML
    private TableColumn<EmployeManutention, String> colNomEm;

    @FXML
    private TableColumn<EmployeManutention, String> colPrenomEm;

    @FXML
    private TableColumn<EmployeManutention, Integer> colAgeEm;

    @FXML
    private TableColumn<EmployeManutention, Integer> colDateEm;

    @FXML
    private TableColumn<EmployeManutention, Integer> colHeuresTravailEm;

    @FXML
    private TableColumn<EmployeManutention, Boolean> colRisqueEm;
    
    
    @FXML
    private TableView<EmployeProduction> tableEp;

    @FXML
    private TableColumn<EmployeProduction, Integer> colIdEp;

    @FXML
    private TableColumn<EmployeProduction, String> colNomEp;

    @FXML
    private TableColumn<EmployeProduction, String> colPrenomEp;

    @FXML
    private TableColumn<EmployeProduction, Integer> colAgeEp;

    @FXML
    private TableColumn<EmployeProduction, Integer> colDateEp;

    @FXML
    private TableColumn<EmployeProduction, Integer> colNombreUnites;

    @FXML
    private TableColumn<EmployeProduction, Boolean> colRisqueEp;

    @FXML
    private Button showtest;
    
    @FXML
    private Button showEm;
    
    @FXML
    private TableView<EmployeRepresentation> tableEr;

    @FXML
    private TableColumn<EmployeRepresentation, Integer> colIdEr;

    @FXML
    private TableColumn<EmployeRepresentation, String> colNomEr;

    @FXML
    private TableColumn<EmployeRepresentation, String> colPrenomEr;

    @FXML
    private TableColumn<EmployeRepresentation, Integer> colAgeEr;

    @FXML
    private TableColumn<EmployeRepresentation, Integer> colDateEr;

    @FXML
    private TableColumn<EmployeRepresentation, Double> colChiffreAffaireser;
    
    @FXML
    private Button showEr;
    
    @FXML
    private TableView<EmployeVente> tableEv;

    @FXML
    private TableColumn<EmployeVente, Integer> colIdEv;

    @FXML
    private TableColumn<EmployeVente, String> colNomEv;

    @FXML
    private TableColumn<EmployeVente, String> colPrenomEv;

    @FXML
    private TableColumn<EmployeVente, Integer> colAgeEv;

    @FXML
    private TableColumn<EmployeVente, Integer> colDateEv;

    @FXML
    private TableColumn<EmployeVente, Double> colChiffreAffairesev;
    
    @FXML
    private Button showEv;
    
    
	public void handleBtn1() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Stage window = (Stage) btn1.getScene().getWindow();
		Scene scene = new Scene(root,800,600);
		window.setScene(scene);
		
	}
	
	public void handleBtn2() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
		Stage window = (Stage) btn1.getScene().getWindow();
		Scene scene = new Scene(root,800,600);
		window.setScene(scene);
		
	}
	public void handleBtn3() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Sample3.fxml"));
		Stage window = (Stage) btn1.getScene().getWindow();
		Scene scene = new Scene(root,800,600);
		window.setScene(scene);
	}
	public void handleBtn4() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Sample4.fxml"));
		Stage window = (Stage) btn1.getScene().getWindow();
		Scene scene = new Scene(root,800,600);
		window.setScene(scene);
	}
	
	
	//sample1
		@FXML
		void addEmployemanutention(ActionEvent event) {
	   
		EmployeManutention employeManutention = new EmployeManutention(anomEm.getText(),aprenomEm.getText(),Integer.parseInt(aageEm.getText()),Integer.parseInt(adateEm.getText()),Integer.parseInt(aheuresEm.getText()),arisqueEm.isSelected());
		ConnectDB conn = new ConnectDB();
	   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		String sql="INSERT INTO employemanutention (nom,prenom,age,dateEntree,heuresTravail,salaire,risque) VALUES ('"+anomEm.getText()+"','"+aprenomEm.getText()+"',"+aageEm.getText()+","+adateEm.getText()+","+aheuresEm.getText()+","+employeManutention.calculerSalaire()+","+arisqueEm.isSelected()+")";

	   	conn.InsertReq(sql);
	   	anomEm.clear();
	   	aprenomEm.clear();
	   	aageEm.clear();
	   	adateEm.clear();
	   	aheuresEm.clear();
	   	
	   	
	   	showEm();
	   	
		}
		
		@FXML
		void updateEmployemanutention(ActionEvent event) {
	   
		EmployeManutention employeManutention = new EmployeManutention(unomEm.getText(),uprenomEm.getText(),Integer.parseInt(uageEm.getText()),Integer.parseInt(udateEm.getText()),Integer.parseInt(uheuresEm.getText()),urisqueEm.isSelected());
			ConnectDB conn = new ConnectDB();
	   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		String sql="UPDATE employemanutention SET nom='"+unomEm.getText()+"',prenom='"+uprenomEm.getText()+"', age='"+uageEm.getText()+"', dateEntree='"+udateEm.getText()+"', heuresTravail='"+uheuresEm.getText()+"', salaire="+employeManutention.calculerSalaire()+", risque="+urisqueEm.isSelected()+" WHERE id="+uidEm.getText()+"";
		
		
	   	conn.InsertReq(sql);
	   	uidEm.clear();
	   	unomEm.clear();
	   	uprenomEm.clear();
	   	uageEm.clear();
	   	udateEm.clear();
	   	uheuresEm.clear();
	   	
	   	
	   	showEm();
	   		       
		}
		
		@FXML
		void deleteEmployemanutention(ActionEvent event) {
			ConnectDB conn = new ConnectDB();
		   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		   	conn.InsertReq("Delete FROM employemanutention WHERE id="+dlidEm.getText());
		   	dlidEm.clear();
		   	
		   	
		   	showEm();
		}
	
	
	
	
	
	
	
	
	//simple2
	
	@FXML
	void addEmployeproduction(ActionEvent event) {
   
		EmployeProduction employeProduction = new EmployeProduction(anomEp.getText(),aprenomEp.getText(),Integer.parseInt(aageEp.getText()),Integer.parseInt(adateEp.getText()),Integer.parseInt(aunitiesEp.getText()),arisqueEp.isSelected());
		ConnectDB conn = new ConnectDB();
   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
	String sql="INSERT INTO employeproduction (nom,prenom,age,dateEntree,nombreUnites,salaire,risque) VALUES ('"+anomEp.getText()+"','"+aprenomEp.getText()+"',"+aageEp.getText()+","+adateEp.getText()+","+aunitiesEp.getText()+","+employeProduction.calculerSalaire()+","+arisqueEp.isSelected()+")";

   	conn.InsertReq(sql);
   	anomEp.clear();
   	aprenomEp.clear();
   	aageEp.clear();
   	adateEp.clear();
   	aunitiesEp.clear();
   	
   	showEp();
   	
	}
	
	@FXML
	void updateEmployeproduction(ActionEvent event) {
   
		EmployeProduction employeProduction = new EmployeProduction(unomEp.getText(),uprenomEp.getText(),Integer.parseInt(uageEp.getText()),Integer.parseInt(udateEp.getText()),Integer.parseInt(uunitiesEp.getText()),urisqueEp.isSelected());
		ConnectDB conn = new ConnectDB();
   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
	String sql="UPDATE employeproduction SET nom='"+unomEp.getText()+"',prenom='"+uprenomEp.getText()+"', age='"+uageEp.getText()+"', dateEntree='"+udateEp.getText()+"', nombreUnites='"+uunitiesEp.getText()+"', salaire="+employeProduction.calculerSalaire()+", risque="+urisqueEp.isSelected()+" WHERE id="+uidEp.getText()+"";
	
//	System.out.println(unomEp.getText()+" "+uprenomEp.getText()+" "+uageEp.getText()+" "+udateEp.getText()+" "+udateEp.getText()+" "+uunitiesEp.getText()+" "+urisqueEp.isSelected()+" "+uidEp.getText());
	
   	conn.InsertReq(sql);
   	uidEp.clear();
   	unomEp.clear();
   	uprenomEp.clear();
   	uageEp.clear();
   	udateEp.clear();
   	uunitiesEp.clear();
   		 
   	showEp();
	}
	
	@FXML
	void deleteEmployeproduction(ActionEvent event) {
		ConnectDB conn = new ConnectDB();
	   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
	   	conn.InsertReq("Delete FROM employeproduction WHERE id="+dlidEp.getText());
	   	dlidEp.clear();
	   	
	   	showEp();
	}
	
	
	
	//simple3
	
		@FXML
		void addEmployerepresentation(ActionEvent event) {
	   
			EmployeRepresentation employeRepresentation = new EmployeRepresentation(anomEr.getText(),aprenomEr.getText(),Integer.parseInt(aageEr.getText()),Integer.parseInt(adateEr.getText()),Integer.parseInt(aaffairesEr.getText()));
			ConnectDB conn = new ConnectDB();
	   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		String sql="INSERT INTO employerepresentation (nom,prenom,age,dateEntree,chiffreAffaires,salaire) VALUES ('"+anomEr.getText()+"','"+aprenomEr.getText()+"',"+aageEr.getText()+","+adateEr.getText()+","+aaffairesEr.getText()+","+employeRepresentation.calculerSalaire()+")";

	   	conn.InsertReq(sql);
	   	anomEr.clear();
	   	aprenomEr.clear();
	   	aageEr.clear();
	   	adateEr.clear();
	   	aaffairesEr.clear();
	   	
	   	showEr();
	   	
		}
		
		@FXML
		void updateEmployerepresentation(ActionEvent event) {
	   
			EmployeRepresentation employeRepresentation = new EmployeRepresentation(unomEr.getText(),uprenomEr.getText(),Integer.parseInt(uageEr.getText()),Integer.parseInt(udateEr.getText()),Integer.parseInt(uaffairesEr.getText()));
			ConnectDB conn = new ConnectDB();
	   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		String sql="UPDATE employerepresentation SET nom='"+unomEr.getText()+"',prenom='"+uprenomEr.getText()+"', age='"+uageEr.getText()+"', dateEntree='"+udateEr.getText()+"', chiffreAffaires='"+uaffairesEr.getText()+"', salaire="+employeRepresentation.calculerSalaire()+" WHERE id="+uidEr.getText()+"";
		
		
	   	conn.InsertReq(sql);
	   	uidEr.clear();
	   	unomEr.clear();
	   	uprenomEr.clear();
	   	uageEr.clear();
	   	udateEr.clear();
	   	uaffairesEr.clear();
	   		       
	   	showEr();
		}
		
		@FXML
		void deleteEmployerepresentation(ActionEvent event) {
			ConnectDB conn = new ConnectDB();
		   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
		   	conn.InsertReq("Delete FROM employerepresentation WHERE id="+dlidEr.getText());
		   	dlidEr.clear();
		   	
		   	showEr();
		}
		
		
		//simple4
		
			@FXML
			void addEmployerevente(ActionEvent event) {
		   
				EmployeVente employeVente = new EmployeVente(anomEv.getText(),aprenomEv.getText(),Integer.parseInt(aageEv.getText()),Integer.parseInt(adateEv.getText()),Integer.parseInt(aaffairesEv.getText()));
				ConnectDB conn = new ConnectDB();
		   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
			String sql="INSERT INTO employeVente (nom,prenom,age,dateEntree,chiffreAffaires,salaire) VALUES ('"+anomEv.getText()+"','"+aprenomEv.getText()+"',"+aageEv.getText()+","+adateEv.getText()+","+aaffairesEv.getText()+","+employeVente.calculerSalaire()+")";

		   	conn.InsertReq(sql);
		   	anomEv.clear();
		   	aprenomEv.clear();
		   	aageEv.clear();
		   	adateEv.clear();
		   	aaffairesEv.clear();
		   	showEv();
		   	
			}
			
			@FXML
			void updateEmployevente(ActionEvent event) {
		   
				EmployeVente employeVente = new EmployeVente(unomEv.getText(),uprenomEv.getText(),Integer.parseInt(uageEv.getText()),Integer.parseInt(udateEv.getText()),Integer.parseInt(uaffairesEv.getText()));
				ConnectDB conn = new ConnectDB();
		   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
			String sql="UPDATE employeVente SET nom='"+unomEv.getText()+"',prenom='"+uprenomEv.getText()+"', age='"+uageEv.getText()+"', dateEntree='"+udateEv.getText()+"', chiffreAffaires='"+uaffairesEv.getText()+"', salaire="+employeVente.calculerSalaire()+" WHERE id="+uidEv.getText()+"";
			
			
		   	conn.InsertReq(sql);
		   	uidEv.clear();
		   	unomEv.clear();
		   	uprenomEv.clear();
		   	uageEv.clear();
		   	udateEv.clear();
		   	uaffairesEv.clear();
		   	showEv();	       
			}
			
			@FXML
			void deleteEmployevente(ActionEvent event) {
				ConnectDB conn = new ConnectDB();
			   	conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
			   	conn.InsertReq("Delete FROM employeVente WHERE id="+dlidEv.getText());
			   	dlidEv.clear();
			   	showEv();
			}
	
	

	//EM TABLE
			public ObservableList<EmployeManutention> getEmployeManutention(){
				ObservableList<EmployeManutention> emList = FXCollections.observableArrayList();
				ConnectDB conn = new ConnectDB();
				conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
				String sql="SELECT * FROM employemanutention";
				Statement st;
				ResultSet rs;
				try {
				st = conn.connection.createStatement();
		        rs = st.executeQuery(sql);
		        EmployeManutention em;
		        while(rs.next()) {
		        	em = new EmployeManutention(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"), rs.getInt("dateEntree"), rs.getInt("heuresTravail"), rs.getBoolean("risque"));
		        	emList.add(em);
		        }
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				return emList;
			}
			
			
			public void showEm() {
				ObservableList<EmployeManutention> list = getEmployeManutention();
				colIdEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, Integer>("id"));
				colNomEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, String>("nom"));
				colPrenomEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, String>("prenom"));
				colAgeEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, Integer>("age"));
				colDateEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, Integer>("dateEntree"));
				colHeuresTravailEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, Integer>("heuresTravail"));
				colRisqueEm.setCellValueFactory(new PropertyValueFactory<EmployeManutention, Boolean>("risque"));
				tableEm.setItems(list);
			}
	
			
			
			//EP TABLE 
			public ObservableList<EmployeProduction> getEmployeProduction(){
				ObservableList<EmployeProduction> epList = FXCollections.observableArrayList();
				ConnectDB conn = new ConnectDB();
				conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
				String sql="SELECT * FROM employeproduction";
				Statement st;
				ResultSet rs;
				try {
				st = conn.connection.createStatement();
		        rs = st.executeQuery(sql);
		        EmployeProduction ep;
		        while(rs.next()) {
		        	ep = new EmployeProduction(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"), rs.getInt("dateEntree"),  rs.getInt("nombreUnites"), rs.getBoolean("risque"));
		        	epList.add(ep);
		        }
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				return epList;
				
			}
			
			
			public void showEp() {
				ObservableList<EmployeProduction> list = getEmployeProduction();
				colIdEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, Integer>("id"));
				colNomEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, String>("nom"));
				colPrenomEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, String>("prenom"));
				colAgeEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, Integer>("age"));
				colDateEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, Integer>("dateEntree"));
				colNombreUnites.setCellValueFactory(new PropertyValueFactory<EmployeProduction, Integer>("nombreUnites"));
				colRisqueEp.setCellValueFactory(new PropertyValueFactory<EmployeProduction, Boolean>("risque"));
				tableEp.setItems(list);
			}
			
			
			//ER TABLE 
			public ObservableList<EmployeRepresentation> getEmployeRepresentation(){
				ObservableList<EmployeRepresentation> erList = FXCollections.observableArrayList();
				ConnectDB conn = new ConnectDB();
				conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
				String sql="SELECT * FROM employerepresentation";
				Statement st;
				ResultSet rs;
				try {
				st = conn.connection.createStatement();
		        rs = st.executeQuery(sql);
		        EmployeRepresentation er;
		        while(rs.next()) {
		        	er = new EmployeRepresentation(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"), rs.getInt("dateEntree"),  rs.getDouble("chiffreAffaires"));
		        	erList.add(er);
		        }
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				return erList;
				
			}
			
			
			public void showEr() {
				ObservableList<EmployeRepresentation> list = getEmployeRepresentation();
				colIdEr.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, Integer>("id"));
				colNomEr.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, String>("nom"));
				colPrenomEr.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, String>("prenom"));
				colAgeEr.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, Integer>("age"));
				colDateEr.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, Integer>("dateEntree"));
				colChiffreAffaireser.setCellValueFactory(new PropertyValueFactory<EmployeRepresentation, Double>("chiffreAffaires"));
				tableEr.setItems(list);
			}
			
			
			//EV TABLE 
			public ObservableList<EmployeVente> getEmployeVente(){
				ObservableList<EmployeVente> evList = FXCollections.observableArrayList();
				ConnectDB conn = new ConnectDB();
				conn.Connect("jdbc:mysql://localhost/bdgestionpersonnel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
				String sql="SELECT * FROM employevente";
				Statement st;
				ResultSet rs;
				try {
				st = conn.connection.createStatement();
		        rs = st.executeQuery(sql);
		        EmployeVente ev;
		        while(rs.next()) {
		        	ev = new EmployeVente(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"), rs.getInt("dateEntree"),  rs.getDouble("chiffreAffaires"));
		        	evList.add(ev);
		        }
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				return evList;
				
			}
			
			
			public void showEv() {
				ObservableList<EmployeVente> list = getEmployeVente();
				colIdEv.setCellValueFactory(new PropertyValueFactory<EmployeVente, Integer>("id"));
				colNomEv.setCellValueFactory(new PropertyValueFactory<EmployeVente, String>("nom"));
				colPrenomEv.setCellValueFactory(new PropertyValueFactory<EmployeVente, String>("prenom"));
				colAgeEv.setCellValueFactory(new PropertyValueFactory<EmployeVente, Integer>("age"));
				colDateEv.setCellValueFactory(new PropertyValueFactory<EmployeVente, Integer>("dateEntree"));
				colChiffreAffairesev.setCellValueFactory(new PropertyValueFactory<EmployeVente, Double>("chiffreAffaires"));
				tableEv.setItems(list);
			}
			
			
			
		
			
			
			
			
			
			
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
