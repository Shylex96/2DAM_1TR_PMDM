package es.studium.misfragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHelp;
    Button btnAbout;
    FragmentManager fm = getSupportFragmentManager();
    Fragment ayuda;
    Fragment acerca;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHelp = findViewById(R.id.btnHelp);
        btnAbout = findViewById(R.id.btnAbout);

        btnHelp.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==(R.id.btnHelp)) {
            ayuda = fm.findFragmentByTag("ayuda");
            if (ayuda == null) {

                Bundle datos = new Bundle();
                datos.putLong("id", 123L);
                datos.putInt("edad", 21);
                datos.putString("nombre", "California");
                Fragment fragmento = new Ayuda();
                fragmento.setArguments(datos);

                ft = fm.beginTransaction();
                ft.replace(R.id.contenedorFragmento, fragmento, "ayuda");
                ft.commit();
            }
        }
        else {
            acerca = fm.findFragmentByTag("acerca");
            if (acerca == null) {
                ft = fm.beginTransaction();
                ft.replace(R.id.contenedorFragmento, new AcercaDe(), "acerca");
                ft.commit();
            }
        }
    }
}