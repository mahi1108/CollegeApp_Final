package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_student_tags.*

class StudentTagsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_tags)

        submit.setOnClickListener {
            var i = Intent(this@StudentTagsActivity,
                    DashboardActivity::class.java)
            startActivity(i)
        }

    }
}
