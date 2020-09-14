package proj.amitspilman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    Button btn_notes, btn_passwords;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_notes = (Button) findViewById(R.id.btn_notes);    //connect the button in xml to button in java;
        btn_passwords = (Button) findViewById(R.id.btn_passwords);    //connect the button in xml to button in java;

        //menu page --> note page
        btn_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(menu.this, notes.class); startActivity(intent);
                startActivity(intent);
            }
        });

        //menu page --> password page
        btn_passwords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(menu.this, passwords.class); startActivity(intent);
                startActivity(intent);
            }
        });
    }
}
