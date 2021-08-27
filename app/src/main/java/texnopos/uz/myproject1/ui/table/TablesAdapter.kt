package texnopos.uz.myproject1.ui.table

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tables_item.view.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.models.Table

class TablesAdapter : RecyclerView.Adapter<TablesAdapter.TablesViewHolder>() {


    var tables: List<Table> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class TablesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateModel(table: Table) {
            itemView.tvtablename.text = table.name
           itemView.setOnClickListener {
               setOnTableItemClicked.invoke(table)
           }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TablesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.tables_item, parent, false)
        return TablesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TablesViewHolder, position: Int) {
        holder.populateModel(tables[position])
    }

    override fun getItemCount() = tables.size

    private var setOnTableItemClicked : (table: Table) -> Unit={table->}

    fun setOnTableClickListener(setOnTableItemClicked: (table: Table)-> Unit){
      this.setOnTableItemClicked=setOnTableItemClicked
    }
}