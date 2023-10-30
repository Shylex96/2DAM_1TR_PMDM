package es.studium.millamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCall1, btnCall2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall1 = findViewById(R.id.button);
        btnCall1.setOnClickListener(this);

        btnCall2 = findViewById(R.id.button3);
        btnCall2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button) {
            marcarTelefono(v);
        }
        if (v.getId()==R.id.button3) {
            marcarTelefono2(v);
        }
    }

    private void marcarTelefono2(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+34 636851972"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }

    private void marcarTelefono(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+34 636342011"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}