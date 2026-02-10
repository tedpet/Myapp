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
		
		ERXMigrationTable clientTable = database.newTableNamed("client");
		clientTable.newLargeStringColumn("clientname", NOT_NULL);
		clientTable.newIntegerColumn("id", NOT_NULL);
		clientTable.newFlagBooleanColumn("retired", NOT_NULL);
		clientTable.create();
	 	clientTable.setPrimaryKey("id");

		ERXMigrationTable personTable = database.newTableNamed("person");
		personTable.newLargeStringColumn("firstname", NOT_NULL);
		personTable.newIntegerColumn("id", NOT_NULL);
		personTable.newLargeStringColumn("lastname", NOT_NULL);
		personTable.newFlagBooleanColumn("retired", NOT_NULL);
		personTable.create();
	 	personTable.setPrimaryKey("id");

	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired) VALUES " +
	    		"('Lynn', 'Kokorsky','false')"); 
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired) VALUES " +
	    		"('Theodore', 'Petrosky','false')");
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired) VALUES " +
	    		"('Paul', 'Gurley','false')");

	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO CLIENT " +
	    		"(clientname, retired) VALUES " +
	    		"('GBC','false')");
	 	
	}
}