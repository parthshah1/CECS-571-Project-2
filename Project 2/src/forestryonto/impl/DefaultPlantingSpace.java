package forestryonto.impl;

import forestryonto.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultPlantingSpace <br>
 * @version generated on Thu Mar 25 04:42:12 PKT 2021 by developer
 */
public class DefaultPlantingSpace extends WrappedIndividualImpl implements PlantingSpace {

    public DefaultPlantingSpace(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasBorough
     */
     
    public Collection<? extends Borough> getHasBorough() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBOROUGH,
                                               DefaultBorough.class);
    }

    public boolean hasHasBorough() {
	   return !getHasBorough().isEmpty();
    }

    public void addHasBorough(Borough newHasBorough) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBOROUGH,
                                       newHasBorough);
    }

    public void removeHasBorough(Borough oldHasBorough) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBOROUGH,
                                          oldHasBorough);
    }


    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasJurisdiction
     */
     
    public Collection<? extends Jurisdiction> getHasJurisdiction() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASJURISDICTION,
                                               DefaultJurisdiction.class);
    }

    public boolean hasHasJurisdiction() {
	   return !getHasJurisdiction().isEmpty();
    }

    public void addHasJurisdiction(Jurisdiction newHasJurisdiction) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASJURISDICTION,
                                       newHasJurisdiction);
    }

    public void removeHasJurisdiction(Jurisdiction oldHasJurisdiction) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASJURISDICTION,
                                          oldHasJurisdiction);
    }


    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasPark
     */
     
    public Collection<? extends Park> getHasPark() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASPARK,
                                               DefaultPark.class);
    }

    public boolean hasHasPark() {
	   return !getHasPark().isEmpty();
    }

    public void addHasPark(Park newHasPark) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASPARK,
                                       newHasPark);
    }

    public void removeHasPark(Park oldHasPark) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASPARK,
                                          oldHasPark);
    }


    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasSite
     */
     
    public Collection<? extends PSSite> getHasSite() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSITE,
                                               DefaultPSSite.class);
    }

    public boolean hasHasSite() {
	   return !getHasSite().isEmpty();
    }

    public void addHasSite(PSSite newHasSite) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSITE,
                                       newHasSite);
    }

    public void removeHasSite(PSSite oldHasSite) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSITE,
                                          oldHasSite);
    }


    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasStatus
     */
     
    public Collection<? extends PSStatus> getHasStatus() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSTATUS,
                                               DefaultPSStatus.class);
    }

    public boolean hasHasStatus() {
	   return !getHasStatus().isEmpty();
    }

    public void addHasStatus(PSStatus newHasStatus) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSTATUS,
                                       newHasStatus);
    }

    public void removeHasStatus(PSStatus oldHasStatus) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSTATUS,
                                          oldHasStatus);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasCommunityBoard
     */
     
    public Collection<? extends String> getHasCommunityBoard() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCOMMUNITYBOARD, String.class);
    }

    public boolean hasHasCommunityBoard() {
		return !getHasCommunityBoard().isEmpty();
    }

    public void addHasCommunityBoard(String newHasCommunityBoard) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCOMMUNITYBOARD, newHasCommunityBoard);
    }

    public void removeHasCommunityBoard(String oldHasCommunityBoard) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCOMMUNITYBOARD, oldHasCommunityBoard);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasCreatedDate
     */
     
    public Collection<? extends String> getHasCreatedDate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCREATEDDATE, String.class);
    }

    public boolean hasHasCreatedDate() {
		return !getHasCreatedDate().isEmpty();
    }

    public void addHasCreatedDate(String newHasCreatedDate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCREATEDDATE, newHasCreatedDate);
    }

    public void removeHasCreatedDate(String oldHasCreatedDate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCREATEDDATE, oldHasCreatedDate);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasGeometry
     */
     
    public Collection<? extends String> getHasGeometry() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASGEOMETRY, String.class);
    }

    public boolean hasHasGeometry() {
		return !getHasGeometry().isEmpty();
    }

    public void addHasGeometry(String newHasGeometry) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASGEOMETRY, newHasGeometry);
    }

    public void removeHasGeometry(String oldHasGeometry) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASGEOMETRY, oldHasGeometry);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasLocation
     */
     
    public Collection<? extends String> getHasLocation() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLOCATION, String.class);
    }

    public boolean hasHasLocation() {
		return !getHasLocation().isEmpty();
    }

    public void addHasLocation(String newHasLocation) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLOCATION, newHasLocation);
    }

    public void removeHasLocation(String oldHasLocation) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLOCATION, oldHasLocation);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasName
     */
     
    public Collection<? extends String> getHasName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, String.class);
    }

    public boolean hasHasName() {
		return !getHasName().isEmpty();
    }

    public void addHasName(String newHasName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, newHasName);
    }

    public void removeHasName(String oldHasName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, oldHasName);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasObjectID
     */
     
    public Collection<? extends String> getHasObjectID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASOBJECTID, String.class);
    }

    public boolean hasHasObjectID() {
		return !getHasObjectID().isEmpty();
    }

    public void addHasObjectID(String newHasObjectID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASOBJECTID, newHasObjectID);
    }

    public void removeHasObjectID(String oldHasObjectID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASOBJECTID, oldHasObjectID);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasUpdatedDate
     */
     
    public Collection<? extends String> getHasUpdatedDate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASUPDATEDDATE, String.class);
    }

    public boolean hasHasUpdatedDate() {
		return !getHasUpdatedDate().isEmpty();
    }

    public void addHasUpdatedDate(String newHasUpdatedDate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASUPDATEDDATE, newHasUpdatedDate);
    }

    public void removeHasUpdatedDate(String oldHasUpdatedDate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASUPDATEDDATE, oldHasUpdatedDate);
    }


}
