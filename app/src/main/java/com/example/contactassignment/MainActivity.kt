package com.example.contactassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()

    }

    fun displayContact() {
        var contactList = listOf<Contact>(
            Contact(
                "Momma Athok",
                "+254715210557",
                "maryathok@gmail.com",
                "https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" +
                        ""
            ),
            Contact(
                "Isaac Ajang",
                "+254798008316",
                "ajangmajok@gmail.com",
                "https://unsplash.com/photos/O3ymvT7Wf9U"
            ),
            Contact(
                "Tabitha Aluel",
                "+254768651609",
                "alueltabitha@gmail.com",
                "https://images.unsplash.com/photo-1539571696357-5a69c17a67c6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" +
                        ""
            ),
            Contact("Awel Majok", "+254712345671", "jamesmwai@gmail.com", "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" +
                    ""),
            Contact("Jungle JMD", "+25474644433", "junglejmd@gmail.com", "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" +
                    ""),
            Contact("Eunice Atieno", "+254761234570", "euniceatieno@gmail.com", "https://unsplash.com/photos/et_78QkMMQs" +
                    ""),
            Contact("Iman Yahya", "+254761234570", "imanyahya@gmail.com", "https://unsplash.com/photos/et_78QkMMQs" +
                    ""),
            Contact("Teejay Aluel", "+254700546789", "teejayaluel@gmail.com", "https://unsplash.com/photos/et_78QkMMQs"),
            Contact("Geraldine Kabatesi", "+254761234570", "geraldinekaba@gmail.com", "https://unsplash.com/photos/et_78QkMMQs"),
            Contact("Edna Mukami", "+254761234570", "ednamukami@gmail.com", "https://unsplash.com/photos/et_78QkMMQs")
        )
        rvContact = findViewById(R.id.rvContacts)
        var ContactRvAdapter = ContactRvAdapter(contactList)
        rvContact.layoutManager = LinearLayoutManager(baseContext)
        rvContact.adapter = ContactRvAdapter

    }
}