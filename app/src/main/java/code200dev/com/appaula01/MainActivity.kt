package code200dev.com.appaula01

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    protected val CATEGORIA = "AULA"
    var btnteste:Button = btnTeste
    var txt:EditText = txtTeste

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Logger.getLogger(MainActivity::class.java.name).info("modafuck")
        Log.i("aula" , "Ola logcat");


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        btnteste.setOnClickListener({
            Toast.makeText(this@MainActivity, "click on button", Toast.LENGTH_LONG).show()
        })
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", getClassName() + ".onStart() chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.i(CATEGORIA, getClassName() + ".onResume() chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.i(CATEGORIA, getClassName() + ".onPause() chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.i(CATEGORIA, getClassName() + ".onStop() chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado.")
    }

    private fun getClassName(): String {
        //Retorna o nome da classe sem o pacote
        val s = javaClass.name
        return s.substring(s.lastIndexOf("."))
    }

}

