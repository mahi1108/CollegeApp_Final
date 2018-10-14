package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
            0->{  // computer science building
                iview.setBackgroundResource(R.drawable.csc)
                working_days.setText("Working Days: Monday - Friday")
                timings.setText("Timings: 8AM - 7PM")

                faculties.setOnClickListener {
                    var i = Intent(this@TimingsActivity,
                                                FacultiesActivity::class.java)
                    startActivity(i)
                }

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE
                faculties.visibility = Button.VISIBLE


            }
            1->{   // engineering building
                iview.setBackgroundResource(R.drawable.engineering)
                working_days.setText("Working Days: Monday - Friday")
                timings.setText("Timings: 8AM - 7PM")

                faculties.visibility = Button.INVISIBLE

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE

            }
            2->{  // graduate school
                iview.setBackgroundResource(R.drawable.gs)
                working_days.setText("Working Days: Monday - Friday")
                timings.setText("Timings: 8AM - 5PM")
                faculties.visibility = Button.INVISIBLE

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE

            }
            3->{ // police department
                iview.setBackgroundResource(R.drawable.pd)
                working_days.setText("Working Days: Monday - Friday")
                timings.setText("Timings: 8AM - 5PM")
                faculties.visibility = Button.INVISIBLE

                fees.visibility = Button.VISIBLE
                stags.visibility = Button.VISIBLE
                ftags.visibility = Button.VISIBLE
            }
            4->{ // president building
                iview.setBackgroundResource(R.drawable.prsb)
                working_days.setText("Working Days: Monday - Friday")
                timings.setText("Timings: 8AM - 5PM")
                faculties.visibility = Button.INVISIBLE

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE

            }
            5->{
                iview.setBackgroundResource(R.drawable.map)
                timings.visibility = TextView.INVISIBLE
                working_days.visibility = TextView.INVISIBLE
                faculties.visibility = Button.INVISIBLE

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE

            }
            else->{
            }
        }

    }
}
