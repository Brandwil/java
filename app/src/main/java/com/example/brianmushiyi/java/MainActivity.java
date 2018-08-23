package com.example.brianmushiyi.java;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
int quantity;
    int price;
    String priceMessage;
Button mSubmitOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mSubmitOrder = findViewById(R.id.submit_order);
        mSubmitOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitOrder(view);
            }
        });
    }
    public void increment (View view) {
          quantity = quantity + 1;
        display (quantity);

    }
    public void decrement (View view) {
        if (quantity>=1) {
            quantity = quantity - 1;
            display(quantity);
        } else {
            Toast.makeText(this, "You must Order At list 1 cup", Toast.LENGTH_SHORT).show();
        }

    }


    public void submitOrder (View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        Log.v("MainActivity","Has Whipped cream:"+ hasWhippedCream);
 price = quantity*5;
 priceMessage = "Total: ksh"+ price;
priceMessage = priceMessage +"\nThank you!";
displayMessage(priceMessage);
feedback(view);

        displayPrice(quantity *5);
    }

    private void displayMessage(String priceMessage) {
      String  message ="Karibu";
    }

    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


public void feedback(View view) {
        Toast.makeText(this, "Thank You Customer", Toast.LENGTH_SHORT).show();
        openMessage(view);
        }

public void openMessage(View view)
        {

        Intent intent = new Intent( this, com.example.brianmushiyi.java.Message.class);


        startActivity(intent);

        }
        public String createOrderSummary(int price){
        String priceMessage = "Name:Brian Mushiyi";
        priceMessage +="\nQantity:"+ quantity;
        priceMessage +="\nTotal: ksh"+ price;
        priceMessage +="\nThank you!";
        return priceMessage;


        }
        public void submitButton (View view){
            findViewById(R.id.edit_text_view);

        }

}

