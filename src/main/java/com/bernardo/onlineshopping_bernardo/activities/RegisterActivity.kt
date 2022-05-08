package com.bernardo.onlineshopping_bernardo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.bernardo.onlineshopping_bernardo.R
import com.google.android.gms.tasks.OnCompleteListener


class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_register: Button = findViewById(R.id.btn_register)
        btn_register.setOnClickListener {
        }}
        }

        /**when {
            TextUtils.isEmpty(et_email.text.toString().trim { it <= ' ' }) -> {
                Toast.makeText(
                    this@RegisterActivity,
                    "Please enter email.",
                    Toast.LENGTH_SHORT
                ).show()
            }

            TextUtils.isEmpty(et_register_password.text.toString().trim { it <= ' ' }) -> {
                Toast.makeText(
                    this@RegisterActivity,
                    "Please enter password.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else -> {

                val email: String = et_register_email.text.toString().trim { it <= ' ' }
                val password: String = et_register_password.text.toString().trim { it <= ' ' }

                // Create an instance and create a register a user with email and password.
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(
                        OnCompleteListener<AuthResult> { task ->

                            // If the registration is successfully done
                            if (task.isSuccessful) {

                                // Firebase registered user
                                val firebaseUser: FirebaseUser = task.result!!.user!!

                                Toast.makeText(
                                    this@RegisterActivity,
                                    "You are registered successfully.",
                                    Toast.LENGTH_SHORT
                                ).show()



                                val intent =
                                    Intent(this@RegisterActivity, MainActivity::class.java)
                                intent.flags =
                                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                intent.putExtra("user_id", firebaseUser.uid)
                                intent.putExtra("email_id", email)
                                startActivity(intent)
                                finish()
                            } else {
                                // If the registering is not successful then show error message.
                                Toast.makeText(
                                    this@RegisterActivity,
                                    task.exception!!.message.toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        })
            }
        }
    }
    // END

    // TODO Step 14: Assign the click event to the Login text and launch the login screen.
    // START
    tv_login.setOnClickListener {

        onBackPressed()
    }
    // END
    */



