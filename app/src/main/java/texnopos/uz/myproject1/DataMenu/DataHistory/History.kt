package texnopos.uz.myproject1.DataMenu.DataHistory

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "History")
class History (
@PrimaryKey
var id: Int=0,
var tableId: Int,
var startedDate:String,
var finishedDate: String,
@ColumnInfo(name = "price")
var totalPrice: Int,
var status: Int
        )