package texnopos.uz.myproject1.DataMenu

import androidx.fragment.app.FragmentActivity
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import texnopos.uz.myproject1.DataMenu.DataTables.Table

@Database(entities = [Table::class], version = 1)
abstract class MyDataBase : RoomDatabase() {
    companion object {
        lateinit var INSTANCE: MyDataBase
        fun getInstance(context: FragmentActivity): MyDataBase{
if(!::INSTANCE.isInitialized){
    INSTANCE=Room.databaseBuilder(
        context,
        MyDataBase::class.java, "Tables-database"
    )
        .allowMainThreadQueries()
        .createFromAsset("Menu.db")
        .build()

}
            return INSTANCE
        }
    }
    abstract fun tablesDao(): MyDao
    }