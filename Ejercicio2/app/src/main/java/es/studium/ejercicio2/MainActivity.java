package es.studium.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asociamos nuestro botón con el de la vista
        btnBoton = findViewById(R.id.button);
        // Le añadimos el Listener correspondiente
        btnBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText placeholder = findViewById(R.id.editTextTextPassword);
        if (placeholder.length()==0){
            Toast.makeText(MainActivity.this, "No escribiste nada", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, placeholder.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}