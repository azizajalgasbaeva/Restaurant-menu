package texnopos.uz.myproject1.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.category_item.view.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.models.Category

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    var categories: List<Category> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateModel(category: Category) {
            itemView.tvcategoryname.text = category.categoryName
            itemView.setOnClickListener {
                onCategoryClicked.invoke(category)
            }
            val imageResName = "category${category.id}"
            Glide
                .with(itemView.context)
                .load(
                    itemView.context.resources.getIdentifier(
                        imageResName,
                        "drawable",
                        itemView.context.packageName
                    )
                )
                .centerCrop()
                .into(itemView.ivcategory)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.populateModel(categories[position])
    }

    private var onCategoryClicked: (category: Category) -> Unit = {}
    fun setOnCategoryItemClicked(onCategoryClicked: (category: Category) -> Unit) {
        this.onCategoryClicked = onCategoryClicked
    }

    override fun getItemCount() = categories.size
}