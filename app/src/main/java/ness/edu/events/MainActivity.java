package ness.edu.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //define properties:
    //Button btnPlus;
    //Button btnMinus;
    private TextView tvResult;
    //in activities / controllers the properties are the controls.
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewById.
        tvResult = (TextView) findViewById(R.id.tvResult);
        setTvResult();
    }

    private void setTvResult() {
        tvResult.setText(String.valueOf(counter));
    }


    public void btnMinusClicked(View view) {
        counter--;
        setTvResult();
    }

    public void btnPlusClicked(View view) {
        counter++;
        setTvResult();
    }
}
