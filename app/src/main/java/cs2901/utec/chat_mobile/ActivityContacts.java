package cs2901.utec.chat_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityContacts extends AppCompatActivity {
    TextView tvUsername, tvPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        tvUsername = findViewById(R.id.tvUsername);
        tvPassword = findViewById(R.id.tvPassword);

        Intent intent = getIntent();
        tvUsername.setText(intent.getStringExtra("username"));
        tvPassword.setText(intent.getStringExtra("password"));
    }
}
