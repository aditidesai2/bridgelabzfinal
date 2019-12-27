package com.bridgeLabz.objectOriented.clinic;

/**
 * This Interface has certain unimplemented functionality.
 * 
 * @author Aditi Desai
 * @created 219-12-19
 * @version 1.8
 */
public interface ICliniqueService {
	/**
	 * UnImplemented functionality of adding a doctor
	 */
	public void addDoctor();

	/**
	 * UnImplemented functionality of reading patient directory and searching
	 * Particular patient.
	 * 
	 * @param key
	 * @param value
	 */
	public void readPatientDetails(String key, String value);

	/**
	 * This function has Unimplemented functionality which takes Doctor key and
	 * parameter value as String input parameter and search particular doctor and
	 * book appointment of the searching person
	 * 
	 * @param key   as String input parameter
	 * @param value as String input parameter
	 * @return 
	 */
	public String searchDoctorBookAppointment(String key, String value);

	/**
	 * Unimplemented functionality of displaying all doctors associated with the
	 * hospital
	 */
	public void printDoctorList();

	/**
	 * Unimplemented functionality of displaying all patients associated with the
	 * hospital
	 */
	public void printPatientList();

}