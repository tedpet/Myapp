// DO NOT EDIT.  Make changes to com.eltek.model.Person.java instead.
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
public abstract class _Person extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Person";

  // Attribute Keys
  public static final ERXKey<String> FIRST_NAME = new ERXKey<String>("firstName");
  public static final ERXKey<String> LAST_NAME = new ERXKey<String>("lastName");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<Boolean> RETIRED = new ERXKey<Boolean>("retired");
  // Relationship Keys
  public static final ERXKey<com.eltek.model.Security> SECURITY = new ERXKey<com.eltek.model.Security>("security");
  public static final ERXKey<com.eltek.model.Subscription> SUBSCRIPTION = new ERXKey<com.eltek.model.Subscription>("subscription");

  // Attributes
  public static final String FIRST_NAME_KEY = FIRST_NAME.key();
  public static final String LAST_NAME_KEY = LAST_NAME.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String RETIRED_KEY = RETIRED.key();
  // Relationships
  public static final String SECURITY_KEY = SECURITY.key();
  public static final String SUBSCRIPTION_KEY = SUBSCRIPTION.key();

  private static Logger LOG = Logger.getLogger(_Person.class);

  public com.eltek.model.Person localInstanceIn(EOEditingContext editingContext) {
    com.eltek.model.Person localInstance = (com.eltek.model.Person)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String firstName() {
    return (String) storedValueForKey(_Person.FIRST_NAME_KEY);
  }

  public void setFirstName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating firstName from " + firstName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.FIRST_NAME_KEY);
  }

  public String lastName() {
    return (String) storedValueForKey(_Person.LAST_NAME_KEY);
  }

  public void setLastName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating lastName from " + lastName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LAST_NAME_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_Person.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LOGIN_KEY);
  }

  public Boolean retired() {
    return (Boolean) storedValueForKey(_Person.RETIRED_KEY);
  }

  public void setRetired(Boolean value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating retired from " + retired() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.RETIRED_KEY);
  }

  public com.eltek.model.Security security() {
    return (com.eltek.model.Security)storedValueForKey(_Person.SECURITY_KEY);
  }
  
  public void setSecurity(com.eltek.model.Security value) {
    takeStoredValueForKey(value, _Person.SECURITY_KEY);
  }

  public void setSecurityRelationship(com.eltek.model.Security value) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("updating security from " + security() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setSecurity(value);
    }
    else if (value == null) {
    	com.eltek.model.Security oldValue = security();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Person.SECURITY_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Person.SECURITY_KEY);
    }
  }
  
  public com.eltek.model.Subscription subscription() {
    return (com.eltek.model.Subscription)storedValueForKey(_Person.SUBSCRIPTION_KEY);
  }
  
  public void setSubscription(com.eltek.model.Subscription value) {
    takeStoredValueForKey(value, _Person.SUBSCRIPTION_KEY);
  }

  public void setSubscriptionRelationship(com.eltek.model.Subscription value) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("updating subscription from " + subscription() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setSubscription(value);
    }
    else if (value == null) {
    	com.eltek.model.Subscription oldValue = subscription();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Person.SUBSCRIPTION_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Person.SUBSCRIPTION_KEY);
    }
  }
  

  public static com.eltek.model.Person createPerson(EOEditingContext editingContext, String firstName
, String lastName
, String login
, Boolean retired
, com.eltek.model.Security security) {
    com.eltek.model.Person eo = (com.eltek.model.Person) EOUtilities.createAndInsertInstance(editingContext, _Person.ENTITY_NAME);    
		eo.setFirstName(firstName);
		eo.setLastName(lastName);
		eo.setLogin(login);
		eo.setRetired(retired);
    eo.setSecurityRelationship(security);
    return eo;
  }

  public static ERXFetchSpecification<com.eltek.model.Person> fetchSpec() {
    return new ERXFetchSpecification<com.eltek.model.Person>(_Person.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.eltek.model.Person> fetchAllPersons(EOEditingContext editingContext) {
    return _Person.fetchAllPersons(editingContext, null);
  }

  public static NSArray<com.eltek.model.Person> fetchAllPersons(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Person.fetchPersons(editingContext, null, sortOrderings);
  }

  public static NSArray<com.eltek.model.Person> fetchPersons(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.eltek.model.Person> fetchSpec = new ERXFetchSpecification<com.eltek.model.Person>(_Person.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.eltek.model.Person> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.eltek.model.Person fetchPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Person fetchPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.eltek.model.Person> eoObjects = _Person.fetchPersons(editingContext, qualifier, null);
    com.eltek.model.Person eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Person fetchRequiredPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchRequiredPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Person fetchRequiredPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    com.eltek.model.Person eoObject = _Person.fetchPerson(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Person localInstanceIn(EOEditingContext editingContext, com.eltek.model.Person eo) {
    com.eltek.model.Person localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
