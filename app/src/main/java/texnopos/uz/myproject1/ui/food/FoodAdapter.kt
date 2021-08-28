package texnopos.uz.myproject1.ui.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.food_item.view.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.models.Food

class FoodAdapter : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    var foods: List<Food> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateModel(food: Food) {
            var count = 0
            itemView.tvfoodname.text = food.foodName
            var imageFoodResName = "food${food.id}"
            Glide
                .with(itemView.context)
                .load(
                    itemView.context.resources.getIdentifier(
                        imageFoodResName,
                        "drawable",
                        itemView.context.packageName
                    )
                )
                .centerCrop()
                .into(itemView.ivfood)
            itemView.addButton.setOnClickListener {
                if (itemView.tvcount.text.isNotEmpty()) {
                    count++
                    itemView.tvcount.text = count.toString()
                    removeFood.invoke(food)
                } else {
                    count = 1
                    itemView.tvcount.text = count.toString()
                    addFood.invoke(food)
                }
            }
            itemView.removeButton.setOnClickListener {
                if (itemView.tvcount.text.isNotEmpty()) {
                    if (count > 0) {
                        count--
                        itemView.tvcount.text = count.toString()
                        removeFood.invoke(food)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.populateModel(foods[position])
    }

    override fun getItemCount() = foods.size

    private var addFood: (food: Food) -> Unit = {}
    fun addingFood(addFood: (food: Food) -> Unit) {
        this.addFood = addFood
    }

    private var removeFood: (food: Food) -> Unit = {}
    fun removingFood(removeFood: (food: Food) -> Unit) {
        this.removeFood = removeFood
    }
}