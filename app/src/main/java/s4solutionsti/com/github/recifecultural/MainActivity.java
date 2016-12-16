package s4solutionsti.com.github.recifecultural;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] pontos= {"Recife Antigo","Marco Zero", "Fonte das Cinco Pontas", "Porto de Galinha"};
        ListView listaPontos = (ListView) findViewById(R.id.lista_pontos);

        ArrayAdapter<String> adapter = new ArrayAdapter <String> (this, android.R.layout.simple_list_item_1, pontos);
        listaPontos.setAdapter(adapter);
    }
}
