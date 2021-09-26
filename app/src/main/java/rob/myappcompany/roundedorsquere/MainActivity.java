package rob.myappcompany.roundedorsquere;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import rob.myappcompany.roundedorsquere.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    public void determineRoundedOrSquere(View view){
        if (getResources().getConfiguration().isScreenRound()){
            Toast.makeText(this, "Round", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Square", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}