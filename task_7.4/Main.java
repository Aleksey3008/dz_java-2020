package android.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int quantity = 0;
    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;
    HashMap goodsMap;
    String goodsName;
    double price;
    EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.nameEditText);
        createSpinner();
        createMap();

    }
    void createSpinner(){
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        spinnerArrayList=new ArrayList();
        spinnerArrayList.add("flute");
        spinnerArrayList.add("trumpet");
        spinnerArrayList.add("whistle");
        spinnerAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
    }
    void createMap(){
        goodsMap=new HashMap();
        goodsMap.put("flute", 230.0);
        goodsMap.put("trumpet", 380.0);
        goodsMap.put("whistle", 60.0);
    }

    public void increasQuantity(View view) {
        quantity = quantity + 1;
        TextView quantityTextView =findViewById(R.id.quantityTextView);
        quantityTextView.setText("" +quantity);
        TextView priceTextView = findViewById(R.id.priceTextView);
        priceTextView.setText("" + quantity * price);
    }

    public void descreaseQuantity(View view) {
        quantity = quantity - 1;
        if (quantity<0){
            quantity=0;
        }
        TextView quantityTextView =findViewById(R.id.quantityTextView);
        quantityTextView.setText("" +quantity);
        TextView priceTextView = findViewById(R.id.priceTextView);
        priceTextView.setText("" + quantity * price);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        goodsName = spinner.getSelectedItem().toString();
        price =(double)goodsMap.get(goodsName);
        TextView priceTextView = findViewById(R.id.priceTextView);
        priceTextView.setText("" + quantity * price);
        ImageView goodsImageView = findViewById(R.id.goodsImageView);
        switch (goodsName) {
            case "music":
                goodsImageView.setImageResource(R.drawable.music);
                break;
            case "trumpet":
                goodsImageView.setImageResource(R.drawable.trumpet);
                break;
            case "whistle":
                goodsImageView.setImageResource(R.drawable.whistle);
                break;
            default:
                goodsImageView.setImageResource(R.drawable.music);
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void addToCart(View view) {

        Order order = new Order();
        order.userName = userNameEditText.getText().toString();
        Log.d("UserName",order.userName);

        order.goodsName = goodsName;

        order.quantity = quantity;

        order.price = price;


        order.orderPrice = quantity*price;
        Intent orderIntent = new Intent(MainActivity.this, OrderActivity.class);
        orderIntent.putExtra("userNameForIntent",order.userName);
        orderIntent.putExtra("goodsName",order.goodsName);
        orderIntent.putExtra("quantity",order.quantity);
        orderIntent.putExtra("price",order.price);
        orderIntent.putExtra("orderPrice",order.orderPrice);

        startActivity(orderIntent);


    }
}
