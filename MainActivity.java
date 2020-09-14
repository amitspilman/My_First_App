package proj.amitspilman;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    Intent intent;
    ImageButton btn, btn_name;
    EditText edit_name;
    TextView text;
    LinearLayout layout, layout1;
    String name;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("name", 0);
        btn = (ImageButton) findViewById(R.id.button);
        btn_name = (ImageButton) findViewById(R.id.btn_confirm_name);
        edit_name = (EditText) findViewById(R.id.EditText_name);
        text = (TextView) findViewById(R.id.title2);
        layout = (LinearLayout) findViewById(R.id.layout_main_page);
        layout1 = (LinearLayout) findViewById(R.id.add_name_zone);

        name = sp.getString("name", null);

        if (name != null) {
            layout.setBackgroundColor(getColor(R.color.white));
            layout1.setVisibility(View.INVISIBLE);
            edit_name.setVisibility(View.INVISIBLE);
            btn_name.setVisibility(View.INVISIBLE);
            text.setText(name);
        } else {
            layout.setBackgroundColor(getColor(R.color.gray));
            layout1.setVisibility(View.VISIBLE);
            edit_name.setVisibility(View.VISIBLE);
            btn_name.setVisibility(View.VISIBLE);
        }

        btn_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name", edit_name.getText().toString());
                editor.apply();
            }
        });

        //Main page --> menu page
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed(){
        Log.d("CDA", "onBackPressed Called");
    }       //override "Back" button - canceled button

}


