package org.example.interest_calc_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Interest_Button_Controller {

    //Establishing Variables to use from the text field inputs

    @FXML
    private Label welcomeText;

    @FXML
    private TextField Annual_Interest_Rate_Text;

    @FXML
    private TextField Number_of_Years_Text;

    @FXML
    private TextField Loan_Amount_Text;

    //Next four lines may be trash
    @FXML
    private TextField Monthly_Payment_Text;

    @FXML
    private TextField Total_Payment_Text;
    // ^^^^^



    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Your payments are shown above");

        try{
            //collecting information from text boxes

            double TotalInt;
            double MonthInt;
            double AnnInt = Double.parseDouble(Annual_Interest_Rate_Text.getText());
            double NumYearsInt = Double.parseDouble(Number_of_Years_Text.getText());
            double LoanInt = Double.parseDouble(Loan_Amount_Text.getText());

            //Changing Annual interest rate to percentage
            AnnInt = AnnInt/100;

            //getting loan plus interest
            double IntAccrued = LoanInt * AnnInt;

           TotalInt = LoanInt + IntAccrued;

           //finding monthly payment
           MonthInt =  Math.round(TotalInt/(NumYearsInt * 12)) ;



           //Displaying the text for the answer
           Monthly_Payment_Text.setText(""+MonthInt);
           Total_Payment_Text.setText(""+TotalInt);

           System.out.println(TotalInt + " " + MonthInt);

           //Dealing with issues with inputs such as letters
        }catch(RuntimeException e){
            welcomeText.setText("Something went wrong! Only use numbers!");

        }
    }
}