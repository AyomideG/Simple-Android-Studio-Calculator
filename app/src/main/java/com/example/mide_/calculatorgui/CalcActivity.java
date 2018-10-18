package com.example.mide_.calculatorgui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class CalcActivity extends AppCompatActivity {


    Button btnClear;
    TextView screen, screen2;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnMultiply, btnMinus, btnPlus, btnDivide, btnDecimal, btnBack, btnSmallBracket, btnEqual, btnPercentage;

    Boolean isSmallBracketOpen;
    int developedCounter;

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        isSmallBracketOpen = false;
        developedCounter = 0;

        btnClear = (Button) findViewById(R.id.bt_clear);
        screen = (TextView) findViewById(R.id.text_main);
        screen2 = (TextView) findViewById(R.id.text_main2);

        screen.setText("");
        screen2.setText("");

        btnOne = (Button) findViewById(R.id.bt_one);
        btnTwo = (Button) findViewById(R.id.bt_two);
        btnThree = (Button) findViewById(R.id.bt_three);
        btnFour = (Button) findViewById(R.id.bt_four);
        btnFive = (Button) findViewById(R.id.bt_five);
        btnSix = (Button) findViewById(R.id.bt_six);
        btnSeven = (Button) findViewById(R.id.bt_seven);
        btnEight = (Button) findViewById(R.id.bt_eight);
        btnNine = (Button) findViewById(R.id.bt_nine);
        btnZero = (Button) findViewById(R.id.bt_zero);


        btnMultiply = (Button) findViewById(R.id.bt_multiply);
        btnMinus = (Button) findViewById(R.id.bt_minus);
        btnPlus = (Button) findViewById(R.id.bt_plus);
        btnDivide = (Button) findViewById(R.id.bt_divide);

        btnDecimal = (Button)findViewById(R.id.bt_dot);
        btnBack = (Button)findViewById(R.id.bt_back);

        btnSmallBracket = (Button)findViewById(R.id.bt_small_bracket);
        btnEqual = (Button) findViewById(R.id.bt_equal);
        btnPercentage = (Button) findViewById(R.id.bt_percentage);

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                developedCounter++;
                if(developedCounter >= 5){
                    developedCounter=0;
                    screen.setText("Ayo");
                    screen2.setText("Simple Calculator");
                }else{
                    screen.setText("");
                    screen2.setText("");
                }
            }
        });



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "0");
            }
        });


        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "×");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "-");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "÷");
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + ".");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                if(str.length() > 0){
                    str = str.substring(0, str.length()-1);
                    screen.setText(str);
                }else{
                    screen2.setText("");
                }
            }
        });
        btnSmallBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                if(isSmallBracketOpen){
                    str = screen.getText().toString();
                    screen.setText(str + ")");
                    isSmallBracketOpen = false;
                }else{
                    str = screen.getText().toString();
                    screen.setText(str + "(");
                    isSmallBracketOpen = true;
                }
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();
                screen.setText(str + "%");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                str = screen.getText().toString();

                str = str.replaceAll("×", "*");
                str = str.replaceAll("÷", "/");
                str = str.replaceAll("%", "/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";

                try{
                    Scriptable scope = rhino.initStandardObjects();
                    result = rhino.evaluateString(scope, str, "JavaScript", 1, null).toString();
                }catch (Exception e){
                    result = "Error";
                }

                screen2.setText(result);
            }
        });
    }

    public void clearScreen(){
        str = screen.getText().toString();
        if(str.contains("Ayo")){
            screen.setText("");
            screen2.setText("");
        }
        developedCounter = 0;
    }
}
