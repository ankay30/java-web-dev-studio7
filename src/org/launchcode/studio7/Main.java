package org.launchcode.studio7;

public class Main {

        public static void main(String[] args){

            // TODO: Declare and initialize a CD and a DVD object.
            CD cd=new CD("Music album","700 MB");
            DVD dvd= new DVD("Movies,Videos","4.7 GB");

            // TODO: Call each CD and DVD method to verify that they work as expected.

            System.out.println("\n\nCD CONTENTS\n"+cd.content());
            cd.spinDisc();
            System.out.println("\n\nDVD CONTENTS\n"+dvd.content());
            dvd.spinDisc();

        }
    }

