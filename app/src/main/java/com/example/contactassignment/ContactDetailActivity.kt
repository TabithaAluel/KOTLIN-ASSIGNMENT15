package com.example.contactassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ContactDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
        var name=intent.getStringExtra("Aluelo")
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

    }
}