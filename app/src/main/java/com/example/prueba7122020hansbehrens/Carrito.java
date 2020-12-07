package com.example.prueba7122020hansbehrens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carrito extends AppCompatActivity {

    Button pagar;
    Producto producto;
    TextView descripcion2;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        pagar = findViewById(R.id.btnPagar);

        producto = getIntent().getParcelableExtra("producto");

        descripcion2 = findViewById(R.id.tvDescripcion2);
        total = findViewById(R.id.tvTotal);

        descripcion2.setText(producto.getDescripcion());
        total.setText(String.valueOf(producto.getValor() * producto.getCantidad()));

    }
}