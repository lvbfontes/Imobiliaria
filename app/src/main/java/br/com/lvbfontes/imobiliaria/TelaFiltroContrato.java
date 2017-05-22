package br.com.lvbfontes.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFiltroContrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro_contrato);

        Button btnAluguel = (Button) findViewById(R.id.btnAluguel);
        Button btnCompra = (Button) findViewById(R.id.btnCompra);

        btnAluguel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaFiltroContrato.this, TelaFiltroTipoImovel.class);
                startActivity(intent);
            }
        });

        btnCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaFiltroContrato.this, TelaFiltroTipoImovel.class);
                startActivity(intent);
            }
        });

    }
}
