package com.example.arnoldo.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtMensaje;
Button btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMostrar = findViewById(R.id.btnMostrar);
        edtMensaje = findViewById(R.id.edtMensaje);
       btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*creo la instancia de la clase logger que mepermitira
                acceder a todos los metodos de ella*/
                Logger dato_1= Logger.getInstance();/*esta es una forma de comprobar que solo se puede
                realizar la instancia de un solo objeto, creando dos instancias con diferente nombre
                solo que una  sin ningun  dato  y abajo la mando imprimir y singleton se toma la tarea
                de decir que ya esta creada una instancia y que si creas alguna otra no se podra
                ya que  instanciaras a el mismo objeto de esa clase */
                Logger dato_2= Logger.getInstance();
           String mensaje=edtMensaje.getText().toString();//obtengo el texto de la interfas y la hago propia
           dato_1.setMensaje(mensaje);
                Toast.makeText(MainActivity.this, "la unica instancia es " + dato_2.getMensaje(), Toast.LENGTH_SHORT).show();
                //mando imprimir la segunda instancia que no tiene ningun dato

            }
        });


    }
}
