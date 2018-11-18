package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_faculty_tags.*

class FacultyTagsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty_tags)

        submit.setOnClickListener {
            var i = Intent(this@FacultyTagsActivity,
                    DashboardActivity::class.java)
            startActivity(i)
        }
    }
}
