package com.thiagok.componentizacao

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.thiagok.componentizacao.Extensions.onChange


class MainActivity : AppCompatActivity() {

    var etPass1: EditText? = null
    var etPass2: EditText? = null
    var etPass3: EditText? = null
    var etPass4: EditText? = null
    var etPass5: EditText? = null
    var etPass6: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        etPass1 = findViewById(R.id.etPass1)
        etPass2 = findViewById(R.id.etPass2)
        etPass3 = findViewById(R.id.etPass3)
        etPass4 = findViewById(R.id.etPass4)
        etPass5 = findViewById(R.id.etPass5)
        etPass6 = findViewById(R.id.etPass6)

        etPass1!!.onChange {  }
        etPass2!!.onChange {  }
        etPass3!!.onChange {  }
        etPass4!!.onChange {  }
        etPass5!!.onChange {  }
        etPass6!!.onChange {  }
    }

    fun btClicked(view: View){
        Toast.makeText(this, etPass1!!.text.toString() +
                etPass2!!.text.toString() +
                etPass3!!.text.toString() +
                etPass4!!.text.toString() +
                etPass5!!.text.toString() +
                etPass6!!.text.toString() , Toast.LENGTH_LONG).show()
    }
}

