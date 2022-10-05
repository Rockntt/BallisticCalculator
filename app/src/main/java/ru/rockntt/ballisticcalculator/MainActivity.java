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
            int distance_int = Integer.parseInt(distance_x.getText().toString());
            int calculated_result = distance_int + 1;
            String result_str = "" + calculated_result;
            result.setText(result_str);
        };

        calculate_button.setOnClickListener(cButtonClick);
    }
}
