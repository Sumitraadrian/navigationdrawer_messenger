package lat.pam.navigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerlayout)
        val imageMenu = findViewById<ImageView>(R.id.imageMenu) // Menambahkan inisialisasi imageMenu

        imageMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        // Inisialisasi NavController
        val navController: NavController = Navigation.findNavController(this, R.id.fragmentNav)

        // Inisialisasi NavigationView (pastikan Anda telah menambahkan id "navigationView" ke layout Anda)
        val navigationView = findViewById<NavigationView>(R.id.navigationView)

        // Menghubungkan NavigationView dengan NavController
        NavigationUI.setupWithNavController(navigationView, navController)
    }
}
        // Jika Anda memiliki NavigationView, Anda harus mendeklarasikan dan menginisialisasi-nya juga
        // val navigationView = findViewById<NavigationView>(R.id.navigationView)
        // navigationView.setNavigationItemSelectedListener { menuItem ->
        //     when (menuItem.itemId) {
        //         R.id.item1 -> {
        //             // Handle item1 click
        //             true
        //         }
        //         R.id.item2 -> {
        //             // Handle item2 click
        //             true
        //         }
        //         else -> false
        //     }
        // }

