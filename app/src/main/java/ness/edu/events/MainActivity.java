package ness.edu.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //define properties:
    RadioGroup rgTemperature;
    TextView tvResult;
    EditText etTemperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_converter);

        rgTemperature = (RadioGroup) findViewById(R.id.rgTemperature);
        tvResult = (TextView) findViewById(R.id.tvResult);
        etTemperature = (EditText) findViewById(R.id.etTemperature);
    }

    public void calculate(View view) {
        try {
            int checkedId = rgTemperature.getCheckedRadioButtonId();

            double result = 0;
            double temp = Double.valueOf(etTemperature.getText().toString());
            if (checkedId == R.id.radioCelcius){
                //°C = (°F  -  32)  x  5/9
                result = (temp - 32) * 5.0/9;
            }else {
                //°F = °C  x  9/5 + 32
                result = temp * 9.0/5 +32;
            }
            tvResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {

        }
    }
}
