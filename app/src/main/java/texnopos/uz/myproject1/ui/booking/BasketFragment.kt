package texnopos.uz.myproject1.ui.booking

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.models.Food
import texnopos.uz.myproject1.ui.food.FoodAdapter

class BasketFragment() :Fragment(R.layout.fragment_basket) {
        var mutableFood: MutableList<Food> = mutableListOf()
        private var foodAdapter=FoodAdapter()
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                foodAdapter.addingFood {
                        for(i in mutableFood){
                                if (i.foodName==it.foodName){
                                }
                        }
                }
                foodAdapter.removingFood {

                }
        }

}