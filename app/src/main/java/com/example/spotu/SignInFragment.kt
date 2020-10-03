package com.example.spotu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.forgot_password).setOnClickListener {
            findNavController().navigate(R.id.action_SignInFragment_to_ForgotPasswordFragment)
        }

        view.findViewById<TextView>(R.id.register).setOnClickListener {
            findNavController().navigate(R.id.action_SignInFragment_to_SignUpStartFragment)
        }

        view.findViewById<TextView>(R.id.btn_submit).setOnClickListener {
            val intent = Intent(this.context, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}