package com.example.noteflow404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imageFolder; // Deklarasi ImageView
    private TextView textViewJudul; // Deklarasi TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageFolder = findViewById(R.id.imagefolder); // Cari ImageView
        textViewJudul = findViewById(R.id.textViewJudul); // Cari TextView

        imageFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivityForResult(intent, 1); // Tambahkan requestCode 1
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            String title = data.getStringExtra("noteTitle");
            textViewJudul.setText(title); // Atur teks TextView
        }
    }
}