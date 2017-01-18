package com.example.vicky.courtside;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.database.Cursor;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.vicky.courtside.R.id.pass;

public class DataManager {
    private SQLiteDatabase db;
    private SQLiteDatabase dm;
    public static final String TABLE_ROW_NAME = "name";
    public static final String TABLE_ROW_EMAIL = "email";
    public static final String TABLE_ROW_PASSWRD = "passwrd";
    public static final String TABLE_ROW_PHNO = "phno";


    private static final String DB_NAME = "courtside";
    private static final int DB_VERSION = 1;
    private static final String TABLE_N_AND_A = "custloggin";
    private static final String TABLE_B_AND_K = "booking";

    private static final String TABLE_L_AND_P = "letsplay";
    private static final String TABLE_P_AND_P = "powerplay";
    private static final String TABLE_M_AND_D = "matchday";
    private static final String TABLE_X_AND_L = "xlr8";

    private static final String TABLE_E_AND_S = "enlive";
    private static final String TABLE_C_AND_S = "chinnaswamy";
    private static final String TABLE_M_AND_S = "msground";
    private static final String TABLE_U_AND_S = "unitedsport";

    private static final String TABLE_A_AND_R = "argon";
    private static final String TABLE_F_AND_T = "feathertouch";
    private static final String TABLE_J_AND_P = "justplay";
    private static final String TABLE_P_AND_M = "playmania";

    private static final String TABLE_B_AND_D = "bulldog";
    private static final String TABLE_K_AND_A = "kinesis";
    private static final String TABLE_N_AND_O = "noahacadmey";
    private static final String TABLE_T_AND_P = "topspin";

    public static final String TABLE_ROW_BKID = "bk_id";
    public static final String TABLE_ROW_CNAME = "name";
    public static final String TABLE_ROW_DATE = "date";
    public static final String TABLE_ROW_PHONE = "phone";
    public static final String TABLE_ROW_SLOT = "slot";
    public static final String TABLE_ROW_COURT = "court";
    public static final String TABLE_ROW_PRICE = "price";

    public DataManager(Context context) {
        // Create an instance of our internal CustomSQLiteOpenHelper class



        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);

        // Get a writable database
        db = helper.getWritableDatabase();
       dm=helper.getReadableDatabase();
    }
    // Insert a record
    public void insert(String name, String email, String pass, String phno){

        // Add all the details to the table

        String query = "INSERT INTO " + TABLE_N_AND_A + " (" +
                TABLE_ROW_NAME + ", " +
                TABLE_ROW_EMAIL +","+TABLE_ROW_PASSWRD+","+TABLE_ROW_PHNO+
                ") " +
                "VALUES (" +
                "'" + name + "'" + ", " +
                "'" + email + "'" +", " +
                "'" + pass + "'" +", " +
                "'" + phno + "'" +
                ");";

        Log.i("insert() = ", query);

        db.execSQL(query);


    }


    public void insertbook( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_B_AND_K+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertlp( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_L_AND_P+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertpp( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_P_AND_P+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }


    public void insertmd( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_M_AND_D+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertxl( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_X_AND_L+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void inserten( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_E_AND_S+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertcn( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_C_AND_S+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertms( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_M_AND_S+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertus( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_U_AND_S+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertar( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_A_AND_R+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertft( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_F_AND_T+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertjp( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_J_AND_P+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertpm( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_P_AND_M+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertbd( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_B_AND_D+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertka( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_K_AND_A+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void insertno( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_N_AND_O+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }

    public void inserttp( String sport, String court,String name, String phno,String slot,String date,String price){

        // Add all the details to the table


        String query = "INSERT INTO " +TABLE_T_AND_P+ " (" +
                TABLE_ROW_BKID  + ", "+
                TABLE_ROW_COURT + ", "+
                TABLE_ROW_CNAME + ", " +
                TABLE_ROW_PHONE + ", " +
                TABLE_ROW_PRICE + ", " +
                TABLE_ROW_SLOT + "," +
                TABLE_ROW_DATE+
                ") " +
                "VALUES (" +"'"+ sport+"'"+","+
                "'"+court+"'"+","+
                "'" + name + "'" + ", " +
                "'" + phno + "'" +", " +
                "'" + price + "'" +", " +
                "'" + slot + "'" +", " +
                "'" + date + "'" +
                ");";

        Log.i("insert() = ", query);

        dm.execSQL(query);


    }


    public Boolean delete(String bkid,String phn)throws SQLException
    {

        boolean exists;
        Cursor cursor = db.rawQuery("select 1 from "+TABLE_B_AND_K+" where "+TABLE_ROW_BKID+"=? and "+TABLE_ROW_PHONE+"=?",
                new String[] { bkid,phn });

      //  boolean exists = c.moveToFirst();
        //c.close();

        if( exists = (cursor.getCount() > 0))
        {
           // Cursor c = dm.rawQuery("DELETE  FROM "+TABLE_B_AND_K+" WHERE "+TABLE_ROW_BKID+"=?", new String[] {bkid});
            db.execSQL("delete from "+TABLE_B_AND_K+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");
            cursor.close();
            return exists;
        }
        else {
            cursor.close();
            return false;
        }


    }

    public void deletelp(String bkid,String phn)throws SQLException
    {

            db.execSQL("delete from "+TABLE_L_AND_P+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean dellp(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_L_AND_P+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletepp(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_P_AND_P+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delpp(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_P_AND_P+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletemd(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_P_AND_P+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delmd(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_P_AND_P+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletexl(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_X_AND_L+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delxl(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_X_AND_L+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletear(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_A_AND_R+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delar(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_A_AND_R+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deleteft(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_F_AND_T+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delft(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_F_AND_T+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletejp(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_J_AND_P+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean deljp(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_J_AND_P+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletepm(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_P_AND_M+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delpm(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_P_AND_M+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deleteen(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_E_AND_S+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delen(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_E_AND_S+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletecs(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_C_AND_S+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delcs(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_C_AND_S+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletems(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_M_AND_S+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delms(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_M_AND_S+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deleteus(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_U_AND_S+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delus(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_U_AND_S+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deletebd(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_B_AND_D+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delbd(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_B_AND_D+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deleteks(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_K_AND_A+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delks(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_K_AND_A+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public void deleteno(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_N_AND_O+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delno(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_N_AND_O+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }
    public void deletets(String bkid,String phn)throws SQLException
    {

        db.execSQL("delete from "+TABLE_T_AND_P+" where "+TABLE_ROW_BKID+" ='"+bkid+"'");

    }

    public boolean delts(String bk,String ph)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_T_AND_P+" WHERE "+TABLE_ROW_BKID+"=? AND "+TABLE_ROW_PHONE+"=?", new String[] {bk,ph});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }





    public boolean lp(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_L_AND_P+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean pp(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_P_AND_P+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean md(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_M_AND_D+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean xl(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_X_AND_L+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean en(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_E_AND_S+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean cn(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_C_AND_S+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean ms(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_M_AND_S+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean us(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_U_AND_S+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean ar(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_A_AND_R+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean ft(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_F_AND_T+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean jp(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_J_AND_P+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean pm(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_P_AND_M+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean bd(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_B_AND_D+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean ka(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_K_AND_A+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean no(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_N_AND_O+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean tp(String sl,String date)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_T_AND_P+" WHERE "+TABLE_ROW_SLOT+"=? AND "+TABLE_ROW_DATE+"=?", new String[] {sl,date});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    public boolean valid(String usn,String pass)throws SQLException
    {

        Cursor c = dm.rawQuery("SELECT 1 FROM "+TABLE_N_AND_A+" WHERE "+TABLE_ROW_EMAIL+"=? AND "+TABLE_ROW_PASSWRD+"=?", new String[] {usn,pass});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }


    class CustomSQLiteOpenHelper extends SQLiteOpenHelper {
        public CustomSQLiteOpenHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        // This method only runs the first time the database is created
        @Override
        public void onCreate(SQLiteDatabase db) {

            // Create a table  and all their details
            String newTableQueryString = "create table "
                    + TABLE_N_AND_A + " ("
                    + TABLE_ROW_NAME
                    + " text not null,"
                    + TABLE_ROW_EMAIL
                    + " text not null,"
                    + TABLE_ROW_PASSWRD
                    + " text not null,"
                    + TABLE_ROW_PHNO +
                    "  text not null);";


            db.execSQL(newTableQueryString);

            String booking = "create table "
                    + TABLE_B_AND_K + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(booking);

            String letsplay = "create table "
                    + TABLE_L_AND_P + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(letsplay);

            String power = "create table "
                    + TABLE_P_AND_P + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(power);

            String matchday = "create table "
                    + TABLE_M_AND_D + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(matchday);

            String xlre = "create table "
                    + TABLE_X_AND_L + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(xlre);

            String enlive = "create table "
                    + TABLE_E_AND_S + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(enlive);

            String chinna = "create table "
                    + TABLE_C_AND_S + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(chinna);

            String ms = "create table "
                    + TABLE_M_AND_S + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(ms);

            String us = "create table "
                    + TABLE_U_AND_S + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(us);


            String ar = "create table "
                    + TABLE_A_AND_R + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(ar);


            String ft = "create table "
                    + TABLE_F_AND_T + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(ft);

            String jp = "create table "
                    + TABLE_J_AND_P + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(jp);

            String pm = "create table "
                    + TABLE_P_AND_M + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(pm);

            String bd = "create table "
                    + TABLE_B_AND_D + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(bd);

            String ka = "create table "
                    + TABLE_K_AND_A + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(ka);

            String no = "create table "
                    + TABLE_N_AND_O + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(no);

            String tp = "create table "
                    + TABLE_T_AND_P + " ("
                    + TABLE_ROW_BKID
                    + " text not null,"
                    + TABLE_ROW_COURT
                    + " text not null,"
                    + TABLE_ROW_CNAME
                    + " text not null,"
                    + TABLE_ROW_PRICE
                    + " text not null,"
                    + TABLE_ROW_PHONE +
                    "  text not null,"
                    + TABLE_ROW_SLOT
                    + " text not null,"
                    + TABLE_ROW_DATE
                    + " text not null);";


            db.execSQL(tp);


        }




        // This method only runs when we increment DB_VERSION
        // We will look at this in chapter 26
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        }


    }




}

