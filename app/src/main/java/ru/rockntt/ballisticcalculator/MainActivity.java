package ru.rockntt.ballisticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText distance_x;
    Button calculate_button;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        distance_x = findViewById(R.id.distance);
        calculate_button = findViewById(R.id.calculate_button);
        result = findViewById(R.id.result);
        View.OnClickListener cButtonClick = v -> {
            double distance = Double.parseDouble(distance_x.getText().toString());
            double mortar_v = 36.8;
            double calculated_result = Math.asin(distance * 9.8 / (mortar_v * mortar_v)) * 57;
            int cal_res_int = (int) calculated_result;
            String result_str = "" + cal_res_int;
            result.setText(result_str);
        };

        calculate_button.setOnClickListener(cButtonClick);
    }
}
