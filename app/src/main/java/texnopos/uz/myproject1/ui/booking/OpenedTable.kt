package texnopos.uz.myproject1.ui.booking

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_opened_table.*
import texnopos.uz.myproject1.R

class OpenedTable : Fragment(R.layout.fragment_opened_table) {
    private val safeArgs : OpenedTableArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvToolbarbook.text=safeArgs.tableName
        buttonaddorder.setOnClickListener {
            findNavController().navigate(R.id.action_openedTable_to_categoryFragment)
        }
    }
}