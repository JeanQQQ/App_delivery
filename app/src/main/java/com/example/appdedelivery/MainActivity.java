package com.example.appdedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtemail, txtpass;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail = findViewById(R.id.edtcorreo);
        txtpass = findViewById(R.id.edtcontraseña);
        btnlogin = findViewById(R.id.btnacceso);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String email = "robert123@gmail.com";
                //String clave = "robert2005";
                String correo = txtemail.getText().toString();
                String password = txtpass.getText().toString();
                if(correo.equals("") || password.equals("")){
                    Toast.makeText(getApplicationContext(),"campos vacíos...", Toast.LENGTH_LONG).show();
                }else{
                    if(correo.equals("robert123@gmail.com") && password.equals("robert2005")){
                        Intent intent = new Intent(getApplicationContext(),Menu.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}