package cl.inacap.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    public Producto producto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        intent=getIntent();
        int id=(Integer) intent.getExtras().get("idProducto");
        producto=Producto.productos[id];

        TextView txtNombre=(TextView) findViewById(R.id.txtNombre);
        txtNombre.setText(producto.getNombre());

        TextView txtUnidad=(TextView) findViewById(R.id.txtUnidad);
        txtUnidad.setText(producto.getUnidad());

        TextView txtEstado=(TextView) findViewById(R.id.txtEstado);
        Button cambiar=(Button) findViewById(R.id.estado);
        {
            txtEStado.setText("Pendiente");
            cambiar.setText("Marcar como Comprado");
        }
        else
        {
            txtEstado.setText()
        ("MarcarcomPendiente")
        }

    }

    public void cambiarEstado(View View)
    {
        producto.setEstado(!producto.isEstado());
        setResult(RESULT_OK, intent);
        finish();
    }
}