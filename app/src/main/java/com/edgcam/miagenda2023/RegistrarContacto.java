package com.edgcam.miagenda2023;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarContacto extends AppCompatActivity {

    EditText nombre, telefono;
    Button botonAgregar, botonRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_contacto);

        nombre = findViewById(R.id.txtNombreCompleto);
        telefono = findViewById(R.id.txtTelefono);
        botonAgregar = findViewById(R.id.btnGuardarContacto);
        botonRegresar = findViewById(R.id.btnRegresar);

        //Evento (CLICK)
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Registrar
                registrar();
            }
        });

        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Regresar
                regresar();
            }
        });
    }

    private void regresar(){
        Intent actividad = new Intent(RegistrarContacto.this,MainActivity.class);
        startActivity(actividad);
        RegistrarContacto.this.finish();
    }

    private void registrar(){
        /*try{
            SQLiteDatabase miBaseDatos = objConexion.getWritableDatabase();
            String comando = "INSERT INTO contactos (nombre,telefono) VALUES ('"+ nombre.getText() +"','"+ telefono.getText() +"')";
            miBaseDatos.execSQL(comando);
            miBaseDatos.close();
            Toast.makeText(RegistrarContacto.this, "Datos Registrados con éxito", Toast.LENGTH_LONG).show();
        }catch (Exception error){
            Toast.makeText(RegistrarContacto.this, "Error: "+ error.getMessage(), Toast.LENGTH_LONG).show();
        }*/
    }
}