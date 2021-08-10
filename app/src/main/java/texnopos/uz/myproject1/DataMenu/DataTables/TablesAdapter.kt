package texnopos.uz.myproject1.DataMenu.DataTables

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import texnopos.uz.myproject1.R

class TablesAdapter : RecyclerView.Adapter<TablesViewHolder> (){
    var tables : List<Table> = listOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TablesViewHolder {
var itemView=LayoutInflater.from(parent.context).inflate(R.layout.tables_item, parent, false)
        return TablesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TablesViewHolder, position: Int) {
holder.populateModel(tables[position])
    }

    override fun getItemCount()=tables.size
}