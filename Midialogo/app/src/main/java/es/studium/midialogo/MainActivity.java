package es.studium.midialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnNuevoDialogoListener {

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
        dialogoNuevo.setCancelable(false);
        dialogoNuevo.show(getSupportFragmentManager(), "Nuevo Diálogo");
    }

    @Override
    public void onDialogoGuardarListener() {
        Toast.makeText(this, "Se ha guardado...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDialogoCancelarListener() {
        Toast.makeText(this, "Se ha cancelado...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDateSet(String nombre, String descripcion) {
        Toast.makeText(this, "Datos: " +nombre+ ", " +descripcion, Toast.LENGTH_LONG).show();
    }
}