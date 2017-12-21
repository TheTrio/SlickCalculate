package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label display;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton five;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton minus;

    @FXML
    private JFXButton plus;

    @FXML
    private JFXButton plus_minus;

    @FXML
    private JFXButton dot;

    @FXML
    private JFXButton calculate;

    @FXML
    private JFXButton divide;

    @FXML
    private JFXButton multiply, exp;

    @FXML
    private JFXButton sqrt;

    @FXML
    private Label output;

    private char operator;
    private boolean flag = true;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setText("0");
        dot.setOnAction(e -> dotAction());
        plus_minus.setOnAction(e -> plus_minusAction());
        one.getParent().setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case ESCAPE:
                    output.setText("");
                    display.setText("0");
                    flag = true;
                    break;
                case DIGIT1:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "1");
                    break;
                case DIGIT2:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "2");
                    break;
                case DIGIT3:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "3");
                    break;
                case DIGIT4:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "4");
                    break;
                case DIGIT5:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "5");
                    break;
                case DIGIT6:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "6");
                    break;
                case DIGIT7:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "7");
                    break;
                case DIGIT8:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "8");
                    break;
                case DIGIT9:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "9");
                    break;
                case DIGIT0:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "0");
                    break;
                case NUMPAD1:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "1");
                    break;
                case NUMPAD2:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "2");
                    break;
                case NUMPAD3:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "3");
                    break;
                case NUMPAD4:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "4");
                    break;
                case NUMPAD5:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "5");
                    break;
                case NUMPAD6:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "6");
                    break;
                case NUMPAD7:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "7");
                    break;
                case NUMPAD8:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "8");
                    break;
                case NUMPAD9:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "9");
                    break;
                case NUMPAD0:
                    if (!display.getText().equals("Overflow"))
                        display.setText(display.getText() + "0");
                    break;
                case ADD:
                    addAction();
                    break;
                case MULTIPLY:
                    multiplyAction();
                    break;
                case SUBTRACT:
                    minusAction();
                    break;
                case DIVIDE:
                    divideAction();
                    break;
                case ENTER:
                    calculateAction();
                    break;
                case BACK_SPACE:
                    if (display.getText().equals("Overflow"))
                        e.consume();
                    else if (display.getText().length() == 1)
                        display.setText("0");
                    else
                        display.setText(display.getText().substring(0, display.getText().length() - 1));
                    break;
                case M:
                    plus_minusAction();
                    break;
                case PERIOD:
                case DECIMAL:
                    dotAction();
                    break;
            }
        });
        exp.setOnAction(e -> expAction());
        one.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "1");
        });
        two.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "2");
        });

        three.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "3");
        });

        four.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "4");
        });

        five.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "5");
        });
        six.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "6");
        });

        seven.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "7");
        });
        eight.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "8");
        });
        nine.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "9");
        });
        zero.setOnAction(e -> {
            if (!display.getText().equals("Overflow"))
                display.setText(display.getText() + "0");
        });

        multiply.setOnAction(e -> multiplyAction());

        plus.setOnAction(e -> addAction());
        divide.setOnAction(e -> divideAction());

        minus.setOnAction(e -> minusAction());

        calculate.setOnAction(e -> calculateAction());
        sqrt.setOnAction(e -> {
            display.setText(Math.sqrt(Double.parseDouble(display.getText())) + "");
            flag = true;
        });

        display.textProperty().addListener((org, oldValue, newValue) -> {
            if (newValue.matches("(-)?\\d+\\.0")) {
                System.out.println(newValue);
                System.out.println("Matched");
                display.setText((newValue.replaceAll("(\\d+?)\\.0", "$1")));
            } else if (newValue.startsWith("0") && !newValue.equals("0")) {
                System.out.println("Called");
                display.setText(newValue.substring(1));
            }else if (flag) {
                display.setText(newValue.replace(oldValue, ""));
                flag = false;
            } else if (newValue.length() > 25) {
                display.setText("Overflow");
            }
        });
    }

    private void dotAction() {
        if (flag) {
            display.setText("0.");
        } else {
            display.setText(display.getText() + ".");
        }
    }

    private void plus_minusAction() {
        double d = Double.parseDouble(display.getText());
        d = d * -1;
        display.setText(d + "");
    }

    private void expAction() {
        boolean b = check();
        if (!checkOperator()) {
            double result = calculateAction();
            output.setText(result + " ^ ");
            operator = '^';
            display.setText("");
        } else if (b) {
            output.setText(display.getText() + " ^ ");
            operator = '^';
            display.setText("");
        } else {
            output.setText(output.getText().trim());
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            output.setText(output.getText().trim());
            output.setText(output.getText() + " ^ ");
            display.setText("");
            operator = '^';

        }
    }

    private double calculateAction() {
        try {
            switch (operator) {
                case '*':
                    System.out.println("Multiplied");
                    display.setText(Double.parseDouble(output.getText().replace(" x ", "")) * Double.parseDouble(display.getText()) + "");
                    output.setText("");
                    operator = '\0';
                    break;
                case '+':
                    System.out.println("Added");
                    display.setText(Double.parseDouble(output.getText().replace(" + ", "")) + Double.parseDouble(display.getText()) + "");
                    output.setText("");
                    operator = '\0';
                    break;
                case '/':
                    System.out.println("Divided");
                    display.setText(Double.parseDouble(output.getText().replace(" / ", "")) / Double.parseDouble(display.getText()) + "");
                    output.setText("");
                    operator = '\0';
                    break;
                case '-':
                    System.out.println("subtracted");
                    display.setText(Double.parseDouble(output.getText().replace(" - ", "")) - Double.parseDouble(display.getText()) + "");
                    output.setText("");
                    operator = '\0';
                    break;
                case '^':
                    System.out.println("Power");
                    double arg1 = Double.parseDouble(output.getText().replace(" ^ ", ""));
                    double arg2 = Double.parseDouble(display.getText());
                    double result;
                    if(arg2 < 0){
                        result = Math.pow(arg1, 1/(arg2*-1));
                    }else{
                        result = Math.pow(arg1, arg2);
                    }
                    output.setText("");
                    display.setText(result + "");
                    operator = '\0';
                    break;

            }
            flag = true;
        } catch (NumberFormatException f) {
            output.setText("");
            display.setText("Malformed Expression");
        }
        return Double.parseDouble(display.getText());

    }

    private void divideAction() {
        boolean b = check();
        if (!checkOperator()) {
            double result = calculateAction();
            output.setText(result + " / ");
            operator = '/';
            display.setText("");
        } else if (b) {
            output.setText(display.getText() + " / ");
            operator = '/';
            display.setText("");
        } else {
            output.setText(output.getText().trim());
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            output.setText(output.getText().trim());
            output.setText(output.getText() + " / ");
            display.setText("");
            operator = '/';

        }
    }

    private boolean checkOperator() {
        return display.getText().isEmpty() || output.getText().isEmpty();
    }

    private void minusAction() {
        boolean b = check();
        if (!checkOperator()) {
            double result = calculateAction();
            output.setText(result + " - ");
            operator = '-';
            display.setText("");
        } else if (b) {
            output.setText(display.getText() + " - ");
            operator = '-';
            display.setText("");
        } else {
            output.setText(output.getText().trim());
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            output.setText(output.getText().trim());
            output.setText(output.getText() + " - ");
            display.setText("");
            operator = '-';

        }
    }

    private void multiplyAction() {
        boolean b = check();
        if (!checkOperator()) {
            double result;
            result = calculateAction();
            output.setText(result + " x ");
            operator = '*';
            display.setText("");
        } else if (b) {
            output.setText(display.getText() + " x ");
            operator = '*';
            display.setText("");
        } else {
            output.setText(output.getText().trim());
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            output.setText(output.getText().trim());
            output.setText(output.getText() + " x ");
            display.setText("");
            operator = '*';

        }
    }

    private void addAction() {
        boolean b = check();
        if (!checkOperator()) {
            double result = calculateAction();
            output.setText(result + " + ");
            operator = '+';
            display.setText("");
        } else if (b) {
            output.setText(display.getText() + " + ");
            operator = '+';
            display.setText("");
        } else {
            output.setText(output.getText().trim());
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            output.setText(output.getText().trim());
            output.setText(output.getText() + " + ");
            display.setText("");
            operator = '+';
        }
    }

    private boolean check() {
        boolean b = true;
        for (int i = 0; i < output.getText().length(); i++) {
            if (output.getText().charAt(i) == '+' || output.getText().charAt(i) == '-' || output.getText().charAt(i) == '/' || output.getText().charAt(i) == 'x') {
                b = false;
            }
        }
        return b;
    }

    @FXML
    void hoverOver(MouseEvent event) {
        JFXButton clicked = (JFXButton) event.getSource();
        clicked.setStyle("-fx-background-color: #9dffd2");
    }

    @FXML
    void hoverOut(MouseEvent event) {
        JFXButton clicked = (JFXButton) event.getSource();
        clicked.setStyle("-fx-background-color: #35FFD3");
    }

    @FXML
    void operatorIn(MouseEvent event) {
        JFXButton clicked = (JFXButton) event.getSource();
        clicked.setStyle("-fx-background-color: #fcff83");
    }

    @FXML
    void operatorOut(MouseEvent event) {
        JFXButton clicked = (JFXButton) event.getSource();
        clicked.setStyle("-fx-background-color: #fff54c");
    }
    @FXML
    void dragIn(DragEvent event) {
        System.out.println(event.getDragboard().getFiles().size());
    }

    @FXML
    void othersIn(MouseEvent event){
        JFXButton button = (JFXButton) event.getSource();
        button.setStyle("-fx-background-color:  #8bff82");
    }

    @FXML
    void othersOut(MouseEvent event){
        JFXButton button = (JFXButton) event.getSource();
        button.setStyle("-fx-background-color:  #32FF42");
    }
}