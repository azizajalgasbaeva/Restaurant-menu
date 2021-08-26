package texnopos.uz.myproject1.data

import androidx.room.Dao
import androidx.room.Query
import texnopos.uz.myproject1.data.models.Category
import texnopos.uz.myproject1.data.models.Food
import texnopos.uz.myproject1.data.models.Table

@Dao
interface MyDao {
    @Query("SELECT * FROM Tables")
    fun getAllTables(): List<Table>

    @Query("SELECT * FROM Category")
    fun getAllCategory(): List<Category>

    @Query("SELECT * FROM Foods WHERE categoryId = :id ")
    fun getFoods(id : Int) : List<Food>

}