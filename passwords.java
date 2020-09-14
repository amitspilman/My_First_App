package proj.amitspilman;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class passwords extends AppCompatActivity {

    ImageButton btn_plus;
    ListView list_view;
    private List<rowPassword> password_list;
    private CustomAdapter adapter;
    private rowPassword new_row = new rowPassword("aaa", "bbbb", "cccc");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
        btn_plus = (ImageButton) findViewById(R.id.btn_plus_passwords);
        list_view = (ListView) findViewById(R.id.ListView_passwords);           // Get ListView object from xml
        adapter = new CustomAdapter(passwords.this, password_list);
        list_view.setAdapter(adapter);      // Assign adapter to ListView

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                password_list.add(new_row);
//                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "btn just pressed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
