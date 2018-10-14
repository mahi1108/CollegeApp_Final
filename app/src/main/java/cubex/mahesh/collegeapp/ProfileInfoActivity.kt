package cubex.mahesh.collegeapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.Snackbar
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_profile_info.*
import kotlinx.android.synthetic.main.content_profile_info.*

class ProfileInfoActivity : AppCompatActivity() {

    var index = 0

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_info)
       // setSupportActionBar(toolbar)


        var  faculty_index = intent.getIntExtra(
                "faculty_index",0)
        when(faculty_index)
        {
            0->{
                tv1.text = "Dr. Mohammad Abdus Salam "
                profile_layout.background =
                        resources.getDrawable(R.drawable.salam)
                tv2.text = "Email  : md_salam@subr.edu"
                tv3.text = "Office : E107 Henry Thurman Jr. Hall"
                tv4.text = "Phone : 225-771-4383"
                desig.text = "Professor"
                tv2.setOnClickListener {
                    var i = Intent( )
                    i.setAction(Intent.ACTION_SEND)
                    i.putExtra(Intent.EXTRA_EMAIL,
                            arrayOf("md_salam@subr.edu"))
                    i.putExtra(Intent.EXTRA_SUBJECT, "")
                    i.putExtra(Intent.EXTRA_TEXT, "")
                    i.setType("message/rfc822")
                    startActivity(i)
                }
                tv4.setOnClickListener {
                    var status = ContextCompat.checkSelfPermission(
                            this@ProfileInfoActivity,
                            Manifest.permission.CALL_PHONE)
                    if(status==PackageManager.PERMISSION_GRANTED)
                    {

                        var i = Intent( )
                        i.setAction(Intent.ACTION_CALL)
                        i.setData(Uri.parse("tel:2257714383"))
                        startActivity(i)

                    }else {

                        index = 0

                        ActivityCompat.requestPermissions(
                                this@ProfileInfoActivity,
                                arrayOf(Manifest.permission.CALL_PHONE),
                                234)
                    }
                }

            }
            1->{
                tv1.text = "Dr. Shizhong Yong "
                profile_layout.background =
                        resources.getDrawable(R.drawable.yang)
                tv2.text = "Email  : shizhong_yong@subr.edu"
                tv3.text = "Office : E113 Henry Thurman Jr. Hall"
                tv4.text = "Phone : 225-771-3113"
                desig.text = "Associate Professor"
                tv2.setOnClickListener {
                    var i = Intent( )
                    i.setAction(Intent.ACTION_SEND)
                    i.putExtra(Intent.EXTRA_EMAIL,
                            arrayOf("shizhong_yong@subr.edu"))
                    i.putExtra(Intent.EXTRA_SUBJECT, "")
                    i.putExtra(Intent.EXTRA_TEXT, "")
                    i.setType("message/rfc822")
                    startActivity(i)
                }
                tv4.setOnClickListener {
                    var status = ContextCompat.checkSelfPermission(
                            this@ProfileInfoActivity,
                            Manifest.permission.CALL_PHONE)
                    if(status==PackageManager.PERMISSION_GRANTED)
                    {

                        var i = Intent( )
                        i.setAction(Intent.ACTION_CALL)
                        i.setData(Uri.parse("tel:2257713113"))
                        startActivity(i)

                    }else {

                        index = 1

                        ActivityCompat.requestPermissions(
                                this@ProfileInfoActivity,
                                arrayOf(Manifest.permission.CALL_PHONE),
                                234)
                    }
                }
            }
            2->{
                tv1.text = "Dr. Yeser Banadaki "
                profile_layout.background =
                        resources.getDrawable(R.drawable.banadaki)
                tv2.text = "Email  : yaser_banadaki@subr.edu"
                tv3.text = "Office : E114 Henry Thurman Jr. Hall"
                tv4.text = "Phone : 225-771-3941"
                desig.text = "Associate Professor"

                tv2.setOnClickListener {
                    var i = Intent( )
                    i.setAction(Intent.ACTION_SEND)
                    i.putExtra(Intent.EXTRA_EMAIL,
                            arrayOf("yaser_banadaki@subr.edu"))
                    i.putExtra(Intent.EXTRA_SUBJECT, "")
                    i.putExtra(Intent.EXTRA_TEXT, "")
                    i.setType("message/rfc822")
                    startActivity(i)
                }
                tv4.setOnClickListener {
                    var status = ContextCompat.checkSelfPermission(
                            this@ProfileInfoActivity,
                            Manifest.permission.CALL_PHONE)
                    if(status==PackageManager.PERMISSION_GRANTED)
                    {

                        var i = Intent( )
                        i.setAction(Intent.ACTION_CALL)
                        i.setData(Uri.parse("tel:2257713941"))
                        startActivity(i)

                    }else {

                        index = 2

                        ActivityCompat.requestPermissions(
                                this@ProfileInfoActivity,
                                arrayOf(Manifest.permission.CALL_PHONE),
                                234)
                    }
                }
            }
        }
    } // onCreate( )

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>,
                                            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
        {
            var i = Intent( )
            i.setAction(Intent.ACTION_CALL)

            when(index)
            {
                0-> {
                i.setData(Uri.parse("tel:2257714383"))
                }
                1-> {
                    i.setData(Uri.parse("tel:2257713113"))
                }
                2-> {
                    i.setData(Uri.parse("tel:2257713941"))
                }
            }
            startActivity(i)
        }

    }

}
