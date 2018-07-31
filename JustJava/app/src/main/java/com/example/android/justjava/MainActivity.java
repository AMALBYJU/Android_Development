package com.example.android.justjava;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**

 * This app displays an order form to order coffee.

 */

public class MainActivity extends AppCompatActivity {

    int quantity;
    float price;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        quantity = 0;
        price = 0;
        setContentView(R.layout.activity_main);

    }


    public void increment(View view) {
        // Number of cups of coffee should not go above 100
        if(quantity == 100)
            return;
        quantity++;
        TextView qty = (TextView)findViewById(R.id.qty_text_view);
        qty.setText(Integer.toString(Integer.parseInt(qty.getText().toString()) + 1));
        // Inserting a toast
        Context context = this;
        int duration = Toast.LENGTH_SHORT;
        Toast inc_msg = Toast.makeText(context,getString(R.string.msg_inc,"Incrementing"),duration);
        inc_msg.show();

    }

    public void decrement(View view) {
        if(quantity == 0)
            return;
        quantity--;
        TextView qty = (TextView)findViewById(R.id.qty_text_view);
        qty.setText(Integer.toString(Integer.parseInt(qty.getText().toString()) - 1));
        // Inserting a toast
        Context context = this;
        int duration = Toast.LENGTH_SHORT;
        Toast dec_msg = Toast.makeText(context,"Decrementing",duration);
        dec_msg.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
        dec_msg.show();
    }

    public void addCream(View view)
    {
        CheckBox wc = (CheckBox)findViewById(R.id.checkbox_whipped_cream);
        TextView qty = (TextView)findViewById(R.id.qty_text_view);
        if(wc.isChecked() == true)
            price +=5;
        else
            price-=5;

    }

    public void order(View view)
    {
        TextView bill = (TextView)findViewById(R.id.bill);
        EditText name = (EditText)findViewById(R.id.edit_text);
        CheckBox wc = (CheckBox)findViewById(R.id.checkbox_whipped_cream);
        bill.setText("Name : " + name.getText() + "\n" + "Price = " + Float.toString(Float.valueOf(quantity * 10 + price)));
        /* // To show a map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:47.6,-122.3"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        */
        // To show email

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, R.string.email_id);
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject));
        intent.putExtra(Intent.EXTRA_TEXT, name.toString() + "\n" + Float.toString(price) + "\n");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
