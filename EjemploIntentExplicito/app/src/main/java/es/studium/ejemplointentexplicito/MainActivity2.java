package es.studium.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String text = extras.getString("textoParaPasar");
            System.out.println(text);
            Toast.makeText(this, "Texto: " +text, Toast.LENGTH_SHORT).show();
        }
    }
}