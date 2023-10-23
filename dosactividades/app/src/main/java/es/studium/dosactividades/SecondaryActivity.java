package es.studium.dosactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        setContentView(R.layout.activity_main);
    }
}