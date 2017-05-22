package br.com.lvbfontes.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFiltroComodos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro_comodos);

        Button btnPronto = (Button) findViewById(R.id.btnProntoComodos);

        btnPronto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaFiltroComodos.this, TelaFiltroFaixaPreco.class);
                startActivity(intent);
            }
        });
    }
}
