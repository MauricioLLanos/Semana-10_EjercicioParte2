package com.example.damsem10_listadotoastejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast;
    ListView lista;
    List<String> cursos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vinculamos
        btnToast = findViewById(R.id.buttonToast);
        // Evento Click
        btnToast.setOnClickListener(this);


        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.ListView);

        // 2. Instanciamos la Lista y agregamos elementos
        cursos = new ArrayList<>();
        cursos.add("Sistemas Inteligentes");
        cursos.add("Diseño de Aplicativos Moviles");
        cursos.add("Sistemas Operativos");
        cursos.add("Simulacion de Sistemas");
        cursos.add("Sistemas de Informacion");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorCursos = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                cursos
        );

        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorCursos);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonToast) {
            Toast.makeText(this, "Matrícula completa", Toast.LENGTH_LONG).show();
        }
    }
}