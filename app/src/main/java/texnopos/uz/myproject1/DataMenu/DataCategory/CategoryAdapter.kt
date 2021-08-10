package texnopos.uz.myproject1.DataMenu.DataCategory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import texnopos.uz.myproject1.R
class CategoryAdapter : RecyclerView.Adapter<CategoryViewHolder>() {
    var categories : List<Category> = listOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
       holder.populateModel(categories[position])
    }

    override fun getItemCount()=categories.size
}