package kushagra.digipodium.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textCount;
    int counter =0;
    boolean isSet = false;
    private EditText editStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCount =findViewById(R.id.btnCount);
        Button btnReset =findViewById(R.id.btnReset);
        Button btnStart = findViewById(R.id.btnStart);
        textCount = findViewById(R.id.textCount);
        editStart = findViewById(R.id.editStart);

    }
    public void increaseCount(View v){
//        String val =editStart.getText().toString();
//        if(val.length() > 0  && ! isSet){
//            counter =Integer.parseInt(val);
//            isSet = true;
//        }
        counter++;
textCount.setText(String.valueOf(counter));
    }
    public void resetCount(View v){
        counter=0;
        textCount.setText(String.valueOf(counter));
    }
    public void startCount(View v){
        String val=editStart.getText().toString();
        if(val.length() > 0){
            counter =Integer.parseInt(val);
        }
        else
        {
            counter = 0;
        }
        textCount.setText(String.valueOf(val));


    }
}
