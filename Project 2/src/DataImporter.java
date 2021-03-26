import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import forestryonto.Borough;
import forestryonto.ForestryOnto;
import forestryonto.Jurisdiction;
import forestryonto.PSSite;
import forestryonto.PSStatus;
import forestryonto.Park;
import forestryonto.ParkZone;
import forestryonto.PlantingSpace;
import forestryonto.Sanctuary;
import forestryonto.Street;


public class DataImporter {

	OWLOntologyManager onto_manager;
	OWLOntology ont;

	public static String ontology;
	public static String ontology_with_data;
	ForestryOnto factory;
	private static String dataset;
	private static String opt;
	private static String context_path;

	public DataImporter() { // dateset: name of the dataset, opt: can be real or fake
		try {

			ontology = "data/ForestryPlanting.owl";
			ontology_with_data = "data/ForestryPlantingWithData.owl";
			onto_manager = OWLManager.createOWLOntologyManager();

			File ontFile = new File(ontology);
			IRI iri = IRI.create(ontFile);
			ont = onto_manager.loadOntologyFromOntologyDocument(iri);
			factory = new ForestryOnto(ont);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// populate ontology from the first dataset
	public void propulateOntoFromDataset() throws IOException {
		String file = "data/Forestry_Planting_Spaces.csv";

		Reader reader = Files.newBufferedReader(Paths.get(file), StandardCharsets.ISO_8859_1);
		CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);		
		try {

			for (CSVRecord csvRecord : csvParser) {
				
				System.out.println(csvRecord.get(0));
				System.out.println();
				String time = System.nanoTime()+"";
				
				String planting_space =  clean(csvRecord.get(1)); // corresponding column in csv: planting_space
				factory.createPlantingSpace(time);
				PlantingSpace plantingSpace = factory.getPlantingSpace(time);
				plantingSpace.addHasObjectID(csvRecord.get(0));
				plantingSpace.addHasCreatedDate(csvRecord.get(23));
				plantingSpace.addHasUpdatedDate(csvRecord.get(24));
				plantingSpace.addHasGeometry(csvRecord.get(21));
				plantingSpace.addHasLocation(csvRecord.get(34));
				plantingSpace.addHasCommunityBoard(csvRecord.get(12));
				
				String street =  clean(csvRecord.get(3)); // corresponding column in csv: Street
				factory.createStreet(street);
				Street street_ = factory.getStreet(street);				
				
				String borough =  clean(csvRecord.get(1)); // corresponding column in csv: Borough
				factory.createBorough(borough);
				Borough borough_ = factory.getBorough(borough);
				borough_.addHasStreet(street_);
				plantingSpace.addHasBorough(borough_);
				
				String park =  clean(csvRecord.get(8)); // corresponding column in csv: Park
				factory.createPark(park);
				Park park_ = factory.getPark(park);
				park_.addHasName(csvRecord.get(8));

				String park_zone =  clean(csvRecord.get(9)); // corresponding column in csv: parkZone
				factory.createParkZone(park_zone);
				ParkZone parkZone = factory.getParkZone(park_zone);
				
				park_.addHasZone(parkZone);
				
				plantingSpace.addHasPark(park_);
				
				
				String jurisdiction =  clean(csvRecord.get(25)); // corresponding column in csv: jurisdiction
				factory.createJurisdiction(jurisdiction);
				Jurisdiction jurisdictin_ = factory.getJurisdiction(jurisdiction);
				plantingSpace.addHasJurisdiction(jurisdictin_);
				
				String ps_site =  clean(csvRecord.get(4)); // corresponding column in csv: PSSite
				factory.createPSSite(ps_site);
				PSSite pSSite = factory.getPSSite(ps_site);
				plantingSpace.addHasSite(pSSite);
				
				String ps_status =  clean(csvRecord.get(20)); // corresponding column in csv: PSStatus
				factory.createPSStatus(ps_status);
				PSStatus pSStatus = factory.getPSStatus(ps_status);
				plantingSpace.addHasStatus(pSStatus);
				

				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

	}

	
	// populate ontology from the second dataset
	public void propulateOntoFromDataset2() throws IOException {
		String file = "data/DPR_naturepreserves_001.csv";

		Reader reader = Files.newBufferedReader(Paths.get(file), StandardCharsets.ISO_8859_1);
		CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);		
		try {

			for (CSVRecord csvRecord : csvParser) {
				String park =  clean(csvRecord.get(0)); // corresponding column in csv: Park
				factory.createPark(park);
				Park park_ = factory.getPark(park);
				park_.addHasName(csvRecord.get(0));
				park_.addHasAcres(csvRecord.get(3));
				park_.addHasDirection(csvRecord.get(4));
				
				String borough =  clean(csvRecord.get(2)); // corresponding column in csv: Borough
				factory.createBorough(borough);
				Borough borough_ = factory.getBorough(borough);
				park_.addHasBorough(borough_);
				
				if(!csvRecord.get(1).equals("")) {
					
					 String sanctuary = clean(csvRecord.get(1)); // corresponding column in csv:
					 Sanctuary sanctuary_ = factory.createSanctuary(sanctuary);
					 park_.addHasSanctuary(sanctuary_);
					 
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	

	
	// replace any unessaccary symbols in the strings, and return it, that can be use in the uri
	private String clean(String str) {
		String value = str.replaceAll(",", "");
		value = value.replaceAll("\"", "");
		value = value.replace("#", "_");
		value = value.replaceAll(" ", "_");
		value = value.replaceAll(";", "");
		value = value.replaceAll("\n", "");
		value = value.replaceAll("\r", "");
		value = value.replaceAll("\t", "");
		value = value.replaceAll("\\+|%", "");
		return value;
	}
	public void save() {

		try {

			File file = new File(ontology_with_data);
			onto_manager.saveOntology(ont, IRI.create(file.toURI()));
			System.out.println("Saved ontology: " + ont);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String args[]) {

		DataImporter dimport = new DataImporter();
		try {
			dimport.propulateOntoFromDataset();
			dimport.propulateOntoFromDataset2();
			dimport.save();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}



}
