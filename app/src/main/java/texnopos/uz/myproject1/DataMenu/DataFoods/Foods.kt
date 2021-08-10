package texnopos.uz.myproject1.DataMenu.DataFoods

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Foods")
class Foods (
    @PrimaryKey
    var id : Int=0,
    @ColumnInfo(name = "Name")
    var foodName : String,
    var structure: String,
    var price : Int,
    var imageUrl : String,
    var have : Int,
    var categoryId : Int
    )