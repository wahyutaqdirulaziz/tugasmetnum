package id.haqiqi_studio.regularfalsi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

public class Utils extends AppCompatActivity {
    public void composeEmail(String address, String text) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void sendToWA(String no) {
        Uri uri = Uri.parse("smsto:" + no);
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.setPackage("com.whatsapp");
        startActivity(i);
    }
}
