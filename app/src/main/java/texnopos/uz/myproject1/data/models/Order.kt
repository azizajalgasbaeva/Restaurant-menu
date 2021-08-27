package texnopos.uz.myproject1.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order")
class Order(
    @PrimaryKey
    var id: Int = 0,
    var tableId: Int,
    var startedDate: String,
    var finishedDate: String?,
    var price: Int,
    var status: Int= CLOSED
){
    companion object{
        const val OPENED=1
        const val CLOSED=0
    }
}