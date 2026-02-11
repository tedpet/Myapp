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
		personTable.newLargeStringColumn("login", NOT_NULL);
		personTable.newFlagBooleanColumn("retired", NOT_NULL);
		personTable.newIntegerColumn("securityid", NOT_NULL);
		personTable.newIntegerColumn("subscriptionid", ALLOWS_NULL);
		personTable.create();
	 	personTable.setPrimaryKey("id");

		ERXMigrationTable securityTable = database.newTableNamed("security");
		securityTable.newFlagBooleanColumn("createperson", NOT_NULL);
		securityTable.newFlagBooleanColumn("createsubscription", NOT_NULL);
		securityTable.newFlagBooleanColumn("editperson", NOT_NULL);
		securityTable.newIntegerColumn("id", NOT_NULL);
		securityTable.create();
	 	securityTable.setPrimaryKey("id");

		ERXMigrationTable subscriptionTable = database.newTableNamed("subscription");
		subscriptionTable.newFlagBooleanColumn("available", NOT_NULL);
		subscriptionTable.newLargeStringColumn("cclastfour", NOT_NULL);
		subscriptionTable.newIntegerColumn("id", NOT_NULL);
		subscriptionTable.newLargeStringColumn("loginpassword", ALLOWS_NULL);
		subscriptionTable.newDateColumn("subscriptiondate", ALLOWS_NULL);
		subscriptionTable.newLargeStringColumn("subscriptionname", NOT_NULL);
		subscriptionTable.newLargeStringColumn("username", NOT_NULL);
		subscriptionTable.create();
	 	subscriptionTable.setPrimaryKey("id");

		personTable.addForeignKey("securityid", "security", "id");
		personTable.addForeignKey("subscriptionid", "subscription", "id");

		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO SECURITY " +
	    		"(createperson, createsubscription, editperson) VALUES " +
	    		"('TRUE','TRUE', 'TRUE')");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO SECURITY " +
	    		"(createperson, createsubscription, editperson) VALUES " +
	    		"('TRUE','TRUE', 'TRUE')");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO SECURITY " +
	    		"(createperson, createsubscription, editperson) VALUES " +
	    		"('TRUE','TRUE', 'TRUE')");
		
	
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired, securityid, login) VALUES " +
	    		"('Lynn', 'Kokorsky','false','1','lynnk')"); 
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired, securityid, login) VALUES " +
	    		"('Theodore', 'Petrosky','false','2','tedpet')");
	 	
	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO PERSON " +
	    		"(firstname, lastname, retired, securityid) VALUES " +
	    		"('Paul', 'Gurley','false','3','pgurl')");

	 	ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "INSERT INTO CLIENT " +
	    		"(clientname, retired) VALUES " +
	    		"('GBC','false')");
	 	
	}
}