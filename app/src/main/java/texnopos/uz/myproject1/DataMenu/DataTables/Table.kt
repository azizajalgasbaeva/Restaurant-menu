package texnopos.uz.myproject1.DataMenu.DataTables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tables")
class Table(
     @PrimaryKey
     var id : Int,
     var name : String
 )
