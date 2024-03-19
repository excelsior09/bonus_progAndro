package com.example.coba5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.navigation.findNavController


class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val startButton = view.findViewById<Button>(R.id.next)
        val messageEditText = view.findViewById<EditText>(R.id.message)
        startButton.setOnClickListener {
            val bundle = Bundle().apply {
                putString("messageText", messageEditText.text.toString())
            }
            view.findNavController()
                .navigate(R.id.action_messageFragment_to_hasilMessageFragment, bundle)
        }
        return view
    }
}