package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView editTweetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        editTweetView = (TextView) findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String mes = extras.getString("message");

        editTweetView.setText(mes);
    }
}
