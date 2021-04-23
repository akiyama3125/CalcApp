package jp.techacademy.takashige.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View){
        val intent = Intent(this, SecondActivity::class.java)
        if (editText1.text.toString().length != 0 && editText2.text.toString().length != 0) {
            if (v.id == R.id.button1) {
                val value1: Float = editText1.text.toString().toFloat()
                val value2: Float = editText2.text.toString().toFloat()
                val value = value1 + value2
                intent.putExtra("VALUE", value)
            } else if (v.id == R.id.button2) {
                val value1: Float = editText1.text.toString().toFloat()
                val value2: Float = editText2.text.toString().toFloat()
                val value = value1 - value2
                intent.putExtra("VALUE", value)
            } else if (v.id == R.id.button3) {
                val value1: Float = editText1.text.toString().toFloat()
                val value2: Float = editText2.text.toString().toFloat()
                val value = value1 * value2
                intent.putExtra("VALUE", value)
            } else if (v.id == R.id.button4) {
                val value1: Float = editText1.text.toString().toFloat()
                val value2: Float = editText2.text.toString().toFloat()
                val value = value1 / value2
                intent.putExtra("VALUE", value)
            }
            startActivity(intent)
        } else {
        }
    }
}