package com.example.a2ndassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.example.a2ndassignment.fragments.AreaofCircleFragment;
import com.example.a2ndassignment.fragments.AutomorphicFragment;
import com.example.a2ndassignment.fragments.PalindromeFragment;
import com.example.a2ndassignment.fragments.ReverseFragment;
import com.example.a2ndassignment.fragments.ReverseStringFragment;
import com.example.a2ndassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity{

    Button btnSum,btnArea,btnReverseNumber,btnPalindrome,btnautoMorphicNumber,btnReverseString;

   // private String status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSum=findViewById(R.id.btnAdd);
        btnArea=findViewById(R.id.btnArea);
        btnReverseNumber=findViewById(R.id.btnReverseNumber);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnautoMorphicNumber=findViewById(R.id.btnAutomorphic);
        btnReverseString=findViewById(R.id.btnReverseString);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumFragment);
                fragmentTransaction.commit();
            }
        });


        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaofCircleFragment areaofCircle=new AreaofCircleFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,areaofCircle);
                fragmentTransaction.commit();
            }
        });

        btnReverseNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnautoMorphicNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });


        btnReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseStringFragment stringRevFragment=new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,stringRevFragment);
                fragmentTransaction.commit();

            }
        });

    }
}