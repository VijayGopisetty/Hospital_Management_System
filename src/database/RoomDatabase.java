package database;
import Models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<String, Room> roomDB;

    RoomDatabase(){
        this.roomDB=new HashMap<>();
    }

}
