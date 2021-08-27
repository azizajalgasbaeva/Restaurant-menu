package texnopos.uz.myproject1.ui.food

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_food.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.MyDataBase

class FoodFragment : Fragment(R.layout.fragment_food) {

    private val args: FoodFragmentArgs by navArgs()

    private var foodAdapter = FoodAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        foodRecyclerView.adapter = foodAdapter
        setData()


    }

    private fun setData() {
        val foodDao = MyDataBase.getInstance(requireActivity()).dao()
        foodAdapter.foods = foodDao.getFoods(args.categoyId)

    }
}