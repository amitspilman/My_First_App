package proj.amitspilman;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class notes extends AppCompatActivity {

    ImageButton btn_plus;
    ListView note_list;

    // Defined Array values to show in ListView
    private String[] row_title = new String[] {"firest note","second note"};
    private String[] row_text = new String[] {"amit1 this is the text area","amit2 this is the text area"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        btn_plus = (ImageButton) findViewById(R.id.btn_plus_notes);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "new note just added", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
