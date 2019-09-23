package com.example.safeway_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_nip);
    }

    //Metodo de igreso via NIP
    public void NIP(View v){
        String nip_String = et1.getText().toString();
        Toast.makeText(this, "Usted ah ingresado con el NIP " + nip_String, Toast.LENGTH_SHORT).show();
    }

    //Metodos via scrollView
    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.codigoqr:
                Toast.makeText(this, "Escanee el codigo QR", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buscar:
                Toast.makeText(this, "FindYourself", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubicacion:
                Toast.makeText(this, "Esta es su ubicacion actual", Toast.LENGTH_SHORT).show();
                break;
            case R.id.emergencia:
                Toast.makeText(this, "Usted a solicitado una emergencia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Acerca de nosotros", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contacto:
                Toast.makeText(this, "Contactanos!!!", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
