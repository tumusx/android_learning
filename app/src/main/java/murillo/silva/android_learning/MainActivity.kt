package murillo.silva.android_learning

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener {

            val nbNume = number.text.toString()
            val texto = editTexto.text.toString()
            Toast.makeText(this, texto + nbNume, Toast.LENGTH_SHORT).show()

        }

    }
}