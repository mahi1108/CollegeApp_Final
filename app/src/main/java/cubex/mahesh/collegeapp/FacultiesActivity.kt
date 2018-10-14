package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_faculties.*

class FacultiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculties)

        drmhmd.setOnClickListener {

            var i = Intent(this@FacultiesActivity,
                                ProfileInfoActivity::class.java)
            i.putExtra("faculty_index",0)
            startActivity(i)
        }

        drshizhong.setOnClickListener {
            var i = Intent(this@FacultiesActivity,
                    ProfileInfoActivity::class.java)
            i.putExtra("faculty_index",1)
            startActivity(i)
        }
        dryeser.setOnClickListener {
            var i = Intent(this@FacultiesActivity,
                    ProfileInfoActivity::class.java)
            i.putExtra("faculty_index",2)
            startActivity(i)
        }



    }
}
