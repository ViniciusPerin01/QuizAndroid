package robson.professor.quiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView EdtPerg1;
    TextView EdtPerg2;
    TextView EdtPerg3;
    TextView EdtPerg4;
    TextView EdtResp1;
    TextView EdtResp2;
    TextView EdtResp3;
    TextView EdtResp4;

    Integer pa = 0;
    TextView txporcentagem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txporcentagem = (TextView) findViewById(R.id.txfinal);

        // PERGUNTAS
        EdtPerg1 = (TextView)findViewById(R.id.pergunta01);
        EdtPerg1.setText(PerguntasERespostas.perg1);

        EdtPerg2 = (TextView)findViewById(R.id.pergunta02);
        EdtPerg2.setText(PerguntasERespostas.perg2);

        EdtPerg3 = (TextView)findViewById(R.id.pergunta03);
        EdtPerg3.setText(PerguntasERespostas.perg3);

        EdtPerg4 = (TextView)findViewById(R.id.pergunta04);
        EdtPerg4.setText(PerguntasERespostas.perg4);


        //RESPOSTAS
        EdtResp1 = (TextView)findViewById(R.id.resposta01);
        EdtResp1.setText(PerguntasERespostas.resp1);

        EdtResp2 = (TextView)findViewById(R.id.resposta02);
        EdtResp2.setText(PerguntasERespostas.resp2);

        EdtResp3 = (TextView)findViewById(R.id.resposta03);
        EdtResp3.setText(PerguntasERespostas.resp3);

        EdtResp4 = (TextView)findViewById(R.id.resposta04);
        EdtResp4.setText(PerguntasERespostas.resp4);

        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("s1").toString().equals(PerguntasERespostas.resp1))
        {
            EdtResp1.setTextColor(Color.GREEN);
            pa++;
        }else{
            EdtResp1.setTextColor(Color.RED);
        }

        if(bundle.getString("s2").toString().equals(PerguntasERespostas.resp2))
        {
            EdtResp2.setTextColor(Color.GREEN);
            pa++;
        }else{
            EdtResp2.setTextColor(Color.RED);
        }

        if(bundle.getString("s3").toString().equals(PerguntasERespostas.resp3))
        {
            EdtResp3.setTextColor(Color.GREEN);
            pa++;
        }else{
            EdtResp3.setTextColor(Color.RED);
        }

        if(bundle.getString("s4").toString().equals(PerguntasERespostas.resp4))
        {
            EdtResp4.setTextColor(Color.GREEN);
            pa++;
        }else{
            EdtResp4.setTextColor(Color.RED);
        }

        txporcentagem.setText(pa * 25 + "% de acertos");
    }
}
