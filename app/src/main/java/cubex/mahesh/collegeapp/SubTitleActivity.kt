package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_sub_title.*

class SubTitleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_title)
       /* var adapter = ArrayAdapter<String>(this@SubTitleActivity,
                android.R.layout.simple_list_item_single_choice,
                child_elements)
        subtitiles_lview.adapter = adapter
        subtitiles_lview.setOnItemClickListener { adapterView, view, i, l ->
            var i = Intent(this@SubTitleActivity,
                    TimingsActivity::class.java)
            startActivity(i)
        }*/
    }
}
