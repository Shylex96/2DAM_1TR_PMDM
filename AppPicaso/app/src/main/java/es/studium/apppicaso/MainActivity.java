package es.studium.apppicaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imageView);
        Picasso.get()
                .load("https://media.licdn.com/dms/image/D4E03AQFmflMeLepfDQ/profile-displayphoto-shrink_800_800/0/1682617456236?e=2147483647&v=beta&t=yj7r8FwqIRyKD7tduAqO1xlUEzx8AjulXK6_s7nErWQ")
                .into(imagen);
    }
}