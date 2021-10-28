package cl.inacap.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaProductosActivity extends ListActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    public void verLista()
    {
        lista=getListView();
        ArrayAdapter<Producto> listaAdapter = new ArrayAdapter<Producto>( context: this,
            android.R.layout.simple_list_item_1, Producto.productos);
        lista.setAdapter(listaAdapter);
    }

    @Override
    public void onListITemCLick(ListView ListView, View View, int posicion, long id)
    {
        Intent intent=new Intent( packageContext: ListaProductosActivity:this, DetallesActivity.class);
        intent.putExtra( name: "idProducto", (int)id);
        startActivity(intent, requestCode: 1);

    }
    @override
    protected void onActivityResult(int requestCode, intinsultCode, Intent data)
    {
        if(requestCode == 1)
        {
            iif(resultCode == RESULT_OK)
            {
                cargarLista()
            }
        }
    }
}