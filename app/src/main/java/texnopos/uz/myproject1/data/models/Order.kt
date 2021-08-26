package texnopos.uz.myproject1.data.models

import android.provider.Settings
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.Security

@Entity(tableName = "History")
class Order(
    @PrimaryKey
    var id: Int = 0,
    var tableId: Int,
    var startedDate: String,
    var finishedDate: String,
    @ColumnInfo(name = "price")
    var totalPrice: Long,
    var status: Int = STATUS_OPEN
) {
    companion object {
        const val STATUS_OPEN = 1
        const val STATUS_CLOSED = 2
    }
}