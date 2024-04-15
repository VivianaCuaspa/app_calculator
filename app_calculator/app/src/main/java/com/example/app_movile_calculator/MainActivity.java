package com.example.app_movile_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonPoint, buttonPlus, buttonSubtract, buttonDivide, buttonMultiply, buttonEquals, buttonAC, buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText
        textView = findViewById(R.id.textScreen);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonAC = findViewById(R.id.buttonAC);
        buttonC = findViewById(R.id.buttonClear);

    }

    public void onClickButton0(View v) {
        textView.setText(textView.getText() + "0");
    }
    //hacer de todos los botones
    public void onClickButton1(View v) {
        textView.setText(textView.getText() + "1");
    }

    public void onClickButton2(View v) {
        textView.setText(textView.getText() + "2");
    }

    public void onClickButton3(View v) {
        textView.setText(textView.getText() + "3");
    }

    public void onClickButton4(View v) {
        textView.setText(textView.getText() + "4");
    }

    public void onClickButton5(View v) {
        textView.setText(textView.getText() + "5");
    }

    public void onClickButton6(View v) {
        textView.setText(textView.getText() + "6");
    }

    public void onClickButton7(View v) {
        textView.setText(textView.getText() + "7");
    }

    public void onClickButton8(View v) {
        textView.setText(textView.getText() + "8");
    }

    public void onClickButton9(View v) {
        textView.setText(textView.getText() + "9");
    }

    public void onClickButtonPoint(View v) {
        textView.setText(textView.getText() + ".");
    }

    public void onClickButtonPlus(View v) {
        textView.setText(textView.getText() + "+");
    }

    public void onClickButtonSubtract(View v) {
        textView.setText(textView.getText() + "-");
    }

    public void onClickButtonDivide(View v) {
        textView.setText(textView.getText() + "/");
    }

    public void onClickButtonMultiply(View v) {
        textView.setText(textView.getText() + "*");
    }
    public void onClickButtonAC(View v) {
        textView.setText("");
    }
    public void onClickButtonC(View v) {
        String operation = textView.getText().toString();
        if (operation.length() > 0) {
            operation = operation.substring(0, operation.length() - 1);
            textView.setText(operation);
        }
    }

    public void onClickButtonEquals(View v) {
        String operation = textView.getText().toString();
        double result = 0;
        if (operation.contains("+")) {
            String[] parts = operation.split("\\+");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            result = num1 + num2;
        } else if (operation.contains("-")) {
            String[] parts = operation.split("-");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            result = num1 - num2;
        } else if (operation.contains("*")) {
            String[] parts = operation.split("\\*");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            result = num1 * num2;
        } else if (operation.contains("/")) {
            String[] parts = operation.split("/");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                textView.setText("Error: Division by zero");
                return;
            }
        }
        textView.setText(String.valueOf(result));
    }

}