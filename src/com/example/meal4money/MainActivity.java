package com.example.meal4money;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView txtView;
    String hello;
    /** Called when the activity is first created. */
    
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        btn1 = (Button)findViewById(R.id.btn1);
        txtView=(TextView)findViewById(R.id.txtview);
        hello="Chocolate Sundae, Strawberry Sundae, Milo Blast, Coffee Float,Choco Float, Flip Float, Yum Burger, Baked Hash Brown, Jolly Hotdog Regular, Tuna Pie, Crunchy Chicken Burger, Yum with Cheese, Jollibee Spaghetti, 5-pcs. Shanghai Rolls, 1-pc Burger Steak, Beef and Mushroom, Crispy Pork Steak";
        btn1.setOnClickListener(this);
        
        btn2 = (Button)findViewById(R.id.btn2);
        txtView=(TextView)findViewById(R.id.txtview);
        hello="Snack Duo (Crispy Fries and Coke Float), Palabok Fiesta, Chicken and Mushroom Pasta, 1-pc Chickenjoy, Jolly Hotdog Classic, 2-pc Burger Steak, 2-pcs Chicken Joy, Grilled Pork Tenders, Hash Brown Burger";
        btn2.setOnClickListener(this);
        
        btn3 = (Button)findViewById(R.id.btn3);
        txtView=(TextView)findViewById(R.id.txtview);
        hello="1-pc Chicken with Spaghetti, Ultimate Burger Steak with Egg, Champ";
        btn3.setOnClickListener(this);
        
        btn4 = (Button)findViewById(R.id.btn4);
        txtView=(TextView)findViewById(R.id.txtview);
        hello="Chickenjoy Bucket B (8+2 pcs), Chickenjoy Bucket A (6+1 pcs)";
        btn4.setOnClickListener(this);
        
    }
    public void onClick(View view){
        txtView.setText(hello);
    }
}