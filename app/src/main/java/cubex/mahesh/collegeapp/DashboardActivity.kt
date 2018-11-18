package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.NumberPicker
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : AppCompatActivity() {
     var titles:MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        titles!!.add("Computer Science Building")
       // titles!!.add("Engineering Building")
        titles!!.add("Graduate School")
        titles!!.add("Police Department")
        titles!!.add("President Building")
        titles!!.add("Map")

        var my_adapter = ArrayAdapter<String>(this@DashboardActivity,
                R.layout.indi_tv, titles)
        lview.adapter = my_adapter
        lview.setOnItemClickListener { adapterView, view,pos, l ->

            var i = Intent(this@DashboardActivity,
                    TimingsActivity::class.java)
            i.putExtra("position",pos)
            startActivity(i)

        }


    } // onCreate( )
}
