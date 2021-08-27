package texnopos.uz.myproject1.ui.table

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_table.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.MyDataBase
import texnopos.uz.myproject1.data.models.Order

class TableFragment : Fragment(R.layout.fragment_table) {

    private var tableAdapter = TablesAdapter()
    private lateinit var navController: NavController


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        tablesrecyclerview.adapter = tableAdapter
        setData()

        tableAdapter.setOnTableClickListener {
            val tableDao = MyDataBase.getInstance(requireActivity()).dao()
            var orders=tableDao.getAllOrder()
            for (i in orders){
                if((i.tableId==it.id && i.status==0)|| orders.size==0){
                    val action=TableFragmentDirections.actionTableFragmentToClosedTable(it.name)
                    navController.navigate(action)
                }
                else if (i.tableId==it.id && i.status==1){
                    val action=TableFragmentDirections.actionTableFragmentToClosedTable(it.name)
                    navController.navigate(action)
                }
            }
        }
    }

    private fun setData() {
        val tableDao = MyDataBase.getInstance(requireActivity()).dao()
        tableAdapter.tables = tableDao.getAllTables()
    }
}