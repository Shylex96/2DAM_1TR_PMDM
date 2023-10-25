package es.studium.mialarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == (R.id.myButton)) {
            crearAlarma(v);
        }
    }

    private void crearAlarma(View v) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Mensaje!")
                .putExtra(AlarmClock.EXTRA_HOUR, 8)
                .putExtra(AlarmClock.EXTRA_MINUTES, 33);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}