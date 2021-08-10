package texnopos.uz.myproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*
import texnopos.uz.myproject1.DataMenu.DataTables.Table
import texnopos.uz.myproject1.DataMenu.DataTables.TablesAdapter
import texnopos.uz.myproject1.DataMenu.MyDataBase

class MainActivity : AppCompatActivity() {
    private var tableAdapter = TablesAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.mainfragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
    }
}