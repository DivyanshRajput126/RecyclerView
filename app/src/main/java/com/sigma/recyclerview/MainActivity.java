package com.sigma.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView recyclerView;
        ArrayList<contact_model>  arrContacts= new ArrayList<>();

//        This is new Change

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyansh", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyansh", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyansh", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyansh", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyansh", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));
        arrContacts.add(new contact_model(R.drawable.cont, "Divyans", "9023848410"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}