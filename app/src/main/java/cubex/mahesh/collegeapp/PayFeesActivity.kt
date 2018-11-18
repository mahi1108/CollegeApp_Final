package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_pay_fees.*

class PayFeesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_fees)

        payfees.setOnClickListener {

            payment_layout.visibility = LinearLayout.VISIBLE

            submit.setOnClickListener {

                var i = Intent(this@PayFeesActivity,
                        DashboardActivity::class.java)
                startActivity(i)

            }
        }
    }
}
