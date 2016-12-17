package s4solutionsti.com.github.recifecultural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] pontos= {"Recife Antigo","Marco Zero", "Fonte das Cinco Pontas", "Porto de Galinha"};
        ListView listaPontos = (ListView) findViewById(R.id.lista_pontos);
        listaPontos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Botao clicado!", Toast.LENGTH_SHORT).show();
                Intent intentVaiProFormulario = new Intent(MainActivity.this, DetalharPontoActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter <String> (this, android.R.layout.simple_list_item_1, pontos);
        listaPontos.setAdapter(adapter);
    }
}
