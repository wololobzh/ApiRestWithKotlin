package fr.acos.apirestwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONObject
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread(
                {
                    val result = URL("https://api.chucknorris.io/jokes/random").readText()
                    Log.i("XXX","Retour : $result");


                    /*val jsonObjet = JSONObject(result)
                    val citation = jsonObjet.getString("value")

                    Log.i("XXX","Citation : $citation");*/
                }
        ).start()

    }
}
