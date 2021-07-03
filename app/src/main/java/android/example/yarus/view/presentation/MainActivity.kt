package android.example.yarus.view.presentation

import android.example.yarus.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_YaRus)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.locations -> {
                    navController.navigate(R.id.locationFragment)
                    true
                }
                R.id.heroes -> {
                    navController.navigate(R.id.heroesFragment)
                    true
                }
                R.id.episodes -> {
                    navController.navigate(R.id.episodesFragment)
                    true
                }
                else -> false
            }
        }
    }
}