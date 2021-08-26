package texnopos.uz.myproject1.ui.booking

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_booking.*
import texnopos.uz.myproject1.R

class BookingFragment : Fragment(R.layout.fragment_booking) {

    private val safeArgs: BookingFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvToolbarbook.text = safeArgs.tableName
    }

}