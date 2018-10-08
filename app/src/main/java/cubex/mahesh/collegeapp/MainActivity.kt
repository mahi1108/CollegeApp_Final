package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler( )
        handler.postDelayed({

            var i = Intent(this@MainActivity,
                    DashboardActivity::class.java)
            startActivity(i)

        },4000)

    }
}
