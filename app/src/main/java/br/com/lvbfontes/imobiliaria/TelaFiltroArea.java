package br.com.lvbfontes.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFiltroArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro_area);

        Button btnPronto = (Button) findViewById(R.id.btnProntoArea);

        btnPronto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaFiltroArea.this, TelaFiltroFaixaPreco.class);
                startActivity(intent);
            }
        });
    }
}
