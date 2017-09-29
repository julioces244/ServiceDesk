package com.apaza.servicedesk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edt_usuario;
    private EditText edt_password;
    private Button ingresar;
    String user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_usuario = (EditText) findViewById(R.id.editTextusuario);

        edt_password = (EditText) findViewById(R.id.editTextpassword);
        ingresar = (Button) findViewById(R.id.button);
    }

    public void entrar(View view) {
        Usuario usuario1 = new Usuario("jose","tecsup","cliente");
        Usuario usuario2 = new Usuario("miguel","tecsup2","tecnico");
        Usuario usuario3 = new Usuario("jimena","tecsup3","supervisor");
        user = edt_usuario.getText().toString();
        pass = edt_password.getText().toString();
        if (user.trim().equalsIgnoreCase("jose") && pass.trim().equalsIgnoreCase("tecsup") ) {

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("user", usuario1.getUsername());
            i.putExtra("password", usuario1.getPassword());
            i.putExtra("rol", usuario1.getRol());
            startActivity(i);

        }else if(user.trim().equalsIgnoreCase("miguel") && pass.trim().equalsIgnoreCase("tecsup2")){
            Intent i2 = new Intent(this, Main2Activity.class);
            i2.putExtra("user", usuario2.getUsername());
            i2.putExtra("password", usuario2.getPassword());
            i2.putExtra("rol", usuario2.getRol());
            startActivity(i2);

        }else if(user.trim().equalsIgnoreCase("jimena") && pass.trim().equalsIgnoreCase("tecsup3")){
            Intent i3 = new Intent(this, Main2Activity.class);
            i3.putExtra("user", usuario3.getUsername());
            i3.putExtra("password", usuario3.getPassword());
            i3.putExtra("rol", usuario3.getRol());
            startActivity(i3);
        }else{
            Toast.makeText(this, "Ha dejado campos vacios",
                         Toast.LENGTH_LONG).show();
        }
    }
}
