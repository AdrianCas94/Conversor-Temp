package conversor_temperatura.adrian.facci.com.converso_temperatura;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    private Button calcular;
    private EditText valor;
    private TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        calcular = (Button)findViewById(R.id.conversor);
        calcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                valor = (EditText)findViewById(R.id.gradosC);
                mostrar = (TextView)findViewById(R.id.ver);
                try{
                    float gradoC = Float.parseFloat(valor.getText().toString());
                    float gradoF = 32 + (9 * gradoC/5);

                    mostrar.setText("El resultado es : " + gradoF + " Grados Fahrenheit");
                }
                catch (Exception e){
                    mostrar.setText("Ingrese solo numeros");
                }
            }
        });

    }

    public void acerca(View view){
        startActivity(new Intent(this, AcercadeAC.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
