package ian.com.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Phone(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"0978355530"));
        startActivity(intent);
    }

    public void Map(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.4925,19.0513"));
        startActivity(intent);
    }

    public void Chrome(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.tw"));
        startActivity(intent);
    }
}