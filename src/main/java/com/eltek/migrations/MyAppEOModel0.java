package com.eltek.migrations;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.jdbc.ERXSQLHelper.ColumnIndex;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationIndex;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXModelVersion;

public class MyAppEOModel0 extends ERXMigrationDatabase.Migration {
	@Override
	public NSArray<ERXModelVersion> modelDependencies() {
		return null;
	}
  
	@Override
	public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		// DO NOTHING
	}

	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		ERXMigrationTable personTable = database.newTableNamed("person");
		personTable.newLargeStringColumn("firstname", NOT_NULL);
		personTable.newIntegerColumn("id", NOT_NULL);
		personTable.newLargeStringColumn("lastname", NOT_NULL);
		personTable.create();
	 	personTable.setPrimaryKey("id");
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname) VALUES " +
	    		"('Lynn', 'Kokorsky')"); 
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname) VALUES " +
	    		"('Theodore', 'Petrosky')");
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname) VALUES " +
	    		"('Paul', 'Gurley')");

	 	
	}
}