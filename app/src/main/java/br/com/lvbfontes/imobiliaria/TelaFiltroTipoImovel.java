package br.com.lvbfontes.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import br.com.lvbfontes.imobiliaria.Modelo.Imovel;


public class TelaFiltroTipoImovel extends AppCompatActivity {

    private ListView listaTipoImovel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro_tipo_imovel);

        listaTipoImovel = (ListView) findViewById(R.id.lstTipoImovel);

        listaTipoImovel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View view, int position, long id) {
                if (position == 3) {
                    Intent intent = new Intent(TelaFiltroTipoImovel.this, TelaFiltroTerrenoMetro.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(TelaFiltroTipoImovel.this, TelaFiltroComodos.class);
                    startActivity(intent);
                }
            }
        });
    }
}
