package logicgates.mytextview.com.logicgates;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class andActivity extends AppCompatActivity {

    private ToggleButton firstvariable;
    private ToggleButton secondvariable;
    private Button check;
    private TextView answer;
    private boolean x;
    private boolean y;
   private TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);

        firstvariable = (ToggleButton) findViewById(R.id.toggleButton);
        secondvariable = (ToggleButton) findViewById(R.id.toggleButton2);
        check = (Button) findViewById(R.id.button);
        answer = (TextView) findViewById(R.id.ans);
        debugText = (TextView) findViewById(R.id.debugText);
        debugText.setText("");

        /*firstvariable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    x = true;
                else
                    x = false;
            }
        });
        secondvariable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    y = true;
                else
                    y = false;
            }
        });*/

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstvariable.isChecked())
                    x=true;
                else
                    x = false;

                if(secondvariable.isChecked())
                    y=true;
                else
                    y=false;

                if(x&&y)
                    answer.setText(x + " + " + y + " = "+ " True");
                else
                    answer.setText(x + " + " + y + " = "+ " False");

            }
        });
    }
}
