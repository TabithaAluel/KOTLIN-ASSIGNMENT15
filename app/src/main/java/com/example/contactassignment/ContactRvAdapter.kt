package com.example.contactassignment

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactList:List<Contact>, var context:Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text = currentContact.name
        holder.tvEmail.text = currentContact.email
        holder.tvPhone.text = currentContact.phone
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .placeholder(R.drawable.woww)
            .into(holder.ivcontact)

        holder.cvcontact.setOnClickListener {
            var intent= Intent(context,ContactDetailActivity::class.java)
            intent.putExtra("NAME",currentContact.name)

        }
    }

    override fun getItemCount(): Int {
       return contactList.size
    }
}
class ContactViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhone = itemView.findViewById<TextView>(R.id.tvPhone)
    var ivcontact=itemView.findViewById<ImageView>(R.id.ivcontact)
    var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)

}