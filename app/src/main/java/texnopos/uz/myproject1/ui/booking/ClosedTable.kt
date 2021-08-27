package texnopos.uz.myproject1.ui.booking

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_closed_table.*
import texnopos.uz.myproject1.R

class ClosedTable : Fragment(R.layout.fragment_closed_table) {
val safeArgs: OpenedTableArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvToolbarbook.text=safeArgs.tableName
    }
}