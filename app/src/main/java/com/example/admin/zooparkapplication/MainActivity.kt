
package com.example.admin.zooparkapplication

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_animalinfo.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.ticket.view.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        var listOfAnimals= arrayListOf<Animal>();
        var adapter:AnimalAdapter?=null;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOfAnimals.add(Animal("Horse",
            "this horse lives in zoo",
            R.drawable.horse))

        listOfAnimals.add(Animal("Wolf",
            "this Wolf lives in zoo",
            R.drawable.wolf))

        listOfAnimals.add(Animal("iremi",
            "this iremi lives in zoo",
            R.drawable.iremi));

        listOfAnimals.add(Animal("Tiger",
            "this tiger lives in zoo",
            R.drawable.rsz_tiger0))


        adapter= AnimalAdapter(this,listOfAnimals);
        tvListAnimal.adapter=adapter;





    }





     class AnimalAdapter:BaseAdapter{

       var listofAnimals= ArrayList<Animal>();
         var context:Context?=null;

        constructor(context:Context,listofAnimals: ArrayList<Animal>):super(){
            this.listofAnimals=listofAnimals;
            this.context=context;


        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

           var animal= listofAnimals[position];
            //qveda funqcia gaarchie detalurad
            var inflator= context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
            var myView= inflator.inflate(R.layout.ticket,null);
            myView.textViewDesc.text=animal.Description!!;
            myView.textViewName.text=animal.Name!!;
            myView.ivAnumalimage.setImageResource(animal.Image!!);
              //@got few bugs here
           /* myView.ivAnumalimage.setOnClickListener(){
               val intent=Intent(context,Animalinfo::class.java);
                intent.putExtra("name",animal.Name!!);
                intent.putExtra("desc",animal.Description!!);
                intent.putExtra("image",animal.Image!!);

                context!!.startActivity(intent);


            }
         */




            return myView;
        }

        override fun getItem(position: Int): Any {
            return listofAnimals[0];
        }

        override fun getItemId(position: Int): Long {
            return position.toLong();
        }

        override fun getCount(): Int {
           return listofAnimals.size;
        }

    }
}
