package cubex.mahesh.collegeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_request_transcript.*

class RequestTranscript : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_transcript)
 
        submit.setOnClickListener {
            var i = Intent(this@RequestTranscript,
                    DashboardActivity::class.java)
            startActivity(i)
        }
    }
}
