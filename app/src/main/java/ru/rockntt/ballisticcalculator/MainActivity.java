package ru.rockntt.ballisticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText distance_x;
    Button calculate_button;
    TextView result;

    static Float calculated_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        distance_x = (EditText) findViewById(R.id.distance);
        calculate_button = (Button) findViewById(R.id.calculate_button);
        result = (TextView) findViewById(R.id.result);
    }

    public void onClick(View v){
        float distance_num = distance_x.getText();
        calculated_result = 2 * distance_num;
        result.setText(calculated_result);
    }
}


