package com.fsatriaa.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fsatriaa.pertemuan5.database.AppDatabase;
import com.fsatriaa.pertemuan5.database.DataDiri;

public class MainActivity extends AppCompatActivity {
    private EditText etNama,etAlamat,etJenisKelamin;
    private Button btnInsert;

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appDatabase=AppDatabase.initDB(getApplicationContext());

        etNama = findViewById(R.id.etNama);
        etAlamat=findViewById(R.id.etAlamat);
        etJenisKelamin=findViewById(R.id.etJenisKelamin);
        btnInsert=findViewById(R.id.btnInsert);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
            }
        });

    }

    private void insertData(){
        String nama=etNama.getText().toString();
        String alamat=etAlamat.getText().toString();
        char jenisKelamin=etJenisKelamin.getText().toString().charAt(0);

        DataDiri item=new DataDiri();

        item.setNama(nama);
        item.setAlamat(alamat);
        item.setJenisKelamin(jenisKelamin);

        //kirim ke database
        appDatabase.dao().insertData(item);

        etNama.setText("");
        etAlamat.setText("");
        etJenisKelamin.setText("");


    }
}
