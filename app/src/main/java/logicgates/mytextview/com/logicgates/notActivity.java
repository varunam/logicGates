package logicgates.mytextview.com.logicgates;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class notActivity extends AppCompatActivity {

    private ToggleButton firstvariable;
    private Button check;
    private TextView answer;
    private boolean x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not);

        firstvariable = (ToggleButton) findViewById(R.id.toggleButton);
        check = (Button) findViewById(R.id.check);
        answer = (TextView) findViewById(R.id.ans);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstvariable.isChecked())
                    answer.setText("~(" + firstvariable.isChecked() + "): " + "False");
                else
                    answer.setText("~(" + firstvariable.isChecked() + "): " + "True");
            }
        });
    }

}
