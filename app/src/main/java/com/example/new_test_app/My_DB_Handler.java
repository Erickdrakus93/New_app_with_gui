package com.example.new_test_app;
// This is the libraries in the source code as we can see in the next main //
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.Cursor;

import java.nio.file.FileAlreadyExistsException;


public class My_db_handler extends SQLiteOpenHelper {
    // Information of the database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Person.db";
    public static final String TABLE_NAME = "Person";
    public static final String COLUMN_ID = "Person_ID";
    public static final String COLUMN_NAME = "Person_name";

    //Init the data_base in the constructor
    public My_db_handler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

    }
}
