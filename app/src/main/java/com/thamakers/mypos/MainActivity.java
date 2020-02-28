package com.thamakers.mypos;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hola ingenieria de Sistemas ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void convertoPesos(View view){

        EditText dollarText=findViewById(R.id.dollarText);//instancio el campo de text

        TextView mytexvie= findViewById(R.id.textViewPesos);

        if(!dollarText.getText().toString().equals("")){
            Float valorPesos= Float.valueOf((dollarText.getText().toString()));

            Float pesoconversion= valorPesos*3600F;


            mytexvie.setText(pesoconversion.toString());


        }else{

            mytexvie.setText("no hay datos");

        }




    }

    public void convertCurrency(View view) {


        EditText dollarText = findViewById(R.id.dollarText);

        TextView textView = findViewById(R.id.textView);


        if (!dollarText.getText().toString().equals("")) {

            Float dollarValue = Float.valueOf(dollarText.getText().toString());

            Float euroValue = dollarValue * 0.85F;

            textView.setText(euroValue.toString());

        } else {

            textView.setText(R.string.no_value_string);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
