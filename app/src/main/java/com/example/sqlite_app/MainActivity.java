package com.example.sqlite_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sqlite_app.model.Contact;
import com.example.sqlite_app.data.DatabaseHandler;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

        //count the amount of item in database
        Log.d("Count", "onCreate: "+ db.getCount());


        //need to create a contact object first
        Contact jeremy = new Contact();
        jeremy.setName("Jeremy");
        jeremy.setPhoneNumber("98236732");

        Contact jason = new Contact();
        jason.setName("Jason");
        jason.setPhoneNumber("97163542");

//        Log.d("MainActivity", "onCreate: "+ c.getName()
//                + ", " + c.getPhoneNumber());

        //these method should be commented out after the first use
        //because it will keep adding or delete more in the list

//        db.addContact(jeremy);
//        db.addContact(jason);

//        Get 1 contact to update
//        Contact c = db.getContact(1);
//        c.setName("NewJeremy");
//        c.setPhoneNumber("2341");

        //update a contact
//       int updateRow = db.updateContact(c);
//       Log.d("Row", "onCreate: "+ updateRow);

        //delete a contact
//        db.deleteContact(c);

        List<Contact> contactList = db.getAllContacts();

        // a for loop that everytime get a contactList
        // will be added to the context Object
        for (Contact contact: contactList){
            Log.d("MainActivity", "onCreate: "
                    + contact.getName() + " "
                    + contact.getPhoneNumber()+ " id: "
                    + contact.getId());
        }



    }
}