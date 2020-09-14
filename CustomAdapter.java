package proj.amitspilman;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final List<rowPassword> password_list;

    public CustomAdapter(Context context, List<rowPassword> password_list) {
        super(context,R.layout.listview_password_row);
        this.context=context;
        this.password_list=password_list;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
//        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
//        View rowView = inflater.inflate(R.layout.listview_password_row,parent,false);

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View rowView = inflater.inflate(R.layout.listview_password_row,parent,false);

        TextView row_title = (TextView) rowView.findViewById(R.id.password_title);
        TextView row_username = (TextView) rowView.findViewById(R.id.password_username);
        TextView row_password = (TextView) rowView.findViewById(R.id.password_password);

        row_title.setText(password_list.get(position).getTitle());
        row_username.setText(password_list.get(position).getPassword());
        row_password.setText(password_list.get(position).getUsername());

        return rowView;
    }
}
