package texnopos.uz.myproject1.DataMenu.DataCategory

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_item.view.*

class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(category : Category){
        itemView.tvcategoryname.text=category.categoryName
    }
}