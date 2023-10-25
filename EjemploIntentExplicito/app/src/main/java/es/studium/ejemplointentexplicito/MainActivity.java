package es.studium.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto;
    EditText textoParaPasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoParaPasar = findViewById(R.id.textoParaPasar);
        texto = findViewById(R.id.textoEvento);
        texto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == (R.id.textoEvento)) {

            Intent intentMain2 = new Intent(this, MainActivity2.class);
            intentMain2.putExtra("textoParaPasar", textoParaPasar.getText().toString());
            System.out.println("Que estoy pasando: " + textoParaPasar.getText().toString());
            startActivity(intentMain2);
        }
    }
}