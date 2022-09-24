package app.test.checkedtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checked = findViewById<CheckedTextView>(R.id.checked)

        checked.setOnClickListener {
            if (checked.isChecked){
                checked.text = "Not Checked"
                checked.isChecked = false
            }else{
                checked.text = "Checked"
                checked.isChecked = true
            }
        }

    }
}