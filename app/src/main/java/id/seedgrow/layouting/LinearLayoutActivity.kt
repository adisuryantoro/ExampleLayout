package id.seedgrow.layouting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        supportActionBar!!.setTitle("Linear Layout")

    }
}