package texnopos.uz.myproject1.DataMenu.DataHistory

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Order_Item")
class OrderItem(
    @PrimaryKey
    var id: Int = 0,
    var foodId: Int,
    var count: Int
)