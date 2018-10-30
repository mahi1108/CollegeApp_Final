package cubex.mahesh.collegeapp

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
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
                working_days.setText("Add and drop classes")
                timings.setText("Request for Transcript")
                faculties.visibility = Button.VISIBLE
                faculties.setText("Graduate School Admissions")
                faculties.setBackgroundColor(Color.WHITE)
                faculties.setTextColor(Color.GRAY)
                faculties.gravity = Gravity.LEFT

                fees.visibility = Button.INVISIBLE
                stags.visibility = Button.INVISIBLE
                ftags.visibility = Button.INVISIBLE


                working_days.setOnClickListener {
                        var i = Intent( )
                        i.setAction(Intent.ACTION_VIEW)
                        i.setData(Uri.parse("https://ssbprd.subr.edu/PROD8/twbkwbis.P_WWWLogin"))
                        startActivity(i)
                }

                faculties.setOnClickListener {
                    var i = Intent( )
                    i.setAction(Intent.ACTION_VIEW)
                    i.setData(Uri.parse("https://ssbprd.subr.edu/PROD8/twbkwbis.P_WWWLogin"))
                    startActivity(i)
                }


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
                working_days.setText("Cashier's office")
                timings.setText("Payroll office")
                faculties.visibility = Button.VISIBLE
                faculties.setText("Fee differment request")
                faculties.setBackgroundColor(Color.WHITE)
                faculties.setTextColor(Color.GRAY)
                faculties.gravity = Gravity.LEFT


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
