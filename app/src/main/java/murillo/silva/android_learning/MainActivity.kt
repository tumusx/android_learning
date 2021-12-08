package murillo.silva.android_learning

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener {


            number.setAutofillHints(View.AUTOFILL_HINT_CREDIT_CARD_NUMBER)
            val nbNume = number.text.toString()
            val texto = editTexto.text.toString()
            Toast.makeText(this, texto + nbNume, Toast.LENGTH_SHORT).show()

        }

    }
}