package pemrogramanmobile.ubg.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText iNim, iNama, iNoHp, iEmail;
    private RadioGroup rgJk;
    private CheckBox game, baca, bola;
    private TextView tvNim, tvNama, tvNoHp, tvEmail, tvJk, tvHobi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iNim = findViewById(R.id.inputNim);
        iNama = findViewById(R.id.inputNama);
        iNoHp = findViewById(R.id.inputNoHp);
        iEmail = findViewById(R.id.inputEmail);
        rgJk = findViewById(R.id.rgJK);
        game = findViewById(R.id.game);
        baca = findViewById(R.id.baca);
        bola = findViewById(R.id.bola);
        tvNim = findViewById(R.id.hasilNIM);
        tvNama = findViewById(R.id.hasilNama);
        tvNoHp = findViewById(R.id.hasilNoHp);
        tvEmail = findViewById(R.id.hasilEmail);
        tvJk = findViewById(R.id.hasilJk);
        tvHobi = findViewById(R.id.hasilHobi);
    }

    public void tampilkanData(View v){
        int id = rgJk.getCheckedRadioButtonId();
        ArrayList listHobi = new ArrayList();

        tvNim.setText(iNim.getText());
        tvNama.setText(iNama.getText());
        tvNoHp.setText(iNoHp.getText());
        tvEmail.setText(iEmail.getText());

        if(id != -1){
            RadioButton jenisKelamin = findViewById(id);
            tvJk.setText(jenisKelamin.getText());
        }else{
            Toast.makeText(this, "Jenis kelamin belum dipilih", Toast.LENGTH_SHORT).show();
        }

        if(baca.isChecked()){
            listHobi.add(baca.getText().toString());
        }

        if(game.isChecked()){
            listHobi.add(game.getText().toString());
        }

        if(bola.isChecked()){
            listHobi.add(bola.getText().toString());
        }

        if(listHobi.size() != 0){
            tvHobi.setText(listHobi.toString());
        }else{
            Toast.makeText(this, "Belum Memilih Hobi", Toast.LENGTH_SHORT).show();
        }

    }
}
