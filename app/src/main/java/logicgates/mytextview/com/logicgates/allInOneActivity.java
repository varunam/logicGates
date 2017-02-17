package logicgates.mytextview.com.logicgates;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class allInOneActivity extends AppCompatActivity {

    private ToggleButton firstvariable;
    private ToggleButton secondvariable;
    private ToggleButton thirdvariable;
    private RadioGroup radioGroup;
    private TextView answer1;
    private TextView answer2;
    private RadioButton radioButton;
    private Button check1;
    private Button check2;
    private boolean x;
    private boolean y;
    private boolean z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_in_one);

        firstvariable = (ToggleButton) findViewById(R.id.toggleButton);
        secondvariable = (ToggleButton) findViewById(R.id.toggleButton2);
        thirdvariable = (ToggleButton) findViewById(R.id.toggleButton3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        check1 = (Button) findViewById(R.id.check1);
        check2 = (Button) findViewById(R.id.check2);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int clickedButton = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(clickedButton);

                if (radioButton.getText().equals("AND")) {

                    if (firstvariable.isChecked())
                        x = true;
                    else
                        x = false;

                    if (secondvariable.isChecked())
                        y = true;
                    else
                        y = false;

                    if (x && y)
                        answer1.setText("X AND Y = " + "True");
                    else
                        answer1.setText("X AND Y = " + "False");
                }

                else if (radioButton.getText().equals("OR")) {

                    if (firstvariable.isChecked())
                        x = true;
                    else
                        x = false;

                    if (secondvariable.isChecked())
                        y = true;
                    else
                        y = false;

                    if (x || y)
                        answer1.setText("X OR Y = " + "True");
                    else
                        answer1.setText("X OR Y = " + "False");
                }

                else {

                    if (firstvariable.isChecked())
                        x = true;
                    else
                        x = false;

                    if (secondvariable.isChecked())
                        y = true;
                    else
                        y = false;

                    if (x == y)
                        answer1.setText("X XoR Y = " + "False");
                    else
                        answer1.setText("X XoR Y = " + "True");
                }
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(thirdvariable.isChecked())
                    answer2.setText("~(Z) = False");
                else
                    answer2.setText("~(Z) = True");
            }
        });

    }
}
