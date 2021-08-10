package texnopos.uz.myproject1.DataMenu

import androidx.room.Dao
import androidx.room.Query
import texnopos.uz.myproject1.DataMenu.DataCategory.Category
import texnopos.uz.myproject1.DataMenu.DataTables.Table

@Dao
interface MyDao {
@Query("SELECT * FROM Tables")
fun getAllTables() : List<Table>
//@Query("SELECT * FROM Category")
//fun getAllCategory() : List<Category>

}