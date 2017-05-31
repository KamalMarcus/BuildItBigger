package com.kamal.marcus.jokepreviewactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class JokePreviewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_preview);

        TextView selectedJokeTextView= (TextView) findViewById(R.id.selected_joke_text_view);
        selectedJokeTextView.setText(getIntent().getStringExtra(getResources().getString(R.string.selected_joke_string_key)));
    }
}
