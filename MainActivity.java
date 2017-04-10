package robson.professor.quiz;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    EditText edt2;
    EditText edt3;
    EditText edt4;

    TextView tx1;
    TextView tx2;
    TextView tx3;
    TextView tx4;


    Integer qtd_acertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText)findViewById(R.id.Edt1);
        edt2 = (EditText)findViewById(R.id.Edt2);
        edt3 = (EditText)findViewById(R.id.Edt3);
        edt4 = (EditText)findViewById(R.id.Edt4);

        tx1 = (TextView)findViewById(R.id.a1);
        tx1.setText(PerguntasERespostas.perg1);
        tx2 = (TextView)findViewById(R.id.a2);
        tx2.setText(PerguntasERespostas.perg2);
        tx3 = (TextView)findViewById(R.id.a3);
        tx3.setText(PerguntasERespostas.perg3);
        tx4 = (TextView)findViewById(R.id.a4);
        tx4.setText(PerguntasERespostas.perg4);
    }

    public void Verificar(View v){
        if(edt1.getText().toString().isEmpty() ||
                edt2.getText().toString().isEmpty() ||
                edt3.getText().toString().isEmpty() ||
                edt4.getText().toString().isEmpty()){


            if(edt1.getText().toString().isEmpty()){
                edt1.setError("Preencha este campo!");
            }
            if(edt2.getText().toString().isEmpty()){
                edt2.setError("Preencha este campo!");
            }
            if(edt3.getText().toString().isEmpty()){
                edt3.setError("Preencha este campo!");
            }
            if(edt4.getText().toString().isEmpty()){
                edt4.setError("Preencha este campo!");
            }

        }else{
            qtd_acertos = 0;
            String s1 = edt1.getText().toString();
            String s2 = edt2.getText().toString();
            String s3 = edt3.getText().toString();
            String s4 = edt4.getText().toString();

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("s1", s1);
            intent.putExtra("s2", s2);
            intent.putExtra("s3", s3);
            intent.putExtra("s4", s4);
            startActivity(intent);

        }
    }
}
