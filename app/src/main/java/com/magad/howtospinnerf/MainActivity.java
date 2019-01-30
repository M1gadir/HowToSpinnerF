package com.magad.howtospinnerf;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.magad.howtospinnerf.Fragment.DuaFragment;
import com.magad.howtospinnerf.Fragment.EmpatFragment;
import com.magad.howtospinnerf.Fragment.LimaFragment;
import com.magad.howtospinnerf.Fragment.SatuFragment;
import com.magad.howtospinnerf.Fragment.TigaFragment;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner spiner;
    RelativeLayout rl;
    public FragmentManager fm;
    Toast tos;

    private String[] listwarna = {
            "-pilih-","merah","biru","hijau","orange","abu-abu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiner = findViewById(R.id.sp_fragment1);
        rl = findViewById(R.id.container);

        ArrayAdapter<String> warna = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,listwarna);

        spiner.setAdapter(warna);
        spiner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
    fm = getSupportFragmentManager();

    switch (i){
        case 0:
            tos.makeText(this, "Pilih", Toast.LENGTH_SHORT).show();
            break;
        case 1:
            tos.makeText(this, "Warna Layout jadi merah", Toast.LENGTH_SHORT).show();
            fm.beginTransaction()
                    .add(R.id.container,new SatuFragment())
                    .commit();
            break;
        case 2:
            tos.makeText(this, "Warna Layout jadi biru", Toast.LENGTH_SHORT).show();
            fm.beginTransaction()
                    .add(R.id.container,new DuaFragment())
                    .commit();
            break;
        case 3:
            tos.makeText(this, "Warna Layout jadi hijau", Toast.LENGTH_SHORT).show();
            fm.beginTransaction()
                    .add(R.id.container,new TigaFragment())
                    .commit();
            break;
        case 4:
            tos.makeText(this, "Warna Layout jadi orange", Toast.LENGTH_SHORT).show();
            fm.beginTransaction()
                    .add(R.id.container,new EmpatFragment())
                    .commit();
            break;
        case 5:
            tos.makeText(this, "Warna Layout jadi biru", Toast.LENGTH_SHORT).show();
            fm.beginTransaction()
                    .add(R.id.container,new LimaFragment())
                    .commit();
            break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
