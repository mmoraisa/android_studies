package github.com.mmoraisa.study_00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import github.com.mmoraisa.study_00.bo.CalculatorBO;

public class Study extends AppCompatActivity {

    private EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        number1 = (EditText) findViewById(R.id.edtNumber1);
        number2 = (EditText) findViewById(R.id.edtNumber2);
    }

    public void calculate(View v){
        double a = Double.parseDouble(number1.getText().toString());
        double b = Double.parseDouble(number2.getText().toString());

        double result = CalculatorBO.sum(a,b);
        Toast.makeText(this, String.valueOf(result), Toast.LENGTH_LONG).show();
    }
}
