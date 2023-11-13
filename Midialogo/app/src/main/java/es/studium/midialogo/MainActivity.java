package es.studium.midialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    DialogoNuevo dialogoNuevo;
    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBoton = findViewById(R.id.btnBoton);
        btnBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        dialogoNuevo = new DialogoNuevo();
        dialogoNuevo.show(getSupportFragmentManager(), "Nuevo Diálogo");
    }
}