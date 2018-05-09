package it.flatwhite.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;





public class FunFactsActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


       factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //update textview on click
                String fact = factBook.getFact();
                int color = colorWheel.getColor();



                //update screen with new fact
                factTextView.setText(fact);


                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);

            }
        };



        showFactButton.setOnClickListener(listener);



    }



}
