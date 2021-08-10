package texnopos.uz.myproject1.DataMenu.DataCategory
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Category")
class Category (
    @PrimaryKey
    var id: Int = 0,
    @ColumnInfo(name = "name")
    var categoryName : String
    )
//ctrl+shift+esc