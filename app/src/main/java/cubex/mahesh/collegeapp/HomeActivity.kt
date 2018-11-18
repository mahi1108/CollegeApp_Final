package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        wview.loadUrl("http://www.subr.edu")
        wview.settings.javaScriptEnabled = true
        wview.settings.builtInZoomControls = true
        wview.settings.javaScriptEnabled = true 

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        startActivity(Intent(this@HomeActivity,
                MainActivity::class.java))


        return super.onOptionsItemSelected(item)
    }



}
