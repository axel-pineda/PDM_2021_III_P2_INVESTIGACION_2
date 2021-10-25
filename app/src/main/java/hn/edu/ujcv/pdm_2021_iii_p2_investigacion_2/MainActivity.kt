package hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}