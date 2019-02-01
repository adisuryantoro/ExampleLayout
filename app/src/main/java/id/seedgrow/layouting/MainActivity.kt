package id.seedgrow.layouting

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLinearMain.setOnClickListener({
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        })

        btnRelativeMain.setOnClickListener({
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        })

        btnConstraintMain.setOnClickListener({
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        })
    }
}
