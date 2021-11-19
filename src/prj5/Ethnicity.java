package prj5;

import java.text.DecimalFormat;

/**
 * Creates the Ethnicity object
 * 
 * @author Nahom Kifetew(nahomk)
 * @author Nirish Chilakala
 * @author Anika Thatavarthy
 * @version 2021.11.17
 */

public class Ethnicity {

    // Field Variables
    private String name;
    private int numOfDeaths;
    private int numOfCases;
    private DecimalFormat df = new DecimalFormat("#0.#");

    /**
     * Class Constructor
     * 
     * @param name
     *            name of ethnicity
     * 
     * @param numOfDeaths
     *            number of deaths
     * @param numOfCases
     *            number of cases
     */
    public Ethnicity(String name, int numOfDeaths, int numOfCases) {
        this.name = name;
        this.numOfDeaths = numOfDeaths;
        this.numOfCases = numOfCases;
    }


    /**
     * Outputs the name of the ethnicity
     * 
     * @return String of name
     */
    public String getName() {
        return name;
    }


    /**
     * Outputs the total deaths of for that race
     * 
     * @return int of the number of deaths
     */
    public int getNumOfDeaths() {
        return numOfDeaths;
    }


    /**
     * Outputs the number of cases that race had
     * 
     * @return int of the number of cases for that race
     */
    public int getNumOfCases() {
        return numOfCases;
    }


    /**
     * Outputs the CFR for this race
     * 
     * @return double representing the percentage of deaths to number of cases
     */
    public double getCFR() {
        if (numOfCases == -1 || numOfDeaths == -1) {
            return -1;
        }
        return ((double)numOfDeaths / (double)numOfCases) * 100;
    }


    /**
     * Outputs a string representation of the ethnicity
     * 
     * @return String of the name of the race, number of cases and the CFR
     */
    @Override
    public String toString() {
        return name + ": " + numOfCases + " cases, " + df.format(getCFR())
            + "% CFR";
    }


    /**
     * Tests if two ethnicity objects are equals
     * 
     * @return true if equal and false if not
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass().equals(other.getClass())) {
            Ethnicity otherE = (Ethnicity)other;
            return this.getName().equals(otherE.getName()) && this
                .getNumOfCases() == otherE.getNumOfCases() && this
                    .getNumOfDeaths() == otherE.getNumOfDeaths();
        }
        return false;
    }
}
