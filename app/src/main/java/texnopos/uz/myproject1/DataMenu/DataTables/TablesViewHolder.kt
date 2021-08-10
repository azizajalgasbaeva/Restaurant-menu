package texnopos.uz.myproject1.DataMenu.DataTables

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tables_item.view.*

class TablesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
fun populateModel(table : Table){
itemView.tvtablename.text=table.name.toString()
}
}