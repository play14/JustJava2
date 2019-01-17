/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayQuantity(int number){
        TextView quantityTextView = (TextView)findViewById(
                R.id.countOrder);
        quantityTextView.setText(""+ number);
    }
    /**
     *
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     *
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String drinkType = "Espresso";
        String priceMessage = "Amount Due: RM" + price;
        priceMessage = priceMessage + "\nType: " + drinkType + "\nThank You!";
        displayMessage(priceMessage);

        calculatePrice();

    }

    /**
     *
     * Calculate the price of the order.
     *

     */
    private void calculatePrice(){
        int price = this.quantity * 5;

    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.sum);
        priceTextView.setText(message);
    }
}
