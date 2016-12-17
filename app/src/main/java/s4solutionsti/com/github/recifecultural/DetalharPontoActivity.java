package s4solutionsti.com.github.recifecultural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class DetalharPontoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhar_ponto);

        Intent intent = getIntent();
        Serializable id = intent.getSerializableExtra("id");
        Toast.makeText(DetalharPontoActivity.this, "Botao clicado!" + id, Toast.LENGTH_SHORT).show();
    }
}
