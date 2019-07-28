package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first_number, second_number;
    Button plus, minus, multiply, divide, allClear;
    TextView txtAnswer;

    String first_no, second_no;

    double answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_number = findViewById(R.id.first_number);
        second_number = findViewById(R.id.second_number);
        txtAnswer = findViewById(R.id.txtAnswer);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        allClear = findViewById(R.id.allClear);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_no = first_number.getText().toString().trim();
                second_no = second_number.getText().toString().trim();

                if (first_no.isEmpty() || second_no.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please fill any empty fields", Toast.LENGTH_SHORT).show();

                }else{

                    plusNumbers(first_no, second_no);
                    txtAnswer.setText(String.valueOf(answers));
                }



            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_no = first_number.getText().toString().trim();
                second_no = second_number.getText().toString().trim();

                if (first_no.isEmpty() || second_no.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please fill any empty fields", Toast.LENGTH_SHORT).show();

                }else{

                    minusNumbers(first_no, second_no);
                    txtAnswer.setText(String.valueOf(answers));
                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_no = first_number.getText().toString().trim();
                second_no = second_number.getText().toString().trim();

                if (first_no.isEmpty() || second_no.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please fill any empty fields", Toast.LENGTH_SHORT).show();

                }else{

                    multiplyNumbers(first_no, second_no);
                    txtAnswer.setText(String.valueOf(answers));

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_no = first_number.getText().toString();
                second_no = second_number.getText().toString();

                Log.v("Answers", first_no);
                Log.v("Answers", second_no);

                if (first_no.isEmpty() || second_no.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please fill any empty fields", Toast.LENGTH_SHORT).show();
                }else{

                    divideNumbers(first_no, second_no);
                    txtAnswer.setText(String.valueOf(answers));
                }

            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_number.setText("");
                second_number.setText("");
                txtAnswer.setText("Answer");

            }
        });

    }

    public double divideNumbers(String first_no, String second_no) {


        if (Double.valueOf(first_no) > Double.valueOf(second_no)){

            answers = Double.valueOf(first_no) / Double.valueOf(second_no);

        }else{

            answers = Double.valueOf(second_no) / Double.valueOf(first_no);
        }
        return answers;
    }

    public double multiplyNumbers(String first_no, String second_no) {

        answers = Double.valueOf(first_no) * Double.valueOf(second_no);
        return answers;
    }

    public double minusNumbers(String first_no, String second_no) {

        answers = Double.valueOf(first_no) - Double.valueOf(second_no);
        return answers;
    }

    public double plusNumbers(String first_no, String second_no) {

        answers = Double.valueOf(first_no) + Double.valueOf(second_no);
        return answers;
    }
}
