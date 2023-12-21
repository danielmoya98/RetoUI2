package com.example.retoui2;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.retoui2.MainActivity;
import com.example.retoui2.R;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Referencia al ImageView que deseas animar
        ImageView logoImageView = findViewById(R.id.logoImageView);

        // Configurar la animación de fade in
        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(2000); // Duración en milisegundos (ajusta según tus necesidades)

        // Asignar la animación al ImageView
        logoImageView.startAnimation(fadeIn);

        // Configurar un listener para la animación
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // La animación ha comenzado
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // La animación ha terminado, transicionar a la siguiente actividad
                startActivity(new Intent(Splash_Screen.this, MainActivity.class));
                finish(); // Opcional: cerrar la actividad actual si no la necesitas más
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // La animación se repite (si está configurada para repetirse)
            }
        });
    }
}
