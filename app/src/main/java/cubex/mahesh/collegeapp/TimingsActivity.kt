package cubex.mahesh.collegeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_timings.*

class TimingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timings)

        var position = intent.getIntExtra("position",
                -1)

        when(position)
        {
            0->{
                iview.setBackgroundResource(R.drawable.csc)
            }
            1->{
                iview.setBackgroundResource(R.drawable.engineering)
            }
            2->{
                iview.setBackgroundResource(R.drawable.gs)
            }
            3->{
                iview.setBackgroundResource(R.drawable.pd)
            }
            4->{
                iview.setBackgroundResource(R.drawable.prsb)
            }
            5->{
                iview.setBackgroundResource(R.drawable.map)
                timings.visibility = TextView.INVISIBLE
                working_days.visibility = TextView.INVISIBLE
            }
            else->{
            }
        }

    }
}
