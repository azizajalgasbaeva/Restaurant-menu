package texnopos.uz.myproject1.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Foods")
class Food (
    @PrimaryKey
    var id : Int=0,
    @ColumnInfo(name = "name")
    var foodName : String,
    var structure: String?,
    var price : Int,
    var imageURL : String,
    var have : Int,
    var categoryId : Int,
    var count : Int
    )