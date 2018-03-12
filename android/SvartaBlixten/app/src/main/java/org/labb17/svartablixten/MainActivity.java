package org.labb17.svartablixten;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    GridView instructionsContainer;
    TextView instructionsBufferView;
    Button  programBtn, clearBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instructionsContainer = findViewById(R.id.instructions_container);
        instructionsContainer.setAdapter(new InstructionsAdapter(this));

        instructionsContainer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                String instructionsText = instructionsBufferView.getText().toString();
                instructionsText = instructionsText + " > " + ((TextView) v).getText() + "\n";
                instructionsBufferView.setText(instructionsText);

                Log.d(TAG, "Pressed button");

            }
        });

        instructionsBufferView = findViewById(R.id.instruction_buffer_view);
        clearBtn = findViewById(R.id.clear_btn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                instructionsBufferView.setText("");
            }
        });

        programBtn = findViewById(R.id.program_btn);

        programBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Programming robot.....", Toast.LENGTH_LONG).show();
                instructionsBufferView.setText("");
            }
        });

    }
}
