package hhhh;

import java.io.IOException;
import java.util.Date;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class First extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane myGridPane = new GridPane();
        myGridPane.setHgap(15);
        myGridPane.setVgap(20);
        myGridPane.setPadding(new Insets(30));


        
        Label labelName=new Label("Patient Name: ");
        myGridPane.add(labelName, 0, 0); 
        Label labelOfDateBirth=new Label("date of birth: ");
        myGridPane.add(labelOfDateBirth, 0, 1); 
        Label labelOfGender=new Label("Gender:");
        myGridPane.add(labelOfGender,0, 2);
        Label labelOfHasIncident=new Label("Has Incident:");
        myGridPane.add(labelOfHasIncident,0, 3);
        Label labelOfCity=new Label("city:");
        myGridPane.add(labelOfCity,0, 4);
        Label labelOfOccupation=new Label("occupation:");
        myGridPane.add(labelOfOccupation,0, 5);
        Label labelClinic=new Label("Clinic: ");
        myGridPane.add(labelClinic, 4, 0);
        Label labeLocation=new Label("location: ");
        myGridPane.add(labeLocation, 4, 1);
        Label labelOfTelephone=new Label("telephone: ");
        myGridPane.add(labelOfTelephone, 4, 2);
        Label labelOfDateVisit=new Label("date of visit: ");
        myGridPane.add(labelOfDateVisit, 4, 3); 
        Label labelOfSymptoms=new Label("symptoms: ");
        myGridPane.add(labelOfSymptoms, 4, 4); 
        Label labelOfDiagnosis=new Label("Diagnosis: ");
        myGridPane.add(labelOfDiagnosis, 4, 5); 
        Label labelOfSeverity=new Label("severity: ");
        myGridPane.add(labelOfSeverity, 4, 6); 
        Label labelOfbodyPart=new Label("bodyPart: ");
        myGridPane.add(labelOfbodyPart, 4, 7); 



        // create patient fields
        TextField textName = new TextField();
        textName.setPromptText("Enter Name...");
        DatePicker dateOfBirthPicker = new DatePicker();
        dateOfBirthPicker.setPrefWidth(200);
        myGridPane.add(dateOfBirthPicker, 1, 1);
        TextField textCity = new TextField();
        textCity.setPromptText("Enter City...");
        TextField textOccupation = new TextField();
        textOccupation.setPromptText("Enter occupation...");
        CheckBox hasInsurance = new CheckBox();
        
        RadioButton male = new RadioButton("male");
        RadioButton female = new RadioButton("female");
        ToggleGroup typesOfGender = new ToggleGroup();
        male.setToggleGroup(typesOfGender);
        female.setToggleGroup(typesOfGender);

        HBox genderBox = new HBox(10);
        genderBox.getChildren().addAll(male, female);

        myGridPane.add(genderBox, 1, 2);
 


      
        myGridPane.add(textName, 1, 0);
        myGridPane.add(textCity, 1, 4);
        myGridPane.add(textOccupation, 1, 5);
        myGridPane.add(hasInsurance, 1, 3);

        //  create clinic fields
        TextField textClinic = new TextField();
        textClinic.setPromptText("Enter name of clinic...");
        TextField textLocation = new TextField();
        textLocation.setPromptText("Enter the location...");
        TextField textTelephone = new TextField();
        textTelephone.setPromptText("Enter the telephone..");
        

        
        

        myGridPane.add(textClinic, 5, 0);
        myGridPane.add(textLocation, 5, 1);
        myGridPane.add(textTelephone, 5, 2);

        // create Visit / Incident fields
        TextField textSymptoms = new TextField();
        textSymptoms.setPromptText("Enter visit...");
        TextField textDiagnosis = new TextField();
        textDiagnosis.setPromptText("Enter diagnosis...");
        DatePicker dateOfVisitPicker = new DatePicker();
        dateOfVisitPicker.setPrefWidth(200);
        myGridPane.add(dateOfVisitPicker, 5, 3);


        
        ComboBox<String> severity = new ComboBox<>();
        severity.setItems(FXCollections.observableArrayList("Mild", "Moderate", "Severe", "Critical"));
        severity.setPrefSize(textName.getPrefWidth(), textName.getPrefHeight());
        severity.setPrefWidth(200);
        

        ComboBox<String> bodyPart = new ComboBox<>();
        bodyPart.setItems(FXCollections.observableArrayList("Head", "Arm", "Leg", "Chest", "Back"));
        bodyPart.setPrefWidth(200);

        
        myGridPane.add(textSymptoms, 5, 4);
        myGridPane.add(textDiagnosis, 5, 5);
        myGridPane.add(severity, 5, 6);
        myGridPane.add(bodyPart, 5, 7);



        // create buttons
        Button save = new Button("Save");
        Button clear = new Button("Clear");
        clear.setOnAction(e -> {

            // clear all fields
            textName.clear();
            
            textCity.clear();
            textOccupation.clear();
            textClinic.clear();
            textLocation.clear();
            textTelephone.clear();
            textSymptoms.clear();
            textDiagnosis.clear();

           
            typesOfGender.selectToggle(null);

            severity.setValue(null);
            bodyPart.setValue(null);

           
            hasInsurance.setSelected(false);
            
            dateOfBirthPicker.setValue(null);
            dateOfVisitPicker.setValue(null);
        });


        myGridPane.add(save, 4, 10);
        myGridPane.add(clear, 5, 10);

        // validation on save buttons
        save.setOnAction(e -> {
        	
            

            if (textName.getText().isEmpty() || typesOfGender.getSelectedToggle()==null||dateOfBirthPicker.getValue() == null
            	||dateOfVisitPicker.getValue() == null||textCity.getText().isEmpty() ||
            	textOccupation.getText().isEmpty() ||textClinic.getText().isEmpty() ||
                textLocation.getText().isEmpty() || textTelephone.getText().isEmpty() ||textSymptoms.getText().isEmpty() 
                ||textDiagnosis.getText().isEmpty() ||severity.getValue() == null || bodyPart.getValue() == null )
                {
                note("all feilds are required");
                return;    
            }
            
            
            Date dateOfBirth = java.sql.Date.valueOf(dateOfBirthPicker.getValue());
            Date dateOfVisit = java.sql.Date.valueOf(dateOfVisitPicker.getValue());
            
             
            int telephone;

            try {
                telephone = Integer.parseInt(textTelephone.getText());

                if (telephone < 0) {
                    note("Telephone must not be negative");
                    return;
                }

            } catch (NumberFormatException ex) {
                note("Telephone must contain numbers only");
                return;
            }

            String genderValue =((RadioButton) typesOfGender.getSelectedToggle()).getText();

            Patient patient = new Patient(textName.getText(),dateOfBirth,  genderValue, textCity.getText(), textOccupation.getText(),hasInsurance.isSelected());

            Clinic clinic = new Clinic(textClinic.getText(),textLocation.getText(), textTelephone.getText());

            Incident incident = new Incident( dateOfVisit,textSymptoms.getText(),textDiagnosis.getText(), clinic,severity.getValue(), bodyPart.getValue());

            patient.addVisit(incident);

            try {
                FileManager.savePatientVisit(patient);
                new Alert(Alert.AlertType.INFORMATION, "Saved Successfully").show();
            } catch (IOException ex) {
                note("Error saving data");
            }
        });

        Scene scene = new Scene(myGridPane, 900, 500);
        primaryStage.setTitle("clinic system"); 
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    

    private void note(String masseage) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("");
        a.setContentText(masseage);
        a.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
