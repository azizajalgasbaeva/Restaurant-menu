package texnopos.uz.myproject1.ui.category

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_category.*
import texnopos.uz.myproject1.R
import texnopos.uz.myproject1.data.MyDataBase

class CategoryFragment : Fragment(R.layout.fragment_category) {
    private var categoryAdapter = CategoryAdapter()
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        categoryrecyclerview.adapter = categoryAdapter
        setData()
        categoryAdapter.setOnCategoryItemClicked {
            val action = CategoryFragmentDirections.actionCategoryFragmentToFoodFragment(it.id)
            navController.navigate(action)
        }
    }

    private fun setData() {
        val categoryDao = MyDataBase.getInstance(requireActivity()).dao()
        categoryAdapter.categories = categoryDao.getAllCategory()
    }

}