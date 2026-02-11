// DO NOT EDIT.  Make changes to com.eltek.model.Subscription.java instead.
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
public abstract class _Subscription extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Subscription";

  // Attribute Keys
  public static final ERXKey<Boolean> AVAILABLE = new ERXKey<Boolean>("available");
  public static final ERXKey<String> CC_LAST_FOUR = new ERXKey<String>("ccLastFour");
  public static final ERXKey<String> LOGIN_PASSWORD = new ERXKey<String>("loginPassword");
  public static final ERXKey<NSTimestamp> SUBSCRIPTION_DATE = new ERXKey<NSTimestamp>("subscriptionDate");
  public static final ERXKey<String> SUBSCRIPTION_NAME = new ERXKey<String>("subscriptionName");
  public static final ERXKey<String> USER_NAME = new ERXKey<String>("userName");
  // Relationship Keys
  public static final ERXKey<com.eltek.model.Person> PERSONS = new ERXKey<com.eltek.model.Person>("persons");

  // Attributes
  public static final String AVAILABLE_KEY = AVAILABLE.key();
  public static final String CC_LAST_FOUR_KEY = CC_LAST_FOUR.key();
  public static final String LOGIN_PASSWORD_KEY = LOGIN_PASSWORD.key();
  public static final String SUBSCRIPTION_DATE_KEY = SUBSCRIPTION_DATE.key();
  public static final String SUBSCRIPTION_NAME_KEY = SUBSCRIPTION_NAME.key();
  public static final String USER_NAME_KEY = USER_NAME.key();
  // Relationships
  public static final String PERSONS_KEY = PERSONS.key();

  private static Logger LOG = Logger.getLogger(_Subscription.class);

  public com.eltek.model.Subscription localInstanceIn(EOEditingContext editingContext) {
    com.eltek.model.Subscription localInstance = (com.eltek.model.Subscription)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean available() {
    return (Boolean) storedValueForKey(_Subscription.AVAILABLE_KEY);
  }

  public void setAvailable(Boolean value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating available from " + available() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.AVAILABLE_KEY);
  }

  public String ccLastFour() {
    return (String) storedValueForKey(_Subscription.CC_LAST_FOUR_KEY);
  }

  public void setCcLastFour(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating ccLastFour from " + ccLastFour() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.CC_LAST_FOUR_KEY);
  }

  public String loginPassword() {
    return (String) storedValueForKey(_Subscription.LOGIN_PASSWORD_KEY);
  }

  public void setLoginPassword(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating loginPassword from " + loginPassword() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.LOGIN_PASSWORD_KEY);
  }

  public NSTimestamp subscriptionDate() {
    return (NSTimestamp) storedValueForKey(_Subscription.SUBSCRIPTION_DATE_KEY);
  }

  public void setSubscriptionDate(NSTimestamp value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating subscriptionDate from " + subscriptionDate() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.SUBSCRIPTION_DATE_KEY);
  }

  public String subscriptionName() {
    return (String) storedValueForKey(_Subscription.SUBSCRIPTION_NAME_KEY);
  }

  public void setSubscriptionName(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating subscriptionName from " + subscriptionName() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.SUBSCRIPTION_NAME_KEY);
  }

  public String userName() {
    return (String) storedValueForKey(_Subscription.USER_NAME_KEY);
  }

  public void setUserName(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating userName from " + userName() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.USER_NAME_KEY);
  }

  public NSArray<com.eltek.model.Person> persons() {
    return (NSArray<com.eltek.model.Person>)storedValueForKey(_Subscription.PERSONS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.eltek.model.Person.SUBSCRIPTION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _Subscription.PERSONS_KEY);
  }

  public void removeFromPersons(com.eltek.model.Person object) {
    excludeObjectFromPropertyWithKey(object, _Subscription.PERSONS_KEY);
  }

  public void addToPersonsRelationship(com.eltek.model.Person object) {
    if (_Subscription.LOG.isDebugEnabled()) {
      _Subscription.LOG.debug("adding " + object + " to persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Subscription.PERSONS_KEY);
    }
  }

  public void removeFromPersonsRelationship(com.eltek.model.Person object) {
    if (_Subscription.LOG.isDebugEnabled()) {
      _Subscription.LOG.debug("removing " + object + " from persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Subscription.PERSONS_KEY);
    }
  }

  public com.eltek.model.Person createPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.eltek.model.Person.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Subscription.PERSONS_KEY);
    return (com.eltek.model.Person) eo;
  }

  public void deletePersonsRelationship(com.eltek.model.Person object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Subscription.PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonsRelationships() {
    Enumeration<com.eltek.model.Person> objects = persons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonsRelationship(objects.nextElement());
    }
  }


  public static com.eltek.model.Subscription createSubscription(EOEditingContext editingContext, Boolean available
, String ccLastFour
, String subscriptionName
, String userName
) {
    com.eltek.model.Subscription eo = (com.eltek.model.Subscription) EOUtilities.createAndInsertInstance(editingContext, _Subscription.ENTITY_NAME);    
		eo.setAvailable(available);
		eo.setCcLastFour(ccLastFour);
		eo.setSubscriptionName(subscriptionName);
		eo.setUserName(userName);
    return eo;
  }

  public static ERXFetchSpecification<com.eltek.model.Subscription> fetchSpec() {
    return new ERXFetchSpecification<com.eltek.model.Subscription>(_Subscription.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.eltek.model.Subscription> fetchAllSubscriptions(EOEditingContext editingContext) {
    return _Subscription.fetchAllSubscriptions(editingContext, null);
  }

  public static NSArray<com.eltek.model.Subscription> fetchAllSubscriptions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Subscription.fetchSubscriptions(editingContext, null, sortOrderings);
  }

  public static NSArray<com.eltek.model.Subscription> fetchSubscriptions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.eltek.model.Subscription> fetchSpec = new ERXFetchSpecification<com.eltek.model.Subscription>(_Subscription.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.eltek.model.Subscription> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.eltek.model.Subscription fetchSubscription(EOEditingContext editingContext, String keyName, Object value) {
    return _Subscription.fetchSubscription(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Subscription fetchSubscription(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.eltek.model.Subscription> eoObjects = _Subscription.fetchSubscriptions(editingContext, qualifier, null);
    com.eltek.model.Subscription eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Subscription that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Subscription fetchRequiredSubscription(EOEditingContext editingContext, String keyName, Object value) {
    return _Subscription.fetchRequiredSubscription(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.eltek.model.Subscription fetchRequiredSubscription(EOEditingContext editingContext, EOQualifier qualifier) {
    com.eltek.model.Subscription eoObject = _Subscription.fetchSubscription(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Subscription that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.eltek.model.Subscription localInstanceIn(EOEditingContext editingContext, com.eltek.model.Subscription eo) {
    com.eltek.model.Subscription localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
