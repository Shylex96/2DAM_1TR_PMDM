package es.studium.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.textoEvento);
        texto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==(R.id.textoEvento)) {
            Intent intentMain2 = new Intent (this, MainActivity2.class);
            startActivity(intentMain2);
        }
    }
}