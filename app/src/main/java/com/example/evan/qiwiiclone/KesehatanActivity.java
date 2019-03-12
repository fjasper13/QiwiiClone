package com.example.evan.qiwiiclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class KesehatanActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesehatan);

        Spinner spinner_lokasi = findViewById(R.id.spinner_lokasi);
        if (spinner_lokasi != null) {
            spinner_lokasi.setOnItemSelectedListener(this);
        }

        Spinner spinner_pelayanan = findViewById(R.id.spinner_pelayanan);
        if (spinner_pelayanan != null) {
            spinner_pelayanan.setOnItemSelectedListener(this);
        }

        Spinner spinner_poli = findViewById(R.id.spinner_poli);
        if (spinner_poli != null) {
            spinner_poli.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter_lokasi = ArrayAdapter.createFromResource(
                this,
                R.array.kesehatanLokasi_array,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_pelayanan = ArrayAdapter.createFromResource(
                this,
                R.array.kesehatanPelayanan_array,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_poli = ArrayAdapter.createFromResource(
                this,
                R.array.kesehatanPoli_array,
                android.R.layout.simple_spinner_item);

        adapter_lokasi.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        adapter_pelayanan.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        adapter_poli.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner_lokasi != null) {
            spinner_lokasi.setAdapter(adapter_lokasi);
        }
        if (spinner_pelayanan != null) {
            spinner_pelayanan.setAdapter(adapter_pelayanan);
        }
        if (spinner_poli != null) {
            spinner_poli.setAdapter(adapter_poli);
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
