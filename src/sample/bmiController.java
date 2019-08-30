package sample;




import javafx.fxml.FXML;
import javafx.scene.control.*;


public class bmiController {


    @FXML
    ToggleGroup gender;
    public TextField uheight;
    public TextField uweight;
    public TextField uage;


    public Label l1;
    public Label l2;

    public void calculatebmi() {
        double height;
        double weight;
        double age;
        double bmi;

        RadioButton selectedRadioButton = (RadioButton)gender.getSelectedToggle();
        String toogleGroupValue = selectedRadioButton.getText();
        age = Double.parseDouble(uage.getText());
        height = Double.parseDouble(uheight.getText());
        weight = Double.parseDouble(uweight.getText());
        bmi = height * height;
        bmi = weight / bmi;
        String m = "Man";
        String f = "Woman";
        String g = "Girl";
        String b = "Boy";

        l1.setText("Your calculated BMI is " + bmi );

        if (toogleGroupValue.equals(m) && (age >= 20))
        {
            if (bmi < 18.5) {
                l2.setText("You are underweight " + toogleGroupValue);
            } else if (bmi >= 18.5 && bmi < 25) {
                l2.setText("You have a normal weight " + toogleGroupValue);
            } else if (bmi > 25 && bmi < 30) {
                l2.setText("You are Overweight " + toogleGroupValue);
            } else {
                l2.setText("you are Obese " + toogleGroupValue);
            }
        }
        else if (toogleGroupValue.equals(f) && age >= 20) {
            {
                if (bmi < 18.5) {
                    l2.setText("You are underweight " + toogleGroupValue);
                } else if (bmi >= 18.5 && bmi <= 25) {
                    l2.setText("You have a normal weight " + toogleGroupValue);
                } else if (bmi > 25 && bmi < 30) {
                    l2.setText("You are Overweight " + toogleGroupValue);
                } else {
                    l2.setText("you are Obese " + toogleGroupValue);
                }
            }

        }
        else if (toogleGroupValue.equals(g) && age < 20) {
            if ((bmi <= 14 && age < 5 && age >= 2) ||
                    (bmi <= 13.5 && age >= 5 && age < 9) ||
                    (bmi <= 14 && age >= 9 && age < 12) ||
                    (bmi <= 15 && age >= 12 && age < 14) ||
                    (bmi <= 16 && age >= 14 && age < 16) ||
                    (bmi <= 17 && age >= 16 && age < 19) ||
                    (bmi <= 18 && age >= 19 && age <= 20)) {
                l2.setText("You are underweight " + toogleGroupValue);
            } else if ((bmi > 14 && bmi < 18 && age <= 3 && age >= 2) ||
                    (bmi > 14 && bmi < 17 && age > 3 && age <= 4)
                    || (bmi > 13.5 && bmi <= 16.5 && age > 4 && age <= 5) ||
                    (bmi > 13.5 && bmi <= 17 && age > 5 && age <= 6) ||
                    (bmi > 13.5 && bmi <= 18 && age > 6 && age <= 8)
                    || (bmi > 14 && bmi <= 19 && age > 8 && age <= 9)
                    || (bmi > 14 && bmi <= 20 && age > 9 && age <= 10) ||
                    (bmi > 14 && bmi <= 21 && age > 10 && age <= 11)
                    || (bmi > 15 && bmi <= 22 && age > 11 && age <= 12)
                    || (bmi > 15 && bmi <= 22.5 && age > 12 && age <= 13) ||
                    (bmi > 16 && bmi <= 23.5 && age > 13 && age <= 14)
                    || (bmi > 16 && bmi <= 24 && age > 14 && age <= 15)
                    || (bmi > 17 && bmi <= 24.5 && age > 15 && age <= 16) ||
                    (bmi > 17 && bmi <= 25 && age > 16 && age <= 17)
                    || (bmi > 17 && bmi <= 26 && age > 17 && age <= 18)
                    || (bmi > 18 && bmi <= 26 && age > 18 && age <= 20)) {
                l2.setText("You have a healthy weight " + toogleGroupValue);
            } else if ((bmi >= 18 && age >= 2 && age < 3) ||
                    (bmi >= 17 && age >= 3 && age < 4) ||
                    (bmi > 16.5 && age >= 4 && age < 6) ||
                    (bmi > 17 && age >= 6 && age < 7)
                    || (bmi > 18 && age >= 7 && age < 9)
                    || (bmi > 19 && age >= 9 && age < 10)
                    || (bmi > 20 && age >= 10 && age < 11)
                    || (bmi > 21 && age >= 11 && age < 12)
                    || (bmi > 22 && age >= 12 && age < 13)
                    || (bmi > 22.5 && age >= 13 && age < 14)
                    || (bmi > 23.5 && age >= 14 && age < 15)
                    || (bmi > 24 && age >= 15 && age < 16)
                    || (bmi > 24.5 && age >= 16 && age < 17)
                    || (bmi > 25 && age >= 17 && age < 18)
                    || (bmi > 26 && age >= 18 && age <= 20)) {
                l2.setText("You have a over weight " + toogleGroupValue);
            } else {
                l2.setText("you are obese " + toogleGroupValue);
            }
        } else if (toogleGroupValue.equals(b) && age < 20) {
            if ((bmi <= 14.3 && age >= 2 && age < 4) ||
                    (bmi <= 14 && age >= 4 && age < 11) ||
                    (bmi <= 15 && age >= 11 && age < 13) ||
                    (bmi <= 15.5 && age >= 13 && age < 14)
                    || (bmi <= 16 && age >= 14 && age < 15) ||
                    (bmi <= 16.5 && age >= 15 && age < 16) ||
                    (bmi < 17 && age >= 16 && age < 17) ||
                    (bmi <= 18 && age >= 17 && age < 19)
                    || (bmi <= 18.5 && age >= 19 && age <= 20)) {
                l2.setText("You are underweight " + toogleGroupValue);
            } else if ((bmi > 14.3 && bmi <= 18 && age >= 2 && age < 2) ||
                    (bmi > 14.3 && bmi <= 17.5 && age >= 2 && age < 3) ||
                    (bmi > 14 && bmi <= 17 && age >= 3 && age < 6)
                    || (bmi > 14 && bmi <= 17.5 && age >= 3 && age < 8) ||
                    (bmi > 14 && bmi <= 18 && age >= 3 && age < 10) ||
                    (bmi > 14 && bmi <= 19 && age > 8 && age < 11) ||
                    (bmi > 15 && bmi <= 20 && age >= 11 && age < 12) ||
                    (bmi > 15 && bmi <= 21 && age >= 12 && age < 13) ||
                    (bmi > 15.5 && bmi <= 22 && age >= 13 && age < 14)
                    || (bmi > 16 && bmi <= 22.5 && age >= 14 && age < 15) ||
                    (bmi > 16.5 && bmi <= 23.5 && age >= 15 && age < 16) ||
                    (bmi > 17 && bmi <= 24 && age >= 16 && age < 17)
                    || (bmi > 18 && bmi <= 25 && age >= 17 && age < 18) ||
                    (bmi > 18 && bmi <= 26 && age >= 18 && age < 19) ||
                    (bmi > 18.5 && bmi <= 26 && age >= 19 && age <= 20)) {
                l2.setText("You have a Healthy Weight " + toogleGroupValue);
            } else if ((bmi > 18 && age >= 2 && age < 3) ||
                    (bmi > 17.5 && age >= 3 && age < 4) ||
                    (bmi > 17 && age >= 4 && age < 7) ||
                    (bmi > 17.5 && age >= 7 && age < 8) ||
                    (bmi > 18 && age >= 8 && age < 10) ||
                    (bmi > 19 && age >= 10 && age < 11) ||
                    (bmi > 20 && age >= 11 && age < 12) ||
                    (bmi > 21 && age >= 12 && age < 13) ||
                    (bmi > 22 && age >= 13 && age < 14) ||
                    (bmi > 22.5 && age >= 14 && age < 15) ||
                    (bmi > 23.5 && age >= 15 && age < 16) ||
                    (bmi > 24 && age >= 16 && age < 17) ||
                    (bmi > 25 && age >= 17 && age < 18) ||
                    (bmi > 26 && age >= 18 && age < 19) ||
                    (bmi > 27 && age <= 20)) {
                l2.setText("You Are Over Weight " + toogleGroupValue);
            } else {
                l2.setText("you are obese " + toogleGroupValue);
            }


        }else{l2.setText("You made a wrong choice");
            l1.setText("You made a wrong choice");}


    }
    }



