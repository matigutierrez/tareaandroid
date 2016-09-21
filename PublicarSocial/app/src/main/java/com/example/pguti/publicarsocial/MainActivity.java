package com.example.pguti.publicarsocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //creamos los botones paracompartir
    private Button botonCompartir, botonFacebook, botonTwitter, botonWhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignamos a los botones e la actividad los botones del diseño.
        //el error se corregir al parsear
        botonCompartir = (Button) findViewById(R.id.buttonShare);
        botonFacebook = (Button) findViewById(R.id.buttonFacebook);
        botonTwitter = (Button) findViewById(R.id.buttontwitter);
        botonWhatsapp = (Button) findViewById(R.id.buttonwhatsapp);

        //ahora le asignamos la accion a relizar a los botones
        botonCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui asginamos la accion a realizar
                //importamos las librerias con alt+intro
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "TEST - Enviado desde aplicación");
                startActivity(Intent.createChooser(intent, "Share with"));
            }
        });

        botonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "TEST - Enviado desde aplicación");
                intent.setPackage("com.facebook.katana");
                startActivity(intent);
            }
        });

        botonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "TEST - Enviado desde aplicación");
                //Para especificar la red social especifica se le asigna en esta parte
                intent.setPackage("com.twitter.android");
                startActivity(intent);
            }
        });

        botonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "TEST - Enviado desde aplicación");
                intent.setPackage("com.whatsapp");
                startActivity(intent);
            }
        });

    }

}
