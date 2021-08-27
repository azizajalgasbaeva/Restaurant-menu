package texnopos.uz.myproject1.data

import android.content.Context
import androidx.room.Database
import androidx.room.FtsOptions
import androidx.room.Room
import androidx.room.RoomDatabase
import texnopos.uz.myproject1.data.models.*

@Database(entities = [Table::class, Category::class, Food::class, Order::class, OrderItem::class], version = 3)
abstract class MyDataBase : RoomDatabase() {
    companion object {
        lateinit var INSTANCE: MyDataBase
        fun getInstance(context: Context): MyDataBase {
            if (!Companion::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(
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

    abstract fun dao(): MyDao
}