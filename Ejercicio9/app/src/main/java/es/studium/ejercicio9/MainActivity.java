package es.studium.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton = findViewById(R.id.button);
        btnBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText placeholder = findViewById(R.id.editTextDate);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        EditText fecha = findViewById(R.id.editTextDate);

        if (placeholder.length() == 0) {
            Toast.makeText(this, R.string.mensajeError, Toast.LENGTH_SHORT).show();
        } else {
            try {
                Date date = format.parse(placeholder.getText().toString());
                Toast.makeText(this, placeholder.getText(), Toast.LENGTH_SHORT).show();
                placeholder.setText("");
            } catch (ParseException e) {
                Toast.makeText(this, R.string.mensajeErrorFechaIncorrecta, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
