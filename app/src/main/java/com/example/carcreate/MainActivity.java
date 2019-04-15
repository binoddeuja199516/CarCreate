package com.example.carcreate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCreateCar, btnDiesel;
    private EditText ET_Make, ET_Year, ETColor, Et_Price, Et_Size;
    private TextView txtVOutput;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_Make = findViewById(R.id.ET_Make);
        ET_Year = findViewById(R.id.ET_Year);
        ETColor = findViewById(R.id.ETColor);
        Et_Price = findViewById(R.id.Et_Price);
        Et_Size = findViewById(R.id.Et_Size);
        txtVOutput = findViewById(R.id.txtVOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnDiesel = findViewById(R.id.btnDiesel);

        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String manuf = ET_Make.getText().toString();
                int year = Integer.parseInt(ET_Year.getText().toString());
                float price = Float.parseFloat(Et_Price.getText().toString());
                float size = Float.parseFloat(Et_Size.getText().toString());
                txtVOutput.append("This is vehicle no. " + i + "\n" + "Manufacturer: " + manuf +
                        "Current value: " + price + "Effective engine size: " + size + "\n");
            }
        });
    }
}
