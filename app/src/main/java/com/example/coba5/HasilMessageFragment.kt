package com.example.coba5



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class HasilMessageFragment : Fragment() {

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val liat = inflater.inflate(R.layout.fragment_hasil_message, container, false)
//        val view = inflater.inflate(R.layout.fragment_message, container,false)
//        val tes = view.findViewById<EditText>(R.id.message) as TextView
//        var isi = tes.text.toString()
//        val coba = liat.findViewById<TextView>(R.id.messageTextView)
//        print(isi)
//        coba.setText(isi)
//
////        Inflate the layout for this fragment
////        return inflater.inflate(R.layout.fragment_hasil_message, container, false)
//
//        return liat
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hasil_message, container, false)
        val messageTextView = view.findViewById<TextView>(R.id.messageTextView)
        val messageText = arguments?.getString("messageText")
        messageTextView.text = messageText
        return view

    }

}