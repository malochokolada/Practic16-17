package com.example.practicnumber16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Switch
import androidx.annotation.RequiresPermission.Write
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    /*fun onClickSwitchButton(view: View){
        val switch: Switch = findViewById(R.id.switchSetTheme)
        if(switch.isChecked){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    } */

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when (item.itemId) {
            R.id.selected_theme -> {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
                 AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                 else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                startActivity(intent)
            }
           R.id.about_programm -> {
               val intent: Intent = Intent(this@MainActivity,ActivityAboutProgram::class.java)
               startActivity(intent)
       }
        }
        return super.onOptionsItemSelected(item)
    }

    /*fun activAboutProgram(view: View) {
        val menuPro: MenuItem = findViewById(R.id.about_programm)
        if (menuPro.isChecked) {
            val intent: Intent = Intent(this@MainActivity, ActivityAboutProgram::class.java)
            startActivity(intent)
        }
    }*/

    private fun Any.inflate(mainMenu: Int) {

    }
}


