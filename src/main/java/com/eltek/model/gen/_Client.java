// DO NOT EDIT.  Make changes to com.eltek.model.Client.java instead.
package com.eltek.model.gen;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Client extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Client";

  // Attribute Keys
  public static final ERXKey<String> CLIENT_NAME = new ERXKey<String>("clientName");
  public static final ERXKey<Boolean> RETIRED = new ERXKey<Boolean>("retired");
  // Relationship Keys

  // Attributes
  public static final String CLIENT_NAME_KEY = CLIENT_NAME.key();
  public static final String RETIRED_KEY = RETIRED.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_Client.class);

  public com.eltek.model.Client localInstanceIn(EOEditingContext editingContext) {
    com.eltek.model.Client localInstance = (com.eltek.model.Client)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String clientName() {
    return (String) storedValueForKey(_Client.CLIENT_NAME_KEY);
  }

  public void setClientName(String value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating clientName from " + clientName() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.CLIENT_NAME_KEY);
  }

  public Boolean retired() {
    return (Boolean) storedValueForKey(_Client.RETIRED_KEY);
  }

  public void setRetired(Boolean value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating retired from " + retired() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.RETIRED_KEY);
  }


  public static com.eltek.model.Client createClient(EOEditingContext editingContext, String clientName
, Boolean retired
) {
    com.eltek.model.Client eo = (com.eltek.model.Client) EOUtilities.createAndInsertInstance(editingContext, _Client.ENTITY_NAME);    
		eo.setClientName(clientName);
		eo.setRetired(retired);
    return eo;
  }

  public static ERXFetchSpecification<com.eltek.model.Client> fetchSpec() {
    return new ERXFetchSpecification<com.eltek.model.Client>(_Client.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.eltek.model.Client> fetchAllClients(EOEditingContext editingContext) {
    return _Client.fetchAllClients(editingContext, null);
  }

  public static NSArray<com.eltek.model.Client> fetchAllClients(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Client.fetchClients(editingContext, null, sortOrderings);
  }

  public static NSArray<com.eltek.model.Client> fetchClients(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.eltek.model.Client> fetchSpec = new ERXFetchSpecification<com.eltek.model.Client>(_Client.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.eltek.model.Client> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.eltek.model.Client fetchClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Client fetchClient(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.eltek.model.Client> eoObjects = _Client.fetchClients(editingContext, qualifier, null);
    com.eltek.model.Client eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Client fetchRequiredClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchRequiredClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Client fetchRequiredClient(EOEditingContext editingContext, EOQualifier qualifier) {
    com.eltek.model.Client eoObject = _Client.fetchClient(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Client localInstanceIn(EOEditingContext editingContext, com.eltek.model.Client eo) {
    com.eltek.model.Client localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
