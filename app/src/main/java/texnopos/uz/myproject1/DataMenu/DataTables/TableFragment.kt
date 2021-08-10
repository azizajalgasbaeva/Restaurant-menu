package texnopos.uz.myproject1.DataMenu.DataTables

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.table_fragment.*
import texnopos.uz.myproject1.DataMenu.MyDataBase
import texnopos.uz.myproject1.R

class TableFragment : Fragment(R.layout.table_fragment) {
    private var tableAdapter = TablesAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       tablesrecyclerview.adapter=tableAdapter
        setData()

    }
    private fun setData() {
        var tableDao = MyDataBase.getInstance(requireActivity()).tablesDao()
        tableAdapter.tables = tableDao.getAllTables()
    }
}