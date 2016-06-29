package org.greenrobot.greendao.daotest;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import org.greenrobot.greendao.daotest.JoinManyToDateEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "JOIN_MANY_TO_DATE_ENTITY".
*/
public class JoinManyToDateEntityDao extends AbstractDao<JoinManyToDateEntity, Long> {

    public static final String TABLENAME = "JOIN_MANY_TO_DATE_ENTITY";

    /**
     * Properties of entity JoinManyToDateEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IdToMany = new Property(1, Long.class, "idToMany", false, "ID_TO_MANY");
        public final static Property IdDate = new Property(2, Long.class, "idDate", false, "ID_DATE");
    };


    public JoinManyToDateEntityDao(DaoConfig config) {
        super(config);
    }
    
    public JoinManyToDateEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"JOIN_MANY_TO_DATE_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ID_TO_MANY\" INTEGER," + // 1: idToMany
                "\"ID_DATE\" INTEGER);"); // 2: idDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"JOIN_MANY_TO_DATE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected void bindValues(DatabaseStatement stmt, JoinManyToDateEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long idToMany = entity.getIdToMany();
        if (idToMany != null) {
            stmt.bindLong(2, idToMany);
        }
 
        Long idDate = entity.getIdDate();
        if (idDate != null) {
            stmt.bindLong(3, idDate);
        }
    }

    @Override
    protected void bindValues(SQLiteStatement stmt, JoinManyToDateEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long idToMany = entity.getIdToMany();
        if (idToMany != null) {
            stmt.bindLong(2, idToMany);
        }
 
        Long idDate = entity.getIdDate();
        if (idDate != null) {
            stmt.bindLong(3, idDate);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public JoinManyToDateEntity readEntity(Cursor cursor, int offset) {
        JoinManyToDateEntity entity = new JoinManyToDateEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // idToMany
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2) // idDate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, JoinManyToDateEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdToMany(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setIdDate(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(JoinManyToDateEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(JoinManyToDateEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
