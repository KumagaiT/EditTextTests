package com.thiagok.componentizacao.Extensions

import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import com.thiagok.componentizacao.R


fun EditText.onChange(cb: (String) -> Unit) {
    this.addTextChangedListener(object: TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            cb(s.toString())
            if(text.isNotEmpty() && focusSearch(View.FOCUS_RIGHT) != null){
                focusSearch(View.FOCUS_RIGHT).requestFocus()
            }
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }                                                                                                
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
    })

    this.setOnKeyListener { p0, p1, p2 ->
        if (p1 == KeyEvent.KEYCODE_DEL){
            if (!text.isNullOrEmpty()){
                setText("")
            } else if (focusSearch(View.FOCUS_LEFT) != null){
                focusSearch(View.FOCUS_LEFT).requestFocus()
            }
//            if(text.isNullOrEmpty() && focusSearch(View.FOCUS_LEFT) != null){
//            }else if (!text.isNullOrEmpty()){
//                setText("")
//            }
        }
        println("HUE " + text.toString())
        true
    }
}