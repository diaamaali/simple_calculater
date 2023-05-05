package com.example.simple_calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner1);


        CalData cal=new CalData();
        String [] types = cal.getCalOpSpinner();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types);
        spinner.setAdapter(adapter); // set the adapter to the spinner in the xml file


        spinner.setOnItemSelectedListener(this);
        ImageView im = (ImageView) findViewById(R.id.imageView7);
        ImageView imm = (ImageView) findViewById(R.id.imageView8);
        im.setVisibility(View.INVISIBLE);
        im.setVisibility(android.view.View.GONE);
        imm.setVisibility(View.INVISIBLE);
        imm.setVisibility(android.view.View.GONE);
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setVisibility(View.INVISIBLE);
        tv.setVisibility(android.view.View.GONE);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
//////////////////////////////////////////////////////////////////////////////

    public void add(View v) {
        ImageView im = (ImageView) findViewById(R.id.imageView7);
        ImageView imm = (ImageView) findViewById(R.id.imageView8);
        TextView tv = (TextView) findViewById(R.id.textView2);
        EditText ed1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText ed2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText ed3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText ed4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int n3 = Integer.parseInt(ed4.getText().toString());

        int res = n1 + n2;
        ed3.setText("True Result = " + res);

        if (res == n3) {
            tv.setVisibility(View.VISIBLE);
            im.setVisibility(View.VISIBLE);
            tv.setText("GOOD JOB same answers");
            tv.setTextColor(Color.GREEN);
            imm.setVisibility(View.INVISIBLE);
        } else {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Unfortunately, your answer is wrong");
            tv.setTextColor(Color.RED);
            im.setVisibility(View.INVISIBLE);
            imm.setVisibility(View.VISIBLE);

        }


    }



//////////////////////////////////////////////////////////////////////////////

    public void sub(View v) {
        ImageView im = (ImageView) findViewById(R.id.imageView7);
        ImageView imm = (ImageView) findViewById(R.id.imageView8);
        TextView tv = (TextView) findViewById(R.id.textView2);
        EditText ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText ed2=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText ed3=(EditText)findViewById(R.id.editTextTextPersonName3);
        EditText ed4 = (EditText) findViewById(R.id.editTextTextPersonName4);

        int n1=  Integer.parseInt(ed1.getText().toString());
        int n2=  Integer.parseInt(ed2.getText().toString());
        int n3 = Integer.parseInt(ed4.getText().toString());

        int res=n1-n2;
        ed3.setText(" Result = "+res);

        if (res == n3) {
            tv.setVisibility(View.VISIBLE);
            tv.setText("GOOD JOB same answers");
            tv.setTextColor(Color.GREEN);
            im.setVisibility(View.VISIBLE);
            imm.setVisibility(View.INVISIBLE);

        } else {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Unfortunately, your answer is wrong");
            tv.setTextColor(Color.RED);
            im.setVisibility(View.INVISIBLE);
            imm.setVisibility(View.VISIBLE);

        }
    }




//////////////////////////////////////////////////////////////////////////////

    public void mul(View v) {
        ImageView im = (ImageView) findViewById(R.id.imageView7);
        ImageView imm = (ImageView) findViewById(R.id.imageView8);
        TextView tv = (TextView) findViewById(R.id.textView2);
        EditText ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText ed2=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText ed3=(EditText)findViewById(R.id.editTextTextPersonName3);
        EditText ed4 = (EditText) findViewById(R.id.editTextTextPersonName4);

        int n1=  Integer.parseInt(ed1.getText().toString());
        int n2=  Integer.parseInt(ed2.getText().toString());
        int n3 = Integer.parseInt(ed4.getText().toString());

        int res=n1*n2;
        ed3.setText(" Result = "+res);

        if (res == n3) {
            tv.setVisibility(View.VISIBLE);
            tv.setText("GOOD JOB same answers");
            tv.setTextColor(Color.GREEN);
            im.setVisibility(View.VISIBLE);
            imm.setVisibility(View.INVISIBLE);

        } else {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Unfortunately, your answer is wrong");
            tv.setTextColor(Color.RED);
            im.setVisibility(View.INVISIBLE);
            imm.setVisibility(View.VISIBLE);

        }
    }



//////////////////////////////////////////////////////////////////////////////

    public void div(View v) {
        ImageView im = (ImageView) findViewById(R.id.imageView7);
        ImageView imm = (ImageView) findViewById(R.id.imageView8);
        TextView tv = (TextView) findViewById(R.id.textView2);
        EditText ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText ed2=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText ed3=(EditText)findViewById(R.id.editTextTextPersonName3);
        EditText ed4 = (EditText) findViewById(R.id.editTextTextPersonName4);

        int n1=  Integer.parseInt(ed1.getText().toString());
        int n2=  Integer.parseInt(ed2.getText().toString());
        int n3 = Integer.parseInt(ed4.getText().toString());

        int res=n1/n2;
        ed3.setText(" Result = "+res);

        if (res == n3) {
            tv.setVisibility(View.VISIBLE);
            tv.setText("GOOD JOB same answers ");
            tv.setTextColor(Color.GREEN);
            im.setVisibility(View.VISIBLE);
            imm.setVisibility(View.INVISIBLE);

        } else {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Unfortunately, your answer is wrong");
            tv.setTextColor(Color.RED);
            im.setVisibility(View.INVISIBLE);
            imm.setVisibility(View.VISIBLE);

        }
    }



}