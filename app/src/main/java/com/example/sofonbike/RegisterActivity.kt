package com.example.sofonbike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.FirebaseDatabaseKtxRegistrar
import java.lang.ref.PhantomReference

class RegisterActivity : AppCompatActivity() {

    private lateinit var txtName: EditText
    private lateinit var txtLastName: EditText
    private lateinit var txtEmail: EditText
    private lateinit var txtPassword: EditText
    private lateinit var progressBar: ProgressBar
    private lateinit var dbReference: DatabaseReference
    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        txtName=findViewById(R.id.txtName)
        txtLastName=findViewById(R.id.txtLastName)
        txtEmail=findViewById(R.id.txtEmail)
        txtPassword=findViewById(R.id.txtPassword)

        progressBar= findViewById(R.id.progressBar)

        database= FirebaseDatabase.getInstance()
        auth= FirebaseAuth.getInstance()

        dbReference=database.reference.child("User")
    }

    fun register(view: View){

    }

    private fun createNewAccount(){
        val name:String=txtName.text.toString()
        val lastName:String=txtLastName.text.toString()
        val email:String=txtEmail.text.toString()
        val password:String=txtPassword.text.toString()

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(lastName) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){

        }
    }
}