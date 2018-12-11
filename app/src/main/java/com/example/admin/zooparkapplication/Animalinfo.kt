package com.example.admin.zooparkapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animalinfo.*
import kotlinx.android.synthetic.main.ticket.*

class Animalinfo : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_animalinfo)


            val bundle:Bundle=intent.extras; //reading data
            val name=bundle.getString("name");
            val des=bundle.getString("desc");
            val image=bundle.getInt("image");

            ivAnumalimage.setImageResource(image);
            tvName.text=name;
            tvDesc.text=des;


        }
}
