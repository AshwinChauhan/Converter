package application;


import java.net.URL;

import java.util.ResourceBundle;

//Ashwin Chauhan L3
// 03/01/2021
// dans le code, on dois créer 5 convertiseur et 2 des 5 dois etre de metrique en imperiale. J'ai choisi de faire la masse et le distance.

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FiveCController implements Initializable {

	
	
	
	//changement
	// Voice mes varaiable, les combo box sont en String et le cbo = combobox est le txt = un textfield
	
	
    @FXML
    private ComboBox<String> cboV1;

    @FXML
    private ComboBox<String> cboT1;

    @FXML
    private ComboBox<String> cboV2;

    @FXML
    private TextField txtM1;

    @FXML
    private ComboBox<String> cboT2;

    @FXML
    private TextField txtM2;

    @FXML
    private TextField txtV1;

    @FXML
    private TextField txtSD2;

    @FXML
    private TextField txtSD1;

    @FXML
    private TextField txtT2;

    @FXML
    private ComboBox<String> cboM2;

    @FXML
    private ComboBox<String> cboM1;

    @FXML
    private TextField txtV2;

    @FXML
    private TextField txtT1;

    @FXML
    private ComboBox<String> cboSD1;

    @FXML
    private ComboBox<String> cboSD2;
    
    @FXML
    private ComboBox<String> cboIS1;

    @FXML
    private ComboBox<String> cboIS2;
    
    @FXML
    private TextField txtIS2;

    @FXML
    private TextField txtIS1;
    
    
    
    
  
    
    // Voice mes liste pour les comboBox, La masse et la longeur et en systeme imperiale et metrique. Les tableau montre les valeur.
    
    
    
    
    // Temp
    private ObservableList<String> listeT=(ObservableList<String>)FXCollections.observableArrayList("Heures (hrs)","Minute (min)", "Seconde (s)", "Miliseconde (ms)");

    double []TabTemp= {1.0,60.0,3600.0,3600000.0};
    
    //Volume
    private ObservableList<String> listeV=(ObservableList<String>)FXCollections.observableArrayList("mètre cube (m3)", "Litre (L)","Mililitre (mL)"); // le metre et le 1

    double []tabVol= {1.0,1000.0,1000000.0,};
    
    //Masse
    private ObservableList<String> liste=(ObservableList<String>)FXCollections.observableArrayList("Tonne (t)","Stone (s)","Kilograme (kg)","Pounds (lbs)","Ounce (Oz)","Grame (g)","Miligrame (Mg)"); // le metre et le 1

    double []tabMasse= {1.0,157.4,1000.0,2204.0,35274.0,1000000.0,1000000000.0};
    
  //Stockage ditigale
    private ObservableList<String> listeSD=(ObservableList<String>)FXCollections.observableArrayList("Terabyte (TB)", "Gigabyte (GB)","Megabyte (MB)","kilobyte (KB)"); // le metre et le 1

    double []tabSD= {1.0,1000.0,1000000.0,1000000000.0};
    
    //Longeur
    private ObservableList<String> listeIS=(ObservableList<String>)FXCollections.observableArrayList("Mile","Kilometre (Km)","Metre (m)","Yard","pied","Centimetre (cm)","pouce"); // le metre et le 1

    double []tabIS= {1.0,1.6,1600.0,1760.0,5280.0,160000.0,63360.0};
    
    @FXML
    void fermer ()
    {
    	System.exit(0);
    }
 //Ouioe
    
    
    
    
    //Dans le public void en dessous, Nous mettons les listes dans les comboboxes
    
    
    

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
	    	//Temp
			cboT1.setItems(listeT);
			cboT2.setItems(listeT);
			cboT1.getSelectionModel().selectFirst();
			cboT2.getSelectionModel().selectFirst();
			
			//Volume
			cboV1.setItems(listeV);
			cboV2.setItems(listeV);
			cboV1.getSelectionModel().select(2);
			cboV2.getSelectionModel().select(2);
			
	    	//Masse
			cboM1.setItems(liste);
			cboM2.setItems(liste);
			cboM1.getSelectionModel().selectFirst();
			cboM2.getSelectionModel().select(1);
			
			
			//Storage Digitale
			cboSD1.setItems(listeSD);
			cboSD2.setItems(listeSD);
			cboSD1.getSelectionModel().selectFirst();
			cboSD2.getSelectionModel().selectFirst();
			
			//Longeur
			cboIS1.setItems(listeIS);
			cboIS2.setItems(listeIS);
			cboIS1.getSelectionModel().select(5);
			cboIS2.getSelectionModel().select(6);	
		}
	
	
	
	
	
	
	//Ci-dessous, nous appliquons la méthode de conversion à chaque variable.
	
	
		
	//Pour le Temp
		@FXML
		void calculerT1()
		{
			convertir(txtT1,txtT2,cboT1,cboT2,TabTemp);
		}
		
		@FXML
		void calculerT2()
		{
			convertir(txtT2,txtT1,cboT2,cboT1,TabTemp);
		}
		
		
		
		//Pour le Volume
		
		@FXML
		void calculerV1()
		{
			convertir(txtV1,txtV2,cboV1,cboV2,tabVol);
		}
		
		@FXML
		void calculerV2()
		{
			convertir(txtV2,txtV1,cboV2,cboV1,tabVol);
		}
		
		//Pour la masse
		@FXML
		void calculerM1()
		{
			convertir(txtM1,txtM2,cboM1,cboM2,tabMasse);
		}
		
		@FXML
		void calculerM2()
		{
			convertir(txtM2,txtM1,cboM2,cboM1,tabMasse);
		}
		
		//Pour le Stockage digitale
		
		@FXML
		void calculerSD1()
		{
			convertir(txtSD1,txtSD2,cboSD1,cboSD2,tabSD);
		}
		
		@FXML
		void calculerSD2()
		{
			convertir(txtSD2,txtSD1,cboSD2,cboSD1,tabSD);
		}
		
		//Pour la longeur
		
		@FXML
		void calculerIS1()
		{
			convertir(txtIS1,txtIS2,cboIS1,cboIS2,tabIS);
		}
				
		@FXML
		void calculerIS2()
		{
			convertir(txtIS2,txtIS1,cboIS2,cboIS1,tabIS);
		}
		
		
		
		
		
		
		
		
		// Ici est la method pour la conversion
		
		public void convertir(TextField txtA,TextField txtB,ComboBox BoxA,ComboBox BoxB,double [] tab)
		{
			verifNum(txtA);
			
			int item1=BoxA.getSelectionModel().getSelectedIndex();
			int item2=BoxB.getSelectionModel().getSelectedIndex();
			try
			{
			double taux=tab[item2]/tab[item1]; 					//  C'est une equation de proportionalité
			double res=taux * (Double.parseDouble(txtA.getText()));
			//txtB.setText(String.format("%.2f", res));
			txtB.setText(Double.toString(res)); // Cette ligne vous permet de voir les decimale
			}
			catch (NumberFormatException e)
			{
				txtA.setText("0");
			}
		}
		
		
		
		
		// Cette méthode vous permet seulement. toimput des nombres et des points décimaux.
		
		public void verifNum(TextField a)
		{
			if(a.getText().equals("")) a.setText("0");
			
			a.textProperty().addListener((observable,oldValue,newValue)->
			{
				if(!newValue.matches("^[0-9](\\.[0-9]+)?$"))
				{
					a.setText(newValue.replaceAll("[^\\d*\\.]",""));
				}
				
			});
			
			
		}
		

	}


