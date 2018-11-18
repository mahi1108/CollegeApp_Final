package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_payroll.*

class PayrollActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payroll)

        submit.setOnClickListener {
            startActivity(Intent(this@PayrollActivity,
                            DashboardActivity::class.java))
        }
    }
}
