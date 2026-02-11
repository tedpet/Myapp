// DO NOT EDIT.  Make changes to com.eltek.model.Security.java instead.
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
public abstract class _Security extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Security";

  // Attribute Keys
  public static final ERXKey<Boolean> CREATE_PERSON = new ERXKey<Boolean>("createPerson");
  public static final ERXKey<Boolean> CREATE_SUBSCRIPTION = new ERXKey<Boolean>("createSubscription");
  public static final ERXKey<Boolean> EDIT_PERSON = new ERXKey<Boolean>("editPerson");
  // Relationship Keys
  public static final ERXKey<com.eltek.model.Person> PERSONS = new ERXKey<com.eltek.model.Person>("persons");

  // Attributes
  public static final String CREATE_PERSON_KEY = CREATE_PERSON.key();
  public static final String CREATE_SUBSCRIPTION_KEY = CREATE_SUBSCRIPTION.key();
  public static final String EDIT_PERSON_KEY = EDIT_PERSON.key();
  // Relationships
  public static final String PERSONS_KEY = PERSONS.key();

  private static Logger LOG = Logger.getLogger(_Security.class);

  public com.eltek.model.Security localInstanceIn(EOEditingContext editingContext) {
    com.eltek.model.Security localInstance = (com.eltek.model.Security)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean createPerson() {
    return (Boolean) storedValueForKey(_Security.CREATE_PERSON_KEY);
  }

  public void setCreatePerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating createPerson from " + createPerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CREATE_PERSON_KEY);
  }

  public Boolean createSubscription() {
    return (Boolean) storedValueForKey(_Security.CREATE_SUBSCRIPTION_KEY);
  }

  public void setCreateSubscription(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating createSubscription from " + createSubscription() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CREATE_SUBSCRIPTION_KEY);
  }

  public Boolean editPerson() {
    return (Boolean) storedValueForKey(_Security.EDIT_PERSON_KEY);
  }

  public void setEditPerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating editPerson from " + editPerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.EDIT_PERSON_KEY);
  }

  public NSArray<com.eltek.model.Person> persons() {
    return (NSArray<com.eltek.model.Person>)storedValueForKey(_Security.PERSONS_KEY);
  }

  public NSArray<com.eltek.model.Person> persons(EOQualifier qualifier) {
    return persons(qualifier, null, false);
  }

  public NSArray<com.eltek.model.Person> persons(EOQualifier qualifier, boolean fetch) {
    return persons(qualifier, null, fetch);
  }

  public NSArray<com.eltek.model.Person> persons(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.eltek.model.Person> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.eltek.model.Person.SECURITY_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.eltek.model.Person.fetchPersons(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = persons();
      if (qualifier != null) {
        results = (NSArray<com.eltek.model.Person>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.eltek.model.Person>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPersons(com.eltek.model.Person object) {
    includeObjectIntoPropertyWithKey(object, _Security.PERSONS_KEY);
  }

  public void removeFromPersons(com.eltek.model.Person object) {
    excludeObjectFromPropertyWithKey(object, _Security.PERSONS_KEY);
  }

  public void addToPersonsRelationship(com.eltek.model.Person object) {
    if (_Security.LOG.isDebugEnabled()) {
      _Security.LOG.debug("adding " + object + " to persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    }
  }

  public void removeFromPersonsRelationship(com.eltek.model.Person object) {
    if (_Security.LOG.isDebugEnabled()) {
      _Security.LOG.debug("removing " + object + " from persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    }
  }

  public com.eltek.model.Person createPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.eltek.model.Person.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Security.PERSONS_KEY);
    return (com.eltek.model.Person) eo;
  }

  public void deletePersonsRelationship(com.eltek.model.Person object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonsRelationships() {
    Enumeration<com.eltek.model.Person> objects = persons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonsRelationship(objects.nextElement());
    }
  }


  public static com.eltek.model.Security createSecurity(EOEditingContext editingContext, Boolean createPerson
, Boolean createSubscription
, Boolean editPerson
) {
    com.eltek.model.Security eo = (com.eltek.model.Security) EOUtilities.createAndInsertInstance(editingContext, _Security.ENTITY_NAME);    
		eo.setCreatePerson(createPerson);
		eo.setCreateSubscription(createSubscription);
		eo.setEditPerson(editPerson);
    return eo;
  }

  public static ERXFetchSpecification<com.eltek.model.Security> fetchSpec() {
    return new ERXFetchSpecification<com.eltek.model.Security>(_Security.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.eltek.model.Security> fetchAllSecurities(EOEditingContext editingContext) {
    return _Security.fetchAllSecurities(editingContext, null);
  }

  public static NSArray<com.eltek.model.Security> fetchAllSecurities(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Security.fetchSecurities(editingContext, null, sortOrderings);
  }

  public static NSArray<com.eltek.model.Security> fetchSecurities(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.eltek.model.Security> fetchSpec = new ERXFetchSpecification<com.eltek.model.Security>(_Security.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.eltek.model.Security> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.eltek.model.Security fetchSecurity(EOEditingContext editingContext, String keyName, Object value) {
    return _Security.fetchSecurity(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Security fetchSecurity(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.eltek.model.Security> eoObjects = _Security.fetchSecurities(editingContext, qualifier, null);
    com.eltek.model.Security eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Security that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Security fetchRequiredSecurity(EOEditingContext editingContext, String keyName, Object value) {
    return _Security.fetchRequiredSecurity(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Security fetchRequiredSecurity(EOEditingContext editingContext, EOQualifier qualifier) {
    com.eltek.model.Security eoObject = _Security.fetchSecurity(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Security that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Security localInstanceIn(EOEditingContext editingContext, com.eltek.model.Security eo) {
    com.eltek.model.Security localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
