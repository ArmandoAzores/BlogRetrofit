package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.RelativeLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    lateinit var relativeLayout:RelativeLayout
    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-------------------Hooks----------------------
        drawerLayout = findViewById(R.id.drawer_layout) //This is our MainActivity layout
//        relativeLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)
        toolBar = findViewById<Toolbar>(R.id.toolbar2)

        //--------------ToolBar-----------------------------
        setSupportActionBar(toolBar)
        //-------Navigation Drawer Menu-------------------
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
}