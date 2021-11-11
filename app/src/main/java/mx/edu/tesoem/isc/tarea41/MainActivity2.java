package mx.edu.tesoem.isc.tarea41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = findViewById(R.id.btnAccion);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText pass = findViewById(R.id.txtPassword);
                String passw = pass.getText().toString();
                if(passw.equals("Android2021")){
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);
                    finish();
                }else{
                    finish();
                }
            }
        });
    }
}