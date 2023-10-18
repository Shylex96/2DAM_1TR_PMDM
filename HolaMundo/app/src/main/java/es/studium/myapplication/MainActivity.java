package es.studium.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Tag Ciclo de vida", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(this, "Aplicación iniciada", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 300, 700);
        toast.show();
        Log.i("Tag Ciclo de vida", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Tag Ciclo de vida", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Tag Ciclo de vida", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tag Ciclo de vida", "onStop()");
    }

    @Override
    protected void onDestroy() {
        Log.i("Tag Ciclo de vida", "onDestroy()");
        super.onDestroy();
    }

}