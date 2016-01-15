package comaladdinofatl.github.currencyconverter;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {


    public void convert(View view) {

        EditText dollarField = (EditText) findViewById(R.id.dollarField);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double poundAmount = dollarAmount * 0.69;

        Log.i("dollarField", poundAmount.toString());
        Toast.makeText(getApplicationContext(), poundAmount.toString() + " GPB", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }


}
