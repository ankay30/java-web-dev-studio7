package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private String name;
    private String capacity;

    public CD(String name, String capacity) {
        super(name, capacity);
    }


    @Override
    public void spinDisc() {
        System.out.println("CDs spin at a rate of 500 rpm");
    }
}






